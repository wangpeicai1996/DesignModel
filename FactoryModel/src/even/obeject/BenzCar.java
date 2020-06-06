package even.obeject;

public class BenzCar extends ICar {

    private String type;

    private String window;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "BenzCar{" +
                "type='" + type + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
