package contollers;

import helpers.BoardsHelper;
import players.Computer;
import players.ComputerPlayer;
import utils.Message;

import java.util.Random;
import java.util.Scanner;

public class BoardController {
    private Random random;
    private Scanner scanner;
    private Message message;
    private final static String SHIP_FIELD_NAME = "Ship";
    private final static String NONE_SHIP_FIELD_NAME = "X";

    public BoardController() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.message = new Message();
    }


    public void computerGuessPlayerShipsPlacement(ComputerPlayer computerPlayer, BoardsHelper board) {
        boolean isNull = true;

        while (isNull) {
            int x = random.nextInt(board.getComputerGuessesBoard().length);
            int y = random.nextInt(board.getComputerGuessesBoard().length);

            if (board.getComputerGuessesBoard()[x][y] == null) {
                if (computerPlayer.getPlayerBoard()[x][y].equals(SHIP_FIELD_NAME)) {
                    board.countComputerCorrectGuesses();
                    board.getComputerGuessesBoard()[x][y] = SHIP_FIELD_NAME;

                    message.computerEnteredYourShipPositionInfo();
                    message.printBreakers();

                } else {
                    board.getComputerGuessesBoard()[x][y] = NONE_SHIP_FIELD_NAME;
                    message.printBreakers();
                    message.computerMissedYourShipPositionInfo();
                    message.printBreakers();
                }
                isNull = false;
            }
        }
    }

    public void playerGuessPlayerShipsPlacement(Computer computer, BoardsHelper board) {
        boolean isNull = true;

        while (isNull) {
            message.playerEnterXComputerShipValue();
            int x = enteredNumberValidator();

            message.playerEnterYComputerShipValue();
            int y = enteredNumberValidator();

            if (board.getComputerPlayerGuessesBoard()[x][y] == null) {
                if (computer.getPlayerBoard()[x][y].equals(SHIP_FIELD_NAME)) {
                    board.countComputerPlayerCorrectGuesses();
                    board.getComputerPlayerGuessesBoard()[x][y] = SHIP_FIELD_NAME;

                    message.printBreakers();
                    message.playerFoundComputerShipPositionInfo();
                    message.printBreakers();

                } else {
                    board.getComputerPlayerGuessesBoard()[x][y] = NONE_SHIP_FIELD_NAME;
                    message.printBreakers();
                    message.playerMissedComputerShipPositionInfo();
                    message.printBreakers();
                }
                isNull = false;
            } else {
                message.enteringTheSameShipPositionInfo();
            }
        }
    }

    public int enteredNumberValidator() {
        int numberToCheck = scanner.nextInt();
        while (numberToCheck > 4 || numberToCheck < 0) {
            message.incorrectEnteredValueInfo();
            numberToCheck = scanner.nextInt();
        }

        return numberToCheck;
    }
}
