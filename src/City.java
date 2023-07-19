import java.util.ArrayList;


public class City {
    private String nameCity;
    private int areaCity;
    private ArrayList<Street> streetList;


    public City(String nameCity, int areaCity) {
        this.nameCity = nameCity;
        this.areaCity = areaCity;
        this.streetList = new ArrayList<>();
    }

    public String getNameCity() {
        return nameCity;
    }

    public int getAreaCity() {
        return areaCity;
    }

    public ArrayList<Street> getStreetList() {
        return streetList;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }
}
