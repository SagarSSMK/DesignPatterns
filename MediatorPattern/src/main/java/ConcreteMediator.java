import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

    //public ConcreteMediator(){}
    List<Employee> employeeList= new ArrayList<>();
    @Override
    public void register(Employee employee) {
        employeeList.add(employee);
    }

    public void displayEmployees(){
        for (Employee employee1: employeeList)
        {
            System.out.println(employee1.getEmployeeName());
        }
    }
    @Override
    public void sendMessage(Employee fromEmployee, Employee toEmployee, String msg) throws InterruptedException {
        if(fromEmployee.employeeType()=="UnauthorizedUser"){
            System.out.println("[ALERT Everyone] An outsider named "+ fromEmployee.getEmployeeName()+" trying to send some messages to "+ toEmployee.getEmployeeName());
            fromEmployee.receive(fromEmployee, ",you are not allowed to enter here.");
        }
        else if(employeeList.contains(fromEmployee)){
            if(employeeList.contains(toEmployee)){
                System.out.println("-----"+fromEmployee.getEmployeeName() +" posts some message at: "+ LocalDateTime.now()+"-----");
                Thread.sleep(1000);
            }
            else {
                System.out.println(fromEmployee.getEmployeeName() +" , your target recipient does not exist");
            }
        }
        else{
            System.out.println("[ALERT] An unregistered employee named "+ fromEmployee.getEmployeeName()+" trying to send some messages to "+ toEmployee.getEmployeeName());
            System.out.println(fromEmployee.getEmployeeName()+", you need to register yourself first.");
        }
    }
}
