package utils;

public class Message {
    private Printer printer = new Printer();

    public void enterShipXPositionValueInfo() {
        printer.print("Podaj wartość x dla nowego statku (przedział 0-4)");
    }

    public void enterShipYPositionValueInfo() {
        printer.print("Podaj wartość y dla nowego statku (przedział 0-4)");
    }

    public void enteringTheSameShipPositionInfo() {
        printer.print("Wybrane przez Ciebie współrzędne zostały już wcześniej wykorzystane!");
    }

    public void computerWinsTheGameInfo() {
        printer.print("Komputer wygrał grę!");
    }

    public void computerPlayerWinsTheGameInfo() {
        printer.print("Wygrałeś grę!");
    }

    public void printBreakers() {
        printer.print("------------");
    }

    public void printComputerPlayerGuessesInfo(int computerPlayerGuesses) {
        printer.printf("Twoje strzały (liczba poprawnych strzałów: %d) \n", computerPlayerGuesses);
    }

    public void printComputerGuessesInfo(int computerGuesses) {
        printer.printf("Oddane strzały przez komputer (liczba poprawnych strzalów: %d) \n", computerGuesses);
    }

    public void incorrectEnteredValueInfo() {
        printer.print("Niepoprawna wartość. Użyj liczby z zakresu z przedziału 0-4!");
    }

    public void computerEnteredYourShipPositionInfo() {
        printer.print("Komputer zatopił Twój statek!");
    }

    public void computerMissedYourShipPositionInfo() {
        printer.print("Komputer spudłował!");
    }

    public void playerFoundComputerShipPositionInfo() {
        printer.print("Trafiony zatopiony!");
    }

    public void playerMissedComputerShipPositionInfo() {
        printer.print("Spudłowałeś!");
    }

    public void playerEnterXComputerShipValue() {
        printer.print("Podaj wartość x statku przeciwnika. X musi być z przedziału 0-4!");
    }

    public void playerEnterYComputerShipValue() {
        printer.print("Podaj wartość y statku przeciwnika. Y musi być z przedziału 0-4!");
    }
}
