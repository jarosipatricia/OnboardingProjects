package SimpleGameWithManager;
import SimpleGameWithManager.animations.ReelsSpinAnimation;
import SimpleGameWithManager.states.StartState;

public class Game {
//    private LinkedList<IGameState> states;
//    public Game(LinkedList<IGameState> states) {
//        this.states = states;
//    }
//
//    public void play() {
//        for (IGameState state : states) {
//            state.execute(() -> {
//                //on state finished
//                System.out.println("Hello");
//            });
//            if(state instanceof IAnimationState) {
//                ((IAnimationState) state).startAnimation();
//                ((IAnimationState) state).stopAnimation();
//            }
//        }
//    }

    public static void main(String[] args) {
        StateManager.getManager().run(new StartState(new ReelsSpinAnimation()));
    }
}
