package task2.converters;

public class BinToDecimalConverter extends Converter {
    @Override
    public void convert(String input) {
        try {
            convertedNumber = Integer.toString(Integer.parseInt(input, 2));
            displayNumber();
        }
        catch (NumberFormatException e){
            System.err.println("NumberFormatException occurred for input: "+ input);
        }
    }
}
