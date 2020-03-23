public interface State {
    void moveState();
    void hardPressed();
    default void test(){
        System.out.println("Test");
    }
}
