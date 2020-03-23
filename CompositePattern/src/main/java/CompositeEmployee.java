import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {

    //private static int employeeCount=0;
    private int employeeCount=0;
    private String name;
    private String dept;
    //The container for child objects
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String dept)
    {
        this.name = name;
        this.dept = dept;
        controls = new ArrayList<IEmployee>();
    }

    public  void addEmployee(IEmployee e){
        controls.add(e);
    }

    public void removeEmployee(IEmployee e){
        controls.remove(e);
    }
    @Override
    public void printStructures() {
        System.out.println("\t" + this.name + " works in  " + this.dept);
        for(IEmployee e: controls)
            e.printStructures();
    }

    @Override
    public int getEmployeeCount() {
        employeeCount=controls.size();
        System.out.println("Employee Size before"+employeeCount);
        for(IEmployee e:controls)
            employeeCount+=e.getEmployeeCount();
        return employeeCount;
    }
}
