package InheritanceDemos.polymorphism;

class TVShowroom
{
    public void channels()
    {
        System.out.println("Tv Showroom channels");
    }

    void settings()
    {
        System.out.println("Tv Showroom settings");
    }

    void volume()
    {
        System.out.println("Tv Showroom volume");
    }
}

class Samsung extends  TVShowroom
{
    public void channels()
    {
        System.out.println("Samsung channels");
    }

    void settings()
    {
        System.out.println("Samsung settings");
    }

    void volume()
    {
        System.out.println("Samsung volume");
    }
}

class Onida extends  TVShowroom
{
    public void channels()
    {
        System.out.println("Onida channels");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }

    void volume()
    {
        System.out.println("Onida volume");
    }
}

class LG extends  TVShowroom
{
    public void channels()
    {
        System.out.println("LG channels");
    }

    void settings()
    {
        System.out.println("LG settings");
    }

    void volume()
    {
        System.out.println("LG volume");
    }
}


public class OverridingDemo {

    public static void main(String[] args) {

        TVShowroom tv = new TVShowroom();
        tv.channels();
        tv.volume();
        tv.settings();

        //TVShowroom tv1; // object reference / reference variable

        TVShowroom tvShowroom = new Samsung(); // upcasting
        tvShowroom.channels();
        tvShowroom.volume();
        tvShowroom.settings();


    }
}
