package even.obeject;

public class BaomaCar extends ICar{

    private String seat;

    private String central;


    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getCentral() {
        return central;
    }

    public void setCentral(String central) {
        this.central = central;
    }


    @Override
    public String toString() {
        return "BaomaCar{" +
                "seat='" + seat + '\'' +
                ", central='" + central + '\'' +
                '}';
    }
}
