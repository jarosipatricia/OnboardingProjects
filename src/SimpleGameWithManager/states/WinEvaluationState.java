package SimpleGameWithManager.states;

import SimpleGameWithManager.StateManager;
import SimpleGameWithManager.animations.IAnimation;
import SimpleGameWithManager.animations.WinAnimation;

import java.util.Random;

public class WinEvaluationState extends AAnimationState implements IGameState, IAnimationState {

    public WinEvaluationState(IAnimation animation) {
        super(animation);
    }

    @Override
    public void execute(IOnStateFinished onStateFinishedCallback) {
        System.out.println("Win evaluation is starting.");
        onStateFinishedCallback.onFinished();
    }
    @Override
    public void enter() {
        System.out.println("Entering Win Evaluation State");

        int winAmount = new Random().nextInt(101); //random number between 0 and 100

        if (winAmount > 50) {
            playBigWinAnimation();
        }
    }
    @Override
    public void exit(IOnStateFinished onStateFinishedCallback) {
        StateManager.getManager().changeState(new WinAnimationState(new WinAnimation()));
        onStateFinishedCallback.onFinished();
    }
    private void playBigWinAnimation() {
        System.out.println("\u001B[33m$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\u001B[0m");

        System.out.println("\u001B[33m  ____    _____    _____    __          __  _____   _   _ \u001B[0m");
        System.out.println("\u001B[33m |  _ \\  |_   _|  / ____|   \\ \\        / / |_   _| | \\ | |\u001B[0m");
        System.out.println("\u001B[33m | |_) |   | |   | |  __     \\ \\  /\\  / /    | |   |  \\| |\u001B[0m");
        System.out.println("\u001B[33m |  _ <    | |   | | |_ |     \\ \\/  \\/ /     | |   | . ` |\u001B[0m");
        System.out.println("\u001B[33m | |_) |  _| |_  | |__| |      \\  /\\  /     _| |_  | |\\  |\u001B[0m");
        System.out.println("\u001B[33m |____/  |_____|  \\_____|       \\/  \\/     |_____| |_| \\_|\u001B[0m");

        System.out.println("\u001B[33m$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\u001B[0m");
    }
}
