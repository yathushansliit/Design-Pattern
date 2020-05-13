public class FullTimeEmployee extends Employee{

    private int basicSalary;
    private int noOfLeaves;

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getNoOfLeaves() {
        return noOfLeaves;
    }

    public void setNoOfLeaves(int noOfLeaves) {
        this.noOfLeaves = noOfLeaves;
    }


    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "basicSalary=" + basicSalary +
                ", noOfLeaves=" + noOfLeaves +
                '}';
    }
}
