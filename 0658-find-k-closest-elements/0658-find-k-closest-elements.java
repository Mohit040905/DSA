import java.util.*;

class Pair implements Comparable<Pair> {
    int ele;
    int dist;

    Pair(int ele, int dist) {
        this.ele = ele;
        this.dist = dist;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.dist == p.dist) {
            return p.ele - this.ele; 
        }
        return p.dist - this.dist;  
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int ele : arr) {
            int dist = Math.abs(ele - x);
            pq.add(new Pair(ele, dist));

            if (pq.size() > k) {
                pq.poll(); 
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll().ele);
        }
        Collections.sort(ans);
        return ans;
    }
}