import java.util.*;

class maxSliding {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7}; int k = 3;
        System.out.println(Arrays.toString( maxSlidingWindow(arr,k)));
    }
    public static int[] maxSlidingWindow(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); 

        int i = 0, j = 0;

        while (j < arr.length) {

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[j]) {
                dq.pollLast();
            }

            dq.addLast(j);

            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {

                list.add(arr[dq.peekFirst()]);

                if (dq.peekFirst() == i) {
                    dq.pollFirst();
                }

                i++;
                j++;
            }
        }

        int[] result = new int[list.size()];
        for (int idx = 0; idx < list.size(); idx++) {
            result[idx] = list.get(idx);
        }

        return result;
    }
}