package July2026.Contests;

class SecondsBetweenTimes {
    public static void main(String[] args) {
        String s = "";
        String e = "";

        SecondsBetweenTimes ob = new SecondsBetweenTimes();
        int ans = ob.secondsBetweenTimes(s,e);
        System.out.println(ans);
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        int difference = 0;
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        int startSeconds = (Integer.parseInt(start[0])*60*60*60 + Integer.parseInt(start[1])*60*60 +
                            Integer.parseInt(start[2])*60);
        int endSeconds = (Integer.parseInt(end[0])*60*60*60 + Integer.parseInt(end[1])*60*60 +
                Integer.parseInt(end[2])*60);

        return endSeconds - startSeconds;
    }
}