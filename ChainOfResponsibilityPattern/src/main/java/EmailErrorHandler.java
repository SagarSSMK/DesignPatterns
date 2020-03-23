public class EmailErrorHandler implements Receiver {

    private Receiver receiver;
    @Override
    public boolean handleMessage(Message message) {
        if(message.msg.contains("Email")){
            System.out.println(" EmailErrorHandler processed "+message.messagePriority+ " priority issue: "+message.msg);
            return true;
        }
        else{
            if (receiver != null) {
                receiver.handleMessage(message);
            }
            return false;
        }
    }

    @Override
    public void nextHandleMessage(Receiver nextReceiver) {
        this.receiver=nextReceiver;
    }
}
