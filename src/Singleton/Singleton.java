package Singleton;

public class Singleton {
    public static void main(String[] args) {
        SomeLogger obj = SomeLogger.getInstance();
        obj.setLog("Some info");
        System.out.println(obj.getLog());

        SomeLogger obj2 = SomeLogger.getInstance();
        obj2.setLog("Some other info");
        System.out.println(obj2.getLog());

        SomeLogger logger3 = SomeLogger.getInstance();
        System.out.println(logger3.getLog());

    }

}
