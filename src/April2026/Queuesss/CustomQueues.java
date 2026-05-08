package April2026.Queuesss;

public class CustomQueues {
    protected int[] data;
    int size;
    private static final int DEFAULT_SIZE = 10;
    int end = -1;

    public CustomQueues(){
        this(DEFAULT_SIZE);
    }

    public CustomQueues(int n){
        this.data = new int[n];
        this.size = n;
    }

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean isFull(){
        return end == size-1;
    }

    public boolean enqueue(int x){
        if(isFull()){
            return false;
        }
        data[++end] = x;
        return true;
    }

    public int dequeue(){
        if (isEmpty()){
            return -1;
        }
        int removed = data[0];
        //shifting the element
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        --end;
        return removed;
    }

    public int getFront() {
        // Get front element
        if (!isEmpty()){
            return -1;
        }
        return data[0];
    }

    public int getRear() {
        // Get last element
        return data[end];
    }
}
