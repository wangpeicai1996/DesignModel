package even.object;

public class LuxuryMealPackage extends MealPackage{


    private String coffe;

    private String chicken;

    private String cole;

    private String icecream;

    private String chips;

    private String pizza;


    public String getCoffe() {
        return coffe;
    }

    public void setCoffe(String coffe) {
        this.coffe = coffe;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getCole() {
        return cole;
    }

    public void setCole(String cole) {
        this.cole = cole;
    }

    public String getIcecream() {
        return icecream;
    }

    public void setIcecream(String icecream) {
        this.icecream = icecream;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }


    @Override
    public String toString() {
        return "LuxuryMealPackage{" +
                "coffe='" + coffe + '\'' +
                ", chicken='" + chicken + '\'' +
                ", cole='" + cole + '\'' +
                ", icecream='" + icecream + '\'' +
                ", chips='" + chips + '\'' +
                ", pizza='" + pizza + '\'' +
                '}';
    }
}
