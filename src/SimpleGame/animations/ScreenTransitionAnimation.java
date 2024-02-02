package SimpleGame.animations;

public class ScreenTransitionAnimation implements IAnimation{
    @Override
    public void play() {
        System.out.println("Screen transition is playing");
    }

    @Override
    public void stop() {
        System.out.println("Screen transition ending");
    }
}
