public class Tiger implements Animal {
    @Override
    public void speak() {
        System.out.println("Tiger Roars");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tigers prefer hunting...\n");
    }
}
