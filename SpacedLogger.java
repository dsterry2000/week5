package week5;

public class SpacedLogger implements Logger{
    private String space = " ";
    private String erWrd = "Error: ";






    public String msgArraymsg(String message) {
        char[] msg = message.toCharArray();
        String spacedMsg = "";
        for (int i = 0; i < message.length(); i++) {
            spacedMsg += (msg[i] + space);
        }
        return spacedMsg;
    }

    @Override
    public void Log(String logMessage) {
       System.out.println(msgArraymsg(logMessage));
    }

    @Override
    public void Error(String errMessage) {

        System.out.println(erWrd + msgArraymsg(errMessage));

    }
}




