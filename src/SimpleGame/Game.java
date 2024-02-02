package SimpleGame;

import SimpleGame.animations.ReelsSpinAnimation;
import SimpleGame.animations.WinAnimation;
import SimpleGame.states.*;

import java.util.LinkedList;

public class Game {
    private LinkedList<IGameState> states;

    public Game(LinkedList<IGameState> states) {
        this.states = states;
    }

    public void play() {
        for (IGameState state : states) {
            state.execute();
            if(state instanceof IAnimationState) {
                ((IAnimationState) state).startAnimation();
                ((IAnimationState) state).stopAnimation();
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<IGameState> gameStates = new LinkedList<>();
        gameStates.add(new StartState(new ReelsSpinAnimation()));
        gameStates.add(new WinAnimationState(new WinAnimation()));

        Game game = new Game(gameStates);
        game.play();
    }
}
