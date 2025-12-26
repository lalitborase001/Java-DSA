import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        permute("","abc");
    }
    static void permute(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permute(f+ch+s,up.substring(1));
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int arr: nums){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr);
                outer.add(internal);
            }
        }

        return outer;

    }
}
