package helpers;

import utils.Message;
import utils.Printer;

import java.util.Arrays;

public class BoardsHelper {
    private String[][] computerPlayerGuessesBoard;
    private int computerPlayerCorrectGuesses = 0;
    private String[][] computerGuessesBoard;
    private int computerCorrectGuesses = 0;
    private Message message;
    private Printer printer;


    public BoardsHelper() {
        this.computerPlayerGuessesBoard = new String[5][5];
        this.computerGuessesBoard = new String[5][5];
        this.message = new Message();
        this.printer = new Printer();
    }

    public String[][] getComputerPlayerGuessesBoard() {
        return computerPlayerGuessesBoard;
    }

    public String[][] getComputerGuessesBoard() {
        return computerGuessesBoard;
    }

    public int getComputerPlayerCorrectGuesses() {
        return computerPlayerCorrectGuesses;
    }

    public int getComputerCorrectGuesses() {
        return computerCorrectGuesses;
    }

    public void countComputerCorrectGuesses() {
        computerCorrectGuesses++;
    }

    public void countComputerPlayerCorrectGuesses() {
        computerPlayerCorrectGuesses++;
    }


    public void printComputerPlayerGuesses() {
        message.printComputerPlayerGuessesInfo(computerPlayerCorrectGuesses);
        printGuessesBoard(computerPlayerGuessesBoard);
        message.printBreakers();
    }

    public void printComputerGuesses() {
        message.printComputerGuessesInfo(computerCorrectGuesses);
        printGuessesBoard(computerGuessesBoard);
    }


    private void printGuessesBoard(String[][] guessesBoard){
        printer.print(Arrays.deepToString(guessesBoard).replace("], ", "]\n"));
    }


}
