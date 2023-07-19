import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу.
 * Необхідно, щоб проект створював XML-файл і будував дерево (місто, назва вулиці, будинок).
 * У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).
 */

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        Handler handler = new Handler();
        Parser parser = new Parser();
        parser.createParser(new File("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\SAXParser\\src\\FileToBeParsed.xml"), handler);
        ArrayList<City> listCities = handler.getCities();

        FileWriterXml fileWriterXml = new FileWriterXml();
        FileWriter fileWriter = fileWriterXml.createFileWriterXml("C:\\Users\\abalm\\odrive\\Google Drive IT\\IteaJavaPro\\SAXParser\\src\\FileRecorded.xml");

        fileWriter.write(fileWriterXml.createStartTegRootElement());
        for (int i = 0; i < listCities.size(); i++) {
            City city = listCities.get(i);
            fileWriter.write("    <city area=\"" + city.getAreaCity() + "\">" + city.getNameCity() + "</city>\n");

            ArrayList<Street> streets = city.getStreetList();
            for (int j = 0; j < streets.size(); j++) {
                Street street = streets.get(j);
                fileWriter.write("        <street>" + street.getNameStreet() + "</street>\n");

                ArrayList<Building> buildings = street.getBuildingList();
                for (int k = 0; k < buildings.size(); k++) {
                    Building building = buildings.get(k);
                    fileWriter.write("            <building>" + building.getAddressBuilding() + "</building>\n");
                }
            }
        }
        fileWriter.write(fileWriterXml.createEndTegRootElement());
        fileWriter.close();

    }

}