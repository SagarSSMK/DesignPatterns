public class ConcreteEmployee extends Employee {

    public ConcreteEmployee(Mediator mediator,String name,boolean authorizedUser){
        super(mediator,name,authorizedUser);
    }

    @Override
    public void receive(Employee fromEmployee,String message)
    {
        System.out.println(this.getEmployeeName() + message);
    }

    @Override
    public String employeeType() {
        return "Concrete Employees";
    }
}
