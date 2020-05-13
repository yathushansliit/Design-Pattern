public class PartTimeEmployee extends Employee {

    private int workingHours;

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "workingHours=" + workingHours +
                '}';
    }
}
