package Singleton;

public class SomeLogger {

    private static SomeLogger object = null;
    private String log;

    private SomeLogger() {
        log = "";
    }

    public static SomeLogger getInstance() {
        if (object == null) {
            object = new SomeLogger();
        }
        return object;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log += "Log: " + log + "\n";
    }
}
