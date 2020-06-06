package even.object;

/**
 * 需要过滤处理的对象
 */
public class Message {

    private  String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
