import java.util.ArrayList;

public class Street {
    private String nameStreet;
    private ArrayList<Building> buildingList;

    public Street(String nameStreet) {
        this.nameStreet = nameStreet;
        this.buildingList = new ArrayList<>();
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public ArrayList<Building> getBuildingList() {
        return buildingList;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }
}
