package SimpleGameWithManager.animations;

public class WinAnimation implements IAnimation {
    @Override
    public void play() {
        System.out.println("Win animation is playing");
    }

    @Override
    public void stop() {
        System.out.println("Win animation has ended");
    }
}
