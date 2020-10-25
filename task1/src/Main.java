package task1;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        FileScannerService fileScannerService = new FileScannerService();
        fileScannerService.start(inputFileName, outputFileName);
    }
}
