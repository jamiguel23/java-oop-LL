public class Main {

    public static void main(String[] args) {
        Employee one = new Employee(Sally, LA, 70000, 34);
        Employee two = new Employee(Matt, NYC, 65000, 32);

        two.raiseSalary();

        System.out.println("employee 1 " + one )
        System.out.println("employee 2 with salary increse" + two )

    }
}