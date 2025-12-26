package Package.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4);
        Boxweight box2 =  new Boxweight();
        System.out.println(box1.h + " " + box1.l);
        System.out.println(box2.weight);

        Box box3 = new Boxweight(2, 3, 4, 5);
        System.out.println(box3.w);

//        Boxweight box4 = new Box(2, 3, 4);
//        System.out.println(box4);

    }
}
