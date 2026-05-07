package April2026.Stacksss;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("the stack is full");
            return false;
        }
        ptr++;
        data[ptr++] = item;
        return true;
    }

    public boolean isFull() {
        if(ptr == data.length-1) return true;
        return false;
    }

    public boolean isEmpty(){
        if(ptr == -1) return true;
        return false;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("the stack is empty");
        }
        int removed = data[ptr--];
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("can't an empty stack");
        }
        int last = data[ptr];
        return last;
    }
}
