import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class Handler extends DefaultHandler {

    private City city;
    private Street street;
    private Building building;
    private ArrayList<City> cities = new ArrayList<>();
    private StringBuilder stringBuilder;
    private static final String TAG_NAME_CITY = "city";
    private static final String TAG_NAME_AREA = "area";
    private static final String TAG_NAME_STREET = "street";
    private static final String TAG_NAME_BUILDING = "building";


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        stringBuilder = new StringBuilder();
        if (qName.equalsIgnoreCase(TAG_NAME_CITY)) {
            int area = Integer.parseInt(attributes.getValue(TAG_NAME_AREA));
            city = new City(null, area);
        } else if (qName.equalsIgnoreCase(TAG_NAME_STREET)) {
            street = new Street(null);
        } else if (qName.equalsIgnoreCase(TAG_NAME_BUILDING)) {
            building = new Building(null);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        stringBuilder.append(new String(ch, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase(TAG_NAME_CITY)) {
            city.setNameCity(stringBuilder.toString().trim());
            cities.add(city);
        } else if (qName.equalsIgnoreCase(TAG_NAME_STREET)) {
            street.setNameStreet(stringBuilder.toString().trim());
            city.getStreetList().add(street);
        } else if (qName.equalsIgnoreCase(TAG_NAME_BUILDING)) {
            building.setAddressBuilding(stringBuilder.toString().trim());
            street.getBuildingList().add(building);
        }
    }

    public ArrayList<City> getCities() {
        return cities;
    }
}
