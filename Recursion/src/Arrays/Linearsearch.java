package Arrays;

import java.util.ArrayList;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        int target = 3;
        ArrayList<Integer> ans = findalindex(arr,target,0,new ArrayList<>());
        System.out.println(ans);
    }
    static boolean find(int[] arr, int target , int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findindex(int[] arr, int target , int index){
        if (index == arr.length){
            return -1;
        }if (arr[index] == target){
            return index;
        }else {
            return findindex (arr,target,index+1);
        }

    }
    static ArrayList<Integer> list= new  ArrayList<>();
    static void findallindex(int[] arr, int target , int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findallindex(arr, target, index + 1);

    }
    static ArrayList<Integer> findalindex(int[] arr, int target , int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }if (arr[index] == target){
            list.add(index);
        }
            return findalindex (arr,target,index+1,list);


    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
