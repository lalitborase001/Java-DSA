package BinarySearch;

public class BS {
//   // normal binary search
//    class Solution {
//        public int search(int[] nums, int target) {
//            int s = 0;
//            int e = nums.length - 1;
//            while (s <= e){
//                int mid = s + (e-s)/2;
//                if(target < nums[mid]) e = mid -1;
//                else if(target > nums[mid]) s = mid +1;
//                else return mid;
//            }
//            return -1;
//        }
//    }
//
//  // inert number between
//  class Solution {
//      public int searchInsert(int[] nums, int target) {
//          int s = 0;
//          int e = nums.length - 1;
//          while (s <= e){
//              int mid = s + (e-s)/2;
//              if(target < nums[mid]) e = mid -1;
//              else if(target > nums[mid]) s = mid +1;
//              else return mid;
//          }
//          return s ;
//      }
//  }
}
//first and last occurrence
class Solution {
    public int[] searchRange(int[] nums, int target) {
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
//single element
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e){
            int mid = s + (e-s)/2;
            if(mid % 2 == 1) mid--;
            if(nums[mid] == nums[mid+1]) s = mid+2;
            else e = mid;
        }
        return nums[s];
    }
}
//2-d array search
static int[] search(int[][] matrix, int target) {
    int r = 0;
    int c = matrix[0].length - 1;

    while (r < matrix.length && c >= 0) {
        if (matrix[r][c] == target) {
            return new int[]{r, c};
        }
        if (matrix[r][c] < target) {
            r++;
        } else {
            c--;
        }
    }
    return new int[]{-1, -1};
}

