package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileScannerService {

    private int loadedObjectsCounter = 0;
    private int invalidObjectsCounter = 0;
    private List<String> correctObjectsList = new ArrayList<>();
    private File inputFile;
    private Scanner fileScanner;
    private OutputFileWriter fileWriter;


    public void start(String inputFileName, String outputFileName) {
        initFile(inputFileName);
        initFileScanner();
        validateFileObjects();
        initOutputFileWriter(outputFileName);
        writeOutputFile();
    }

    private void initOutputFileWriter(String outputFileName) {
        fileWriter = new OutputFileWriter(outputFileName);
    }

    private void writeOutputFile() {
        fileWriter.writeOutputFile(loadedObjectsCounter,invalidObjectsCounter,correctObjectsList);
    }

    private void validateFileObjects() {
        while (fileScanner.hasNext()) {
            String eightBitsString = scanNextEightBits();
            BitsObject bitsObject = new BitsObject(eightBitsString);
            ++loadedObjectsCounter;
            if (bitsObject.isCorrectObject()) {
                correctObjectsList.add(eightBitsString);
            } else ++invalidObjectsCounter;
        }
    }

    private void initFileScanner() {
        try {
            this.fileScanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void initFile(String fileName) {
        inputFile = new File(fileName);
    }

    private String scanNextEightBits() {
        Pattern regex = Pattern.compile(".{8}");
        return fileScanner.findWithinHorizon(regex, 0);
    }

}