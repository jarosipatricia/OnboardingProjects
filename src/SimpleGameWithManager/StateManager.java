package SimpleGameWithManager;

import SimpleGameWithManager.animations.*;
import SimpleGameWithManager.states.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StateManager {
    private static StateManager instance; //single shared instance of the class
    public LinkedList<IGameState> gameStates;
    public IGameState currentState;
    public int numOfRounds = 0;
    public boolean continueRunning = true;

    public StateManager() {
        gameStates = new LinkedList<>();
        gameStates.add(new StartState(new ReelsSpinAnimation()));
        gameStates.add(new WinEvaluationState(new WinAnimation()));
        gameStates.add(new WinAnimationState(new WinCountUpAnimation()));
        gameStates.add(new EndState(new BigWinAnimation()));
        currentState = gameStates.getFirst();
    }

    public static StateManager getManager() {
        if (instance == null) {
            instance = new StateManager();
        }
        return instance;
    }

    public void changeState(IGameState newState) {
        currentState = newState;
    }

    public void run(IGameState state) {

        if (numOfRounds < 5) {
            this.currentState = state;
            currentState.enter();
            currentState.exit(() -> {
                numOfRounds++;
                run(currentState);
            });
        }

        /*for (IGameState s : gameStates) {
            s.execute(() -> {
                System.out.println("This text is printed when method is finished");
            });
        }*/

        /*while (numOfRounds < 5) {
            this.currentState = state;
            currentState.enter();
            currentState.exit();
            numOfRounds++;
            run(currentState);
        }*/
    }

    private void waitForEnterKey() {
        System.out.println("Press C to continue or E to exit");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if ("E".equalsIgnoreCase(userInput.trim())) {
            continueRunning = false;
        } else if ("C".equalsIgnoreCase(userInput.trim())) {
            continueRunning = true;
        } else {
            System.out.println("Invalid input");
            waitForEnterKey();
        }
    }

    public void enterNextState() {
        Iterator<IGameState> iterator = gameStates.iterator();
        while (iterator.hasNext()) {
            IGameState tmp = iterator.next();
            if (tmp.getClass().getSimpleName().equals(currentState.getClass().getSimpleName()))
                if (iterator.hasNext()) {
                    this.currentState = iterator.next();
                    System.out.println("Next state entered: " + currentState.getClass().getSimpleName());
                } else {
                    System.out.println("You reached the last state. No next state available.");
                }
            }
        }

}
