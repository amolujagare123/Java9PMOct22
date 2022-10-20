package InheritanceDemos;

public class Society {
    int maintenance = 1000;
    void services()
    {
        System.out.println("inside services method of society");
    }

    Society()
    {
        System.out.println("inside Society constructor");
    }

    Society(int members)
    {
        maintenance = members * maintenance;
        System.out.println("inside Society constructor");
        System.out.println("maintenance="+maintenance);
    }
}
class BWing extends Society
{
    BWing()
    {
        super(10); // gives call to parent class constructor
        System.out.println("inside BWing constructor");
    }

    int  maintenance = 1500;
    void services()
    {
        System.out.println("inside services method of BWing");
    }
    void checkWingsDetails()
    {
        System.out.println("maintenance="+maintenance);
        services();

        System.out.println("maintenance="+super.maintenance);
        super.services();
    }
    public static void main(String[] args) {
        BWing ob = new BWing();
        ob.checkWingsDetails();
    }
}
