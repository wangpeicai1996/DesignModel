package even.filter;

import even.object.Message;

public class SymbolFilter implements Filter{

    @Override
    public boolean doFilter(Message msg) {
        String messge = msg.getMessage();
        if (messge.contains("@")) {
            messge = messge.replaceAll("@","-");
            msg.setMessage(messge);
            return true;
        }
        return false;
    }
}
