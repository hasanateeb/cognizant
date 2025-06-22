
public class Logger {
    private static Logger log = new Logger();

    private Logger() {
        System.out.println("Logger created!");
    }

    public static Logger getLogger() {
        return log;
    }

    public void logs(String message) {
        System.out.println("Log: " + message);
    }
}
