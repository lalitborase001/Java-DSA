public class Class {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        String name = new String();
        float[] marks = new float[5];
//        System.out.printf("rollno.");
        Student[] students = new Student[5];
        Student lalit = new Student(15 , "LAlit borase", 8.8f);
        lalit.rollno = 14;
        lalit.marks = 9.8f;
        lalit.name = "Lalit Borase";
        System.out.println(lalit.rollno);
        System.out.println(lalit.name);
        System.out.println(lalit.marks);

       Student kunal = new Student(18, "Kunal", 9.8f);
//        lalit.changeName("Youtube") ;
//        lalit.greeting();

        Student Random = new Student(lalit);
        System.out.println(Random.name);

        Student random2 = new Student();
        System.out.println(random2.marks);

    }
     static class Student{
        int rollno ;
        String name;
        float marks = 90;

        Student (Student other) {
            this.rollno = other.rollno;
            this.name = other.name;
            this.marks = other.marks;
        }

        void greeting(){
            System.out.println("Hello my name is " +this.name);
        }

         void changeName(String name) {
             this.name = name;
         }
         Student(){
            this (14, "Kunal", 4.6f);
         }

     Student(int rollno, String name, float marks) {
         this.name = name;
         this.rollno = rollno;
         this.marks = marks;
     }

    }
}
