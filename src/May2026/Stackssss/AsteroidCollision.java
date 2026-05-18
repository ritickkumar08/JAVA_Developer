package May2026.Stackssss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteriods = {3,5,-6,2,-1,4};

        AsteroidCollision ob = new AsteroidCollision();
        int[] ans = ob.asteroidCollision(asteriods);
        System.out.println(Arrays.toString(ans));
    }
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        List<Integer> st = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If asteroid is moving right, push it to the stack
            if (asteroids[i] > 0){
                st.add(asteroids[i]);
            }else {// If asteroid is moving left, handle possible collisions
                // Destroy all smaller right-moving asteroids
                while (!st.isEmpty() && st.get(st.size()-1) > 0 && st.get(st.size()-1) < Math.abs(asteroids[i])) {
                    st.remove(st.size()-1);
                }
                // Destroy both if sizes are equal
                if (!st.isEmpty() && st.get(st.size()-1) == Math.abs(asteroids[i])){
                    st.remove(st.size()-1);
                }
                // If top of stack is a left-moving or no asteroid, add this one
                else if(st.isEmpty() || st.get(st.size()-1) < 0){
                    st.add(asteroids[i]);
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }
        return ans;
    }
}