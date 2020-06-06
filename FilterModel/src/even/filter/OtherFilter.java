package even.filter;

import even.object.Message;

public class OtherFilter implements Filter{
    @Override
    public boolean doFilter(Message msg) {
        String message = msg.getMessage();
        message = message + "责任链模式过滤";
        msg.setMessage(message);
        return true;
    }
}
