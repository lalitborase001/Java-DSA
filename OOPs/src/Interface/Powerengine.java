package Interface;

public class Powerengine implements Engine{
    @Override
    public void start() {
        System.out.println("start the engine");
    }

    @Override
    public void stop() {
        System.out.println("stop the engine");

    }

    @Override
    public void acc() {
        System.out.println("acclerate the engine");

    }
}
