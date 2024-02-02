package SimpleGameWithManager.animations;

public class BigWinAnimation implements IAnimation{
    @Override
    public void play() {
        System.out.println("Big win animation is playing");
    }

    @Override
    public void stop() {
        System.out.println("Big win animation is stopping");
    }
}
