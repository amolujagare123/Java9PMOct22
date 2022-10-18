package InheritanceDemos;

public class Employee {

    int salary = 20000;

    void empWork()
    {
        System.out.println("9 to 5 job");
    }
}

class Programmer extends Employee
{
    int bonus = 5000;

    void programmerWork()
    {
        System.out.println("Coding...");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
    }
}
