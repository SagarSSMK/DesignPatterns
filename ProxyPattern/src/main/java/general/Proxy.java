package general;

public class Proxy extends Subject {

    Subject cs;

    @Override
    public void doSomeWork() {
        System.out.println("general.Proxy call happening now...");
        //Lazy initialization:We'll not instantiate until the method is //called
        if(cs==null)
            cs= new ConcreteSubject();
        cs.doSomeWork();
    }
}
