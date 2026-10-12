package september2026;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
//        tree.display();

        System.out.println(tree.querry(2,7));
    }

    class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if(start == end){

            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start + end) / 2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);

        node.data  = node.left.data + node.right.data;
        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = " ";

        if(node.left != null){
            str = str + "interval=["+node.left.startInterval + "-" + node.left.endInterval + "] and data :" + node.left.data+" => ";
        }else {
            str = str + "no left child ";
        }

        str = str + "interval=["+node.startInterval + "-" + node.endInterval + "] and data :" + node.data+" => ";

        if(node.right != null){
            str = str + "interval=["+node.right.startInterval + "-" + node.right.endInterval + "] and data :" + node.right.data ;
        }else {
            str = str + "no right child ";
        }

        System.out.println(str + '\n');

        if(node.left != null){
            display(node.left);
        }
        if (node.right !=  null){
            display(node.right);
        }
    }

    private int querry(int qsi, int qei){
        return this.querry(this.root, qsi, qei);
    }

    private int querry(Node node, int qsi, int qei) {
        if(node.startInterval >= qsi && node.endInterval <= qei) {
            //node is completely inside querry.
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            //no contribution
            return 0;
        }else {
            //partial contribution
            return this.querry(node.left, qsi, qei) + this.querry(node.right, qsi, qei);
        }
    }

    public void update(int index, int value){
        this.root.data = update(this.root, index, value);
    }
    private int update(Node node, int index, int value){
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index == node.endInterval){
                node.data = value;
                return node.data;
            }else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                return leftAns+rightAns;
            }
        }

        return node.data;
    }
}
