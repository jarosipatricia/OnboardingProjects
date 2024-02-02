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
    }
    @Override
    public void exit(IOnStateFinished onStateFinishedCallback) {
        StateManager.getManager().changeState(new WinAnimationState(new WinAnimation()));
        onStateFinishedCallback.onFinished();
    }
}
