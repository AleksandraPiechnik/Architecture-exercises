package task1;

public class BitsObject {
    String data;

    public BitsObject(String data) {
        this.data = data;
    }

    public  boolean isCorrectObject() {
        String msg = data.substring(4, 7);
        if (msg.equals("000")) return false;
        if (!isControlSumCorrect()) {
            System.err.println("Occurred object with invalid control sum in " + data);
            return false;
        } else return true;
    }

    private  boolean isControlSumCorrect() {
        char unitBit = data.charAt(3); // a bit that indicates whether a number is even or odd
        char controlSumNumber = data.charAt(7);

        if (unitBit == controlSumNumber) return true;
        return false;
    }


}
