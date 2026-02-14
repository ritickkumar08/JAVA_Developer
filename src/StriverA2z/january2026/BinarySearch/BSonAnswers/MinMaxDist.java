package StriverA2z.january2026.BinarySearch.BSonAnswers;

import java.util.PriorityQueue;
class Pair {
    double distance;
    int index;

    Pair(double distance, int index){
        this.distance = distance;
        this.index = index;
    }
}


class MinMaxDist {
    public static void main(String[] args) {
        int[] stations = {13};
        int k = 1;
        MinMaxDist ob = new MinMaxDist();
        double maxDistance = ob.minMaxDist(stations, k);
        System.out.println(maxDistance);
    }
    public double minMaxDist(int[] stations, int K) {
        int n = stations.length;
        int[] sections = new int[n-1];
        // code here
        if(n == 1){
            return 0.0;
        }
        // Priority queue (max-heap) to store the largest segment first
        PriorityQueue<Pair>  pq = new PriorityQueue<>(
                (a,b) -> Double.compare(b.distance, a.distance)
        );

        //adding initial segments in the queue
        for (int i = 0; i < n-1; i++) {
            pq.add(new Pair(stations[i+1] - stations[i], i));
        }

        //now calculating the distances for the gase stations and reducing it to maximum
        for(int i = 1 ; i <= K; i++){
            Pair top = pq.poll();
            int index = top.index;
            sections[index]++;

            double totalDistance = stations[index + 1] - stations[index];
            double newDistance = totalDistance / (sections[index]+1);

            pq.add(new Pair(newDistance, index));
        }
        return pq.peek().distance;
    }
}
