public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    
    public double earnings() {
        if (hours <= 40)
            return wage * hours;
        else
            return 40 * wage + (hours - 40) * wage * 1.5;
    }

    
    public String toString() {
        return "Hourly Employee: " + super.toString() + "\nHourly Wage: " + wage + "; Hours Worked: " + hours;
    }
}
