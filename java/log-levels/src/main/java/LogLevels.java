import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceAll("\\[.*\\]:","").trim();
    }

    public static String logLevel(String logLine) {
        String[] temp = logLine.replaceAll("[\\[\\]:]", "").split(" ");
        return temp[0].toLowerCase(Locale.ROOT);

    }

    public static String reformat(String logLine) {
        String logLine1 = logLine.replaceAll("[\\[\\]'\\r|\\n|\\t]", "").trim();
        String[] temp = logLine1.split(": ");
        String result = (temp[1]+" "+"("+temp[0].toLowerCase(Locale.ROOT)+")").trim();
        return result;
    }
}
