import java.util.ArrayList;

public class shuffle {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

    }

    static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[(2 * i) + 1] = nums[i + n];
        }

        return ans;

    }

}
