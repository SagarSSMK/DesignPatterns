package protectiveproxies;

import java.util.ArrayList;
import java.util.List;

public class ModifiedProxy extends  Subject {

    static Subject cs;
    String currentUser;
    List<String> registeredUsers;

    ModifiedProxy(String currentUser){
        registeredUsers = new ArrayList<String>();
        registeredUsers.add("Admin");
        registeredUsers.add("Rohit");
        registeredUsers.add("Sam");
        this.currentUser=currentUser;
    }

    @Override
    public void doSomeWork() {

        if (registeredUsers.contains(currentUser)){
            //Lazy initialization:We'll not instantiate until the
            //method is called
            if (cs == null)
            {
                cs = new ConcreteSubject();
            }
            //Allow the registered user to invoke the method
            cs.doSomeWork();
        }
        else{
            System.out.println("Sorry "+ currentUser+ " , you do not have access rights.");
        }
    }
}
