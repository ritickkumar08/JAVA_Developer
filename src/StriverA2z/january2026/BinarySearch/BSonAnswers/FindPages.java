package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.Arrays;

class FindPages {
    public static void main(String[] args) {
        int[] pages = {12, 34, 67, 90};
        int students = 2;
        FindPages ob = new FindPages();
        int studentPages = ob.findPages(pages, students);
        System.out.println(studentPages);
    }
    public int findPages1(int[] arr, int k) {
        // code here
        if(k >= arr.length) return -1;
        int max = Arrays.stream(arr).max().getAsInt();
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        for (int i = max; i <= sum; i++) {
            int students = count(arr, i);

            if(students == k){
                return i;
            }
        }
        return -1;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k > arr.length) return -1;
        int low = Arrays.stream(arr).max().getAsInt();
        int high = 0;
        for(int i : arr){
            high += i;
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            int students = count(arr, mid);
            if(students > k){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return low;
    }

    private int count(int[] arr, int pages) {
        int students = 1;
        int pagesStudent = 0;
        for (int page : arr){
            if(pagesStudent + page <= pages){
                pagesStudent += page;
            }else {
                students++;
                pagesStudent = page;
            }
        }
        return students;
    }
}