package SimpleGame.states;

import SimpleGame.animations.IAnimation;

public abstract class AAnimationState implements IAnimationState {

    private final IAnimation animation;

    public AAnimationState(IAnimation animation) {
        this.animation = animation;
    }

    @Override
    public void startAnimation() {
        System.out.println(animation.getClass().getSimpleName() + " started");
        animation.play();
    }

    @Override
    public void stopAnimation() {
        System.out.println(animation.getClass().getSimpleName() + " stopped");
        animation.stop();
    }
}
