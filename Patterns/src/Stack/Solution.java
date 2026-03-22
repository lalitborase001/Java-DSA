package Stack;

import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int[] circ = circular(arr);
        int m = circ.length;
        Stack<Integer> s = new Stack<>();
        for(int i=m-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= circ[i]){
                s.pop();
            }
            if(s.isEmpty()) result[i%n] = -1;
            else result[i%n] = s.peek();
            s.push(circ[i]);
        }
        return result;
    }
    int[] circular(int[] arr){
        int n = arr.length;
        int[] circ = new int[2 * n - 1];

        for(int i = 0; i < circ.length; i++){
            circ[i] = arr[i % n];
        }

        return circ;
    }    
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> s = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek() <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()) map.put(nums2[i],-1);
            else map.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}