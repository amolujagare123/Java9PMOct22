package StringDemos;

public class StartEndContains {

    public static void main(String[] args) {

        String str = "Selenium tests web based applications";

        System.out.println(str.endsWith("ons"));  // true

        System.out.println(str.startsWith("Selnium")); // false

        System.out.println(str.contains("app"));// true

    }
}
