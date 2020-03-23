package doublechecklocking;


//There is another popular approach, which is called double-checked locking. If you notice our synchronized
// implementation of the singleton pattern, you may find that synchronization operations are costly in general
// and the approach is useful for some initial threads that might break the singleton implementation.
// But in later phases, the synchronization operations might create additional overhead. To avoid that problem,
// you can use a synchronized block inside an if condition, as shown in the following code, to ensure that no unwanted instance is created.
final class Captain {

    private static Captain captain;
    static int numberOfInstance=0;
    private Captain(){
        numberOfInstance++;
    }
    public static  Captain getCaptain(){
        if(numberOfInstance==0){
            synchronized (Captain.class){
                if(captain==null)
                    captain= new Captain();
                else{
                    System.out.print("You already have a captain for your team.");
                    System.out.println("Send him for the toss.");
                }
            }
        }
        return captain;
    }

}
