package SimpleGameWithManager.states;

import SimpleGameWithManager.StateManager;
import SimpleGameWithManager.animations.IAnimation;
import SimpleGameWithManager.animations.WinAnimation;

public class WinAnimationState extends AAnimationState implements IGameState, IAnimationState {

    public WinAnimationState(IAnimation animation) {
        super(animation);
    }


    @Override
    public void execute(IOnStateFinished onStateFinishedCallback) {
        System.out.println("Win Animation is starting.");
        onStateFinishedCallback.onFinished();
    }

    @Override
    public void enter() {
        System.out.println("Entering Win Animation State");
    }
    @Override
    public void exit(IOnStateFinished onStateFinishedCallback) {
        StateManager.getManager().changeState(new EndState(new WinAnimation()));
        onStateFinishedCallback.onFinished();
    }

}
