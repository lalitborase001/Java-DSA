import java.util.*;

class maxSliding {
    public int[] maxSlidingWindow(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();  // ✅ use deque

        int i = 0, j = 0;

        while (j < arr.length) {

            // ✅ remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[j]) {
                dq.pollLast();
            }

            dq.addLast(j);  // ✅ store index

            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {

                // ✅ max element at front
                list.add(arr[dq.peekFirst()]);

                // ✅ remove out-of-window element
                if (dq.peekFirst() == i) {
                    dq.pollFirst();
                }

                i++;
                j++;
            }
        }

        // ✅ convert list to array
        int[] result = new int[list.size()];
        for (int idx = 0; idx < list.size(); idx++) {
            result[idx] = list.get(idx);
        }

        return result;
    }
}