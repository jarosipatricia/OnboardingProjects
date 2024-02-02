package SimpleGame.states;

import SimpleGame.animations.IAnimation;

public class EndState extends AAnimationState implements IGameState, IAnimationState {
    public EndState(IAnimation animation) {
        super(animation);
    }
    @Override
    public void execute() {
        System.out.println("End state reached");
    }
}
