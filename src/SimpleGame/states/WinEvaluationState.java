package SimpleGame.states;

import SimpleGame.animations.IAnimation;

public class WinEvaluationState extends AAnimationState implements IGameState, IAnimationState {

    public WinEvaluationState(IAnimation animation) {
        super(animation);
    }

    @Override
    public void execute() {
        System.out.println("Win evaluation is starting.");
    }
}
