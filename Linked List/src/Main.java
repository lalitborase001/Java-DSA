//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(10);
//        list.insertFirst(7);
//        list.insertFirst(15);
//        list.insertLast(1);
//        list.insert(2,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteIndex(1));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(10);
//        list.insertFirst(7);
//        list.insertFirst(15);
//        list.insertLast(99);
//        list.insert(7,21);
//        list.display();

        CLL list = new CLL();
        list.insert(3);
        list.insert(10);
        list.insert(7);
        list.insert(15);
        list.insert(99);
        list.delete(7);
        list.display();
    }
}