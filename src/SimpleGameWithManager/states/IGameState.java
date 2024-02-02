package SimpleGameWithManager.states;

public interface IGameState {
    void execute(IOnStateFinished onStateFinishedCallback);
    void enter(); //used for setup, do some logic
    void exit(IOnStateFinished onStateFinishedCallback); //set next state
}
