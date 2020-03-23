public interface Receiver {
    boolean handleMessage(Message message);
    void nextHandleMessage(Receiver nextReceiver);
}
