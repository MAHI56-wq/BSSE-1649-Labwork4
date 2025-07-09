public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Hakib", "Islam", "111-11-1111", 800.0);
        employees[1] = new HourlyEmployee("Joy", "Haque", "222-22-2222", 16.75, 42);
        employees[2] = new CommissionEmployee("Mansib", "Roy", "333-33-3333", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Sajid", "Labib", "444-44-4444", 5000, 0.04, 300);

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(employee.getBaseSalary() * 1.10);
                System.out.println("New base salary with 10% increase: " + employee.getBaseSalary());
            }

            System.out.println("Earnings: $" + currentEmployee.earnings());
            System.out.println("--------------------------------------");
        }
    }
}
