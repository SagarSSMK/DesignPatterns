public class UnauthorizedUser extends Employee {

    public UnauthorizedUser(Mediator mediator,String name,boolean authorizedUser){
        super(mediator,name,false);
    }
    @Override
    public String employeeType() {
        return null;
    }
}
