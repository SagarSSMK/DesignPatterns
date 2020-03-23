public class Mute implements PossibleState{

    //User is pressing On button when the TV is in Mute mode
    @Override
    public void pressOnButton(TV context) {
        System.out.println("You pressed On button.Going from Mute mode to On state.");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    //User is pressing Off button when the TV is in Mute mode
    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed On button.Going from Mute mode to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("TV is already in mute mode, doesn't affect");
    }
    public String toString()
    {
        return "\t**TV is Mute.**";
    }
}
