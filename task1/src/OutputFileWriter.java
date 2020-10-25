package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFileWriter {
    private String outputFileName;
    private FileWriter fileWriter;

    public OutputFileWriter(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    public void writeOutputFile(int loadedObjectsCounter, int invalidObjectsCounter, List<String> correctObjectsList) {

        try {
            this.fileWriter = new FileWriter(outputFileName);
            fileWriter.write(loadedObjectsCounter + "\n");
            fileWriter.write(invalidObjectsCounter + "\n");
            for (String object : correctObjectsList) fileWriter.write(object);
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("An error has occurred while writing output file");
        }
    }
}
