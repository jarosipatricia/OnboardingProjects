package SimpleGame.animations;

public class ReelsSpinAnimation implements IAnimation{
    @Override
    public void play() {
        System.out.println("Reels are spinning animation is playing");
    }

    @Override
    public void stop() {
        System.out.println("Reels are spinning animation is stopping");
    }
}
