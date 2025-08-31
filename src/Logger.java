public class Logger {
    protected int num = 1;

    private static Logger instance = null;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}
