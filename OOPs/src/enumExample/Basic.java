package enumExample;

public class Basic implements A{
    @Override
    public void fun() {
        System.out.println("Hoow are you");
    }
    void display(){

    }

    enum Week{
        Monday, tuesday , wednesday, thursday, friday, saturday;
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(Week.valueOf("Monday"));
//        for (Week day : Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
    }
}
