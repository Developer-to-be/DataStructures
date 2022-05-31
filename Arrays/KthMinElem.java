import java.util.*;
public class KthMinElem {
    public static void main(String[] args) {
        int k = 4;
        int[] arr = { 7, 10, 4, 20, 15};

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            maxHeap.offer(arr[i]);
        }
        
        for(int i=k;i<arr.length;i++){
            if(arr[i] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            } 
        }
        System.out.println(maxHeap.poll());
        
    }
}

