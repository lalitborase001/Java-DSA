package Interface.extendemo2;

public interface A {
    static void greet(){
        System.out.println("i am in a static method");
    }
    default void fun() {
        System.out.println("I am in A");
    }

}
