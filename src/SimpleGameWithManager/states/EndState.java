package SimpleGameWithManager.states;

import SimpleGameWithManager.animations.IAnimation;

public class EndState extends AAnimationState implements IGameState, IAnimationState {
    public EndState(IAnimation animation) {
        super(animation);
    }

    @Override
    public void execute(IOnStateFinished onStateFinishedCallback) {
        System.out.println("Ending...");
        onStateFinishedCallback.onFinished();
    }
    @Override
    public void enter() {
        System.out.println("Entering End State");
    }
    @Override
    public void exit(IOnStateFinished onStateFinishedCallback) {
        System.out.println("Game Over, no more states");
        onStateFinishedCallback.onFinished();
    }
}
