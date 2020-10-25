package task2.converters;

public class DecimalToBinConverter extends Converter {

    @Override
    public void convert(String input) {
        try{
            convertedNumber= Integer.toBinaryString(Integer.parseInt(input));
            displayNumber();
        }
        catch (NumberFormatException e){
            System.err.println("NumberFormatException occurred for input: "+ input);
        }
    }

}
