package com.SeptemberArrived;

public class Split {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i : nums){
            start = Math.max(start, i); //in the end of the loop it will contain the
            //maximum value from the array
            end += i;
        }

        while(start < end){
            //trying the mid as the potential answer
            int mid = start + (end - start) / 2;

            //calculate the number of pieces the array can be divided
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //as the sum after adding the new element is more than that of allowed value
                    // that is mid-value we will take the element for the next sub-array
                    //calculations
                    sum = num;
                    pieces++;
                }
                /* if adding the number results in a value lesser than the mid or potential answer keep adding it*/
                else{
                    sum += num;
                }
            }

            //checking if the potential answer gives or divides the array into the asked number of pieces or split is
            //done as required
            //check if the divided pieces are less than the required
            if(pieces < k){
                end = mid;
            }
            //if the output pieces are more then the user input or required
            else{
                start = mid+1;
            }

        }
        //we can return any value that is start or end or even mid as at last they will all be same
        //so that they don't give any further answers
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 3;

        Split ob = new Split();
        int sum = ob.splitArray(arr,k);
        System.out.println(sum);
    }
}
