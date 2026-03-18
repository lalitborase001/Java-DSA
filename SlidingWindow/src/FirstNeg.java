import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class FirstNeg {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int i = 0, j = 0;
           while (j < arr.length) {
            if (arr[j] < 0) {
                q.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                if (q.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(q.peek());
                }
                if (!q.isEmpty() && arr[i] == q.peek()) {
                    q.poll();
                }
                i++;
                j++;
            }
        }
        return result;
    }
}