import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        heap.insert(35);
        heap.insert(76);
        heap.insert(23);
        heap.insert(65);
        heap.insert(46);
//        System.out.println(heap.remove());
        ArrayList list = heap.heapSort();
        System.out.println(list);
    }
}