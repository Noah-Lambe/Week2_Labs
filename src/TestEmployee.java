public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "Doe", 0);
        Employee e2 = new Employee(2, "James", "Smith", 0);

        System.out.println("Employee 1:");
        System.out.println("ID: " + e1.getID());
        System.out.println("Name: " + e1.getName());
        e1.setSalary(4500);
        System.out.println("Salary: $" + e1.getSalary());
        System.out.println("Annual Salary: $" + e1.getAnnualSalary());
        System.out.println("Raise Salary by 20%:");
        System.out.println("New Salary: $" + e1.raiseSalary(20));
        System.out.println(e1);

        System.out.println();
        System.out.println("Employee 2:");
        System.out.println("ID: " +e2.getID());
        System.out.println("Name: " + e2.getName());
        e2.setSalary(5000);
        System.out.println("Salary: $" + e2.getSalary());
        System.out.println("Annual Salary: $" + e2.getAnnualSalary());
        System.out.println("Raise Salary by 20%:");
        System.out.println("New Salary: $" + e2.raiseSalary(20));
        System.out.println(e2);
    }
}
