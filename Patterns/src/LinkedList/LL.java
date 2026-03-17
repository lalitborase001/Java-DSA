package LinkedList;

public class LL {
    // cycle is there or not
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode f = head;
            ListNode s = head;
            while(f != null && f.next != null){
                s  = s.next;
                f = f.next.next;
                if(f == s) return true;
            }
            return false;
        }
    }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode f = head;
            ListNode s = head;
            while(f != null && f.next != null){
                s  = s.next;
                f = f.next.next;
                if(f == s) {
                    s = head;
                    while(f != s){
                        s = s.next;
                        f = f.next;
                    }
                    return s;
                }
            }
            return null;
        }
    }
}
