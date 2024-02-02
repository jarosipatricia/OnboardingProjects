package SimpleGame.animations;

public class WinCountUpAnimation implements IAnimation{
    @Override
    public void play() {
        System.out.println("The count up animation is playing");
    }

    @Override
    public void stop() {
        System.out.println("Count up stopped");
    }
}
