abstract class Employee {

    private   Mediator mediator;
    private boolean authorizedUser;
    private String employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employee(Mediator mediator,String name,boolean authorizedUser){
        this.mediator=mediator;
        this.authorizedUser=authorizedUser;
        this.employeeName=name;

        if(authorizedUser){
            mediator.register(this);
        }
    }

    public void send(Employee toFriend,String msg) throws InterruptedException{
        mediator.sendMessage(this,toFriend,msg);
    }
    public  void receive(Employee fromFriend, String msg){
        System.out.println("Message "+msg+" has been received from"+fromFriend);
    }

    public abstract String employeeType();
}
