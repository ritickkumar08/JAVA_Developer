package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class NumberofSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        int number = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("sun",0);
        map.put("mon",1);
        map.put("tue",2);
        map.put("wed",3);
        map.put("thu",4);
        map.put("fri",5);
        map.put("sat",6);

        int start = map.get(day);
        int firstSunday = 7-start;
        int sundays = 0;

        if(firstSunday < number){
            sundays = 1 + (number - firstSunday -1)/7;
        }

        System.out.println(sundays);
    }
}
