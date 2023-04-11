package week5;

public class AsteriskLogger implements Logger {
    String stars = "***";
    String erWrd = "Error: ";


    @Override
    public void Log(String logMessage) {
        System.out.println(stars + logMessage + stars);
    }

    @Override
    public void Error(String errMessage) {
        int starLength = (2*stars.length())+ erWrd.length() + errMessage.length();
        String starLine = stringAdd("*", starLength);
        System.out.println(starLine);
        System.out.println(stars + erWrd + errMessage + stars);
        System.out.println(starLine);

    }

    public static String stringAdd(String word, int n) {
        String phrase = "";
        for (int i = 0; i < n; i++) {
            phrase += word;
        }
        return phrase;
    }
}
