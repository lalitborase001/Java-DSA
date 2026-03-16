package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        int target = 15;
        int ans = binarysearch(nums , target);
        System.out.println(ans);

    }
    static int binarysearch(int[] nums, int target){
        int[] result = {-1,-1};
        int s = 0;
        int e = nums.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                result[0] = mid;
                e = mid-1;
            }
            else if(target < nums[mid]) e = mid -1;
            else s = mid +1;
        }
        s=0;
        e = nums.length-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                result[1] = mid;
                s = mid+1;
            }
            else if(target < nums[mid]) e = mid -1;
            else s = mid +1;
        }
        return result;
    }
}