package SimpleGame.animations;

public class ReelsStopAnimation implements IAnimation {
    @Override
    public void play() {
        System.out.println("Reels stop animation started");
    }

    @Override
    public void stop() {
        System.out.println("Reels stop animation stopped");
    }
}
