public class On implements PossibleState {
    @Override
    public void pressOnButton(TV context) {
        //TV is On already, user is pressing On button again
        System.out.println("You pressed On button. TV is already in On state.");
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button.Going from On to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("You pressed Mute button.Going from On to Mute mode.");
        context.setCurrentState(new Mute());
    }
}
