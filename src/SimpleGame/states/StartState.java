package SimpleGame.states;

import SimpleGame.animations.IAnimation;

public class StartState extends AAnimationState implements IGameState, IAnimationState {

    public StartState(IAnimation animation) {
        super(animation);
    }

    @Override
    public void execute() {
        System.out.println("End state reached");
    }
}
