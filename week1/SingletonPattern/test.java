public class test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        logger1.logs("First message from logger1.");
        logger2.logs("Second message from logger2.");

        if (logger1 == logger2) {
            System.out.println("logger1 and logger2 are the ssame");
        } else {
            System.out.println("Different logger");
        }
    }
}
