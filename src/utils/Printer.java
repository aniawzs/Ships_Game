package utils;

public class Printer {
    public void print(String textToPrint) {
        System.out.println(textToPrint);
    }


    void printf(String textToPrint, Object formatter){
        System.out.printf(textToPrint, formatter);
    }
}
