package even.filter;

import even.object.Message;

public class KeyWordFilter implements Filter{

    @Override
    public boolean doFilter(Message msg) {
        String message = msg.getMessage();
        if (message.contains("MMP")) {
           message =  message.replace("MMP","你好");
           msg.setMessage(message);
           return true;
        }
        return false;
    }
}
