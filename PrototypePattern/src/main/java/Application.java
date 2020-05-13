public class Application {
    public static void main(String[] args) {
        Registry registry =new Registry();

        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) registry.getEmployee(EmployeeType.PERMANENT);
        System.out.println(fullTimeEmployee);

        fullTimeEmployee.setName("Shabithan");

        System.out.println(fullTimeEmployee);

        FullTimeEmployee fullTimeEmployee1 = (FullTimeEmployee) registry.getEmployee(EmployeeType.PERMANENT);
        System.out.println(fullTimeEmployee1);

        

    }
}
