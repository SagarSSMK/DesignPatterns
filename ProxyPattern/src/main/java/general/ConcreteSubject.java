package general;

public class ConcreteSubject extends  Subject{
    @Override
    public void doSomeWork() {
        System.out.println("doSomeWork() inside general.ConcreteSubject is invoked.");
    }
}
