package May2026.Stackssss.Implementation;

import java.util.HashMap;

class LRUCache {
    class Node{
        int key;
        int value; // each node stores a key-value pair
        Node next; // pointers to previous and next node in DLL
        Node prev;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    //capacity of the chache
    int cap;  // maximum number of keys cache can hold
    //dummy nodes
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, - 1); // dummy head and tail nodes of DLL

    //hashmap to store the key value pair
    HashMap<Integer, Node> map = new HashMap<>(); // key -> node reference for O(1) lookup

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail; // head points to tail initially
        tail.prev = head; // tail points back to head initially
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1; // key not in cache, return -1
        Node node = map.get(key);       // fetch the node from map
        moveToFront(node); // mark as recently used
        return node.value; // return its value
    }

    private void moveToFront(Node node) {
        remove(node);                // detach node from its current position
        addToFront(node);            // reattach at the front (MRU side)
    }

    private void remove(Node node) {
        node.prev.next = node.next;  // skip over node from the left side
        node.next.prev = node.prev;  // skip over node from the right side
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){ // key already exists
            Node node = map.get(key); // fetch existing node
            node.value = value;  // update its value
            moveToFront(node); // mark as recently used
        }else {  // key doesn't exist
            Node node = new Node(key, value);  // create new node
            map.put(key, node); // add to map for O(1) access
            addToFront(node);  // add as most recently used
            if (map.size() > cap){  // cache exceeded capacity
                Node lru = removeLast();  // remove least recently used node from DLL
                map.remove(lru.key); // remove it from map too
            }
        }
    }

    private Node removeLast() {
        Node lru = tail.prev;  // node just before dummy tail is LRU
        remove(lru);           // detach it from DLL
        return lru;            // return it so caller can remove from map
    }

    private void addToFront(Node node) {
        node.next = head.next;  // new node points to current first real node
        node.prev = head;       // new node's prev points to dummy head
        head.next.prev = node;  // current first node's prev points to new node
        head.next = node;        // dummy head points to new node
    }
}