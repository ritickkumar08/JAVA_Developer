package April2026.Queuesss;

public class CircularQueues {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int front = 0;
    int end = 0;
    int size;

    public CircularQueues(){
        this(DEFAULT_SIZE);
    }

    public CircularQueues(int n){
        this.data = new int[n];
        this.size = 0;
        this.front = 0;
        this.end = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean enqueue(int x){
        if(isFull()){
            return false;
        }

        data[end++] = x;
        end = end% data.length;
        size++;
        return true;
    }

    public int dequeue(){
         if(isEmpty()){
             return -1;
         }
         int removed = data[front++];
         front = front%data.length;
         size--;
         return removed;
    }

    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("the queue is empty");
        }
        return data[front];
    }

    public void display(){
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i = i% data.length;
        }while (i < end);
        System.out.println("end");
    }
}
