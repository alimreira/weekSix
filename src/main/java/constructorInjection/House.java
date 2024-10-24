package constructorInjection;

import org.springframework.stereotype.Component;

@Component
public class House {

    private String location;
    private String structure;
    private int rooms;
    private Rent rent; // Injected dependency

    public House(String location, String structure, int rooms, Rent rent) {
        this.location = location;
        this.structure = structure;
        this.rooms = rooms;
        this.rent = rent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", structure='" + structure + '\'' +
                ", rooms=" + rooms +
                ", rent=" + rent +
                '}';
    }
}
