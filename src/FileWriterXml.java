import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterXml {
    private final String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
    private final String START_TEG_ROOT_ELEMENT = "<City_catalog>\n";
    private final String END_TEG_ROOT_ELEMENT = "</City_catalog>";

    private FileWriterXml fileWriter;

    public FileWriter createFileWriterXml(String pathName) throws IOException {
        return new FileWriter(new File(pathName));
    }

    public String createHeader() {
        return HEADER;
    }

    public String createStartTegRootElement() {
        return START_TEG_ROOT_ELEMENT;
    }

    public String createEndTegRootElement() {
        return END_TEG_ROOT_ELEMENT;
    }


}
