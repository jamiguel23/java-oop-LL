public class Employee {
    String name;
    String location;
    double salary;
    int age;

    Employee(Sting name, String location, double salary, int age){
        this.name = name;
        this.location = name;
        this.salary = salary;
        this.age = age;
    }

    void raiseSalary(){
        this.salary = this.salary * 2
    }

}