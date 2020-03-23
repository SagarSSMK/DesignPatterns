package eagerintialization;

class Captain {

    //Early initialization
    private static final Captain captain = new Captain();
    private Captain(){}
    public  static Captain getCaption(){
        return captain;
    }

}


//Pros

//It is straightforward and cleaner.
//
//It is the opposite of lazy initialization but still thread safe.
//
//It has a small lag time when the application is in execution mode because everything is already loaded in memory.


//Cons
