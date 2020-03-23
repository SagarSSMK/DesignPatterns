public class FaxErrorHandler implements Receiver {

    private Receiver nextReceiver;

    @Override
    public boolean handleMessage(Message message) {
        if (message.msg.contains("Fax")) {
            System.out.println(" FaxErrorHandler processed " +message.messagePriority +" priority issue :"+ message.msg);
            return true;
        }
        else {
            if (nextReceiver != null)
                nextReceiver.handleMessage(message);
        }
        return false;
    }

    @Override
    public void nextHandleMessage(Receiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }
}
