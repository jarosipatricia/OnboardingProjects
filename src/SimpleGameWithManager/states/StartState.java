package SimpleGameWithManager.states;

import SimpleGameWithManager.animations.BigWinAnimation;
import SimpleGameWithManager.animations.IAnimation;
import SimpleGameWithManager.StateManager;

public class StartState extends AAnimationState implements IGameState, IAnimationState {
    public StartState(IAnimation animation) {
        super(animation);
    }

    // IOnStateFinished declares a callback method (onFinished)
    // The execute method uses this callback to say, "When I'm finished starting, do whatever is specified in the callback."
    @Override
    public void execute(IOnStateFinished onStateFinishedCallback) {
        System.out.println("Starting");
        onStateFinishedCallback.onFinished();
    }

    @Override
    public void enter() {
        System.out.println("Start entered");
    }
    @Override
    public void exit(IOnStateFinished onStateFinishedCallback) {
        StateManager.getManager().changeState(new WinEvaluationState(new BigWinAnimation()));
        onStateFinishedCallback.onFinished();
    }
}
