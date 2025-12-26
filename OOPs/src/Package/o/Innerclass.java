package Package.o;

public class Innerclass {
      static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test lalit = new Test ("Lalit");
        System.out.println(lalit.name);
    }
}
