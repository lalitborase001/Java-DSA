package Interface;

public class Car implements Brake, Engine, Media{
    int a = 30;

    @Override
    public void Brake() {
        System.out.println("brake like");
    }

    @Override
    public void start() {
        System.out.println("Start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("Stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate like a normal car");

    }
}
