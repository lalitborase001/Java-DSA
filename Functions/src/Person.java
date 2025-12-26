public class Person {
    String name;
    int age;
    public Person(){
        this.name = "Lalit";
        this.age = 19;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age : "+this.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("Person 1:");
        person1.display();
        Person person2 = new Person("Alice", 30);
        System.out.println("Person2:");
        person2.display();

    }
}
