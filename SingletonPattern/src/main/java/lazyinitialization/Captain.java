package lazyinitialization;//Why are you making the class final? You have a private constructor that could prevent the inheritance.
// Is this correct?

//Subclassing can be prevented in various ways. Yes, in this example,
// since the constructor is already marked with the “private” keyword, it was not needed.
// But if you make the LazyInitialization.Captain class final, as shown in the example, that approach is considered a better practice.

final class Captain {

    public static Captain captain ;

    //The constructor is private to prevent the use of a “new” operator.
    //The constructor is private, so you cannot instantiate the Singleton class(LazyInitialization.Captain) outside.
    // It helps us to refer the only instance that can exist in the system, and at the same time,
    // you restrict the additional object creation of the LazyInitialization.Captain class.

    //The private constructor also ensures that the LazyInitialization.Captain class cannot be extended.
    // So, subclasses cannot misuse the concept.
    private Captain(){ }


    //You’ll create an instance of the class, if you did not create any such instance earlier; otherwise, you’ll simply reuse the existing one.
    public static synchronized Captain getCaptain(){

        // Lazy initialization
        if(captain ==null){
            captain= new Captain();
        }
        else{
            System.out.print("You already have a captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return captain;
    }
}
