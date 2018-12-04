package main;

import board.BoardController;
import board.BoardsHelper;
import player.Computer;
import player.ComputerPlayer;
import player.Player;
import utils.Message;

import java.util.Random;

class PlayGame {
    private ComputerPlayer computerPlayer;
    private Computer computer;
    private BoardsHelper board;
    private Message message;
    private Random random;
    private BoardController boardController;

    PlayGame() {
        this.computerPlayer = new ComputerPlayer();
        this.computer = new Computer();
        this.board = new BoardsHelper();
        this.message = new Message();
        this.random = new Random();
        this.boardController = new BoardController();
    }


    void playGame() {
        Player playerToStart = drawPlayerToStart();
        computer.generateBoard();
        computerPlayer.generateBoard();


        while (isGamePlayed(board)) {
            playerGameOrder(playerToStart);
        }
    }


    private boolean isGamePlayed(BoardsHelper board) {
        boolean continueToPlay = true;

        if (board.getComputerCorrectGuesses() == 10) {
            message.computerWinsTheGameInfo();
            continueToPlay = false;
        } else if (board.getComputerPlayerCorrectGuesses() == 10) {
            message.computerPlayerWinsTheGameInfo();
            continueToPlay = false;
        }

        return continueToPlay;
    }


    private Player drawPlayerToStart() {
        Player[] players = {computer, computerPlayer};
        return players[random.nextInt(players.length)];
    }

    private void playerGameOrder(Player playerToStart) {
        if (playerToStart.equals(computer)) {
            computerGame();
            computerPlayerGame();
        } else {
            computerPlayerGame();
            computerGame();
        }
    }

    private void computerGame() {
        board.printComputerGuesses();
        boardController.computerGuessPlayerShipsPlacement(computerPlayer, board);
    }

    private void computerPlayerGame() {
        board.printComputerPlayerGuesses();
        boardController.playerGuessPlayerShipsPlacement(computer, board);
    }
}
