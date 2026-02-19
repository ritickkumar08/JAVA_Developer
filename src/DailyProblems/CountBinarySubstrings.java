package DailyProblems;

class CountBinarySubstrings {
    public static void main(String[] args) {
        String s = "00110011";
        CountBinarySubstrings ob = new CountBinarySubstrings();
        int number = ob.countBinarySubstrings(s);
        System.out.println(number);
    }
    public int countBinarySubstrings(String s) {
        int prevRun = 0;
        int currentRun = 1;
        int result = 0;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                currentRun++;
            }else {
                result += Math.min(prevRun, currentRun);
                prevRun = currentRun;
                currentRun = 1;
            }
        }
        return result + Math.min(prevRun, currentRun);
    }
}