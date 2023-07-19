import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Parser {

    public Parser() {
    }

    public void createParser(File fileToBeParsed, Handler handler) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory newFactory = SAXParserFactory.newInstance();
        SAXParser newSaxParser = newFactory.newSAXParser();
        newSaxParser.parse(fileToBeParsed, handler);
    }

}
