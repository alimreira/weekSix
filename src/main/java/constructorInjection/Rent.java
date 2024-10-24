package constructorInjection;

import org.springframework.stereotype.Component;

@Component
public class Rent {

    private float cost;
    private int duration;
    private String rentItem;


    public Rent(float cost, int duration, String rentItem) {
        this.cost = cost;
        this.duration = duration;
        this.rentItem = rentItem;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRentItem() {
        return rentItem;
    }

    public void setRentItem(String rentItem) {
        this.rentItem = rentItem;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "cost=" + cost +
                ", duration=" + duration +
                ", rentItem='" + rentItem + '\'' +
                '}';
    }
}
