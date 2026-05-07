package April2026.Stacksss;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the size of the array
            int[] temp = new int[data.length *2];

            //copy all the previous items to the new array.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        //now we would insert item.
        return super.push(item);
    }
}
