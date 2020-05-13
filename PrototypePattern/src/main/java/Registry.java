import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<EmployeeType,Employee> employees = new HashMap<EmployeeType, Employee>();

    public Registry(){
        this.initialize();
    }

    public Employee getEmployee (EmployeeType employeeType){
        Employee employee = null;
        try {
          employee = (Employee) employees.get(employeeType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return employee;

    }


    private void initialize() {

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setEmpId("001");
        partTimeEmployee.setName("Yathushan");
        partTimeEmployee.setWorkingHours(5);

        FullTimeEmployee fullTimeEmployee =new FullTimeEmployee();
        fullTimeEmployee.setEmpId("002");
        fullTimeEmployee.setName("Raja");
        fullTimeEmployee.setBasicSalary(20000);
        fullTimeEmployee.setNoOfLeaves(15);

        employees.put(EmployeeType.PERMANENT,fullTimeEmployee);
        employees.put(EmployeeType.TRAINEE,partTimeEmployee);

    }

}
