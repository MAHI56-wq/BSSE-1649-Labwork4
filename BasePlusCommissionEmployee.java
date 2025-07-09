public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    
    public String toString() {
        return "Base-Salaried Commission Employee: " + super.toString() + "\nBase Salary: " + baseSalary;
    }
}
