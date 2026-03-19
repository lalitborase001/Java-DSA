class Search {
    public static void main(String[] args) {
        System.out.println(search("for","forxxorfxdofr"));
    }

     static int search(String pat, String txt) {
         int count = 0;
         int k = pat.length();
         int i = 0;int j = 0;
         int[] freq = new int[26];
         for (char c : pat.toCharArray()){
             freq[c-'a']++;
         }
         while(j<txt.length()){
             freq[txt.charAt(j)-'a']--;
             if(j-i+1<k) j++;
             else if(j-i+1 == k){
                 boolean isAnagram = true;
                 for (int f : freq) {
                     if (f != 0) {
                         isAnagram = false;
                         break;
                     }
                 }
                 if (isAnagram) count++;
                 freq[txt.charAt(i) - 'a']++;
                 i++;
                 j++;
             }
         }
         return count;
    }
}