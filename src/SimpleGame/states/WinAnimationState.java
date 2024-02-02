package SimpleGame.states;

import SimpleGame.animations.IAnimation;

public class WinAnimationState extends AAnimationState implements IGameState, IAnimationState {
    public WinAnimationState(IAnimation animation) {
        super(animation);
    }

    @Override
    public void execute() {
        System.out.println("Win Animation is starting.");
    }

}
