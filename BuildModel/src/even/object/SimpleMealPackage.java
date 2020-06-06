package even.object;

public class SimpleMealPackage extends MealPackage{

    private String chicken;

    private String cole;

    private String icecream;

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

    @Override
    public String toString() {
        return "SimpleMealPackage{" +
                "chicken='" + chicken + '\'' +
                ", cole='" + cole + '\'' +
                ", icecream='" + icecream + '\'' +
                '}';
    }
}
