import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger logger;
    private static SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.mm.yyyy HH:mm:ss.SSS");
    protected int num = 0;   // номер сообщения

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + formatForDateNow.format(new Date()) + "  " + num++ + "] " + msg);
    }
}
