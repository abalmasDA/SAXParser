import java.io.File;

public class FileWriter {
    private final String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
    private final String START_TEG_ROOT_ELEMENT = "<City catalog>\n";
    private final String END_TEG_ROOT_ELEMENT = "</City catalog>";

    private FileWriter fileWriter;

    public FileWriter createFileWriterXml(File NameFileToBeRecorded){
        FileWriter fileWriter  = new FileWriter(new File(NameFileToBeRecorded));
        return fileWriter;
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
