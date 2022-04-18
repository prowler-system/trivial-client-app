import java.io.IOException;
import java.util.TimeZone;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TrivialClientApplication {

    public static final String MY_LOG_PATH = "/Users/nitpatel/my.log";

    static {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$s [%4$s] [%2$s] %5$s%6$s%n");
    }

    public static void main(String arg[]) throws IOException {
        Logger logger = Logger.getLogger(TrivialClientApplication.class.getName());
        FileHandler fh;
        fh = new FileHandler(MY_LOG_PATH, true);
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);

        for (int i = 0; i < 30; i++) {
            if (i%10 == 0)
                //No violation as it has 8 digits
                logger.info(" Hello from TrivialClientApplication with mobile number +91 98678992  !!");
            else if (i%19 == 0)
                logger.info(" Hello from TrivialClientApplication with bank account number 911200091!!");
            else if (i%27 == 0)
                logger.info(" Hello from TrivialClientApplication with credit card 4012888888881881!!");
            else if (i%29 == 0)
                logger.info(" Hello from TrivialClientApplication with credit card 4012888888881881 and mobile +91 9867899222!!");
            else
                logger.info("Hello from TrivialClientApplication!!");
        }
    }
}
