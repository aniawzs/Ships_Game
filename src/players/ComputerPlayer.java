package players;

        import contollers.BoardController;
        import utils.Message;

public class ComputerPlayer extends Player {
    private BoardController boardController;
    private Message message;

    public ComputerPlayer() {
        this.boardController = new BoardController();
        this.message = new Message();
    }

    @Override
    public void enterShipsPositions() {
        int count = 0;

        while (count < 10) {
            message.enterShipXPositionValueInfo();
            int a = boardController.enteredNumberValidator();

            message.enterShipYPositionValueInfo();
            int b = boardController.enteredNumberValidator();


            if (getPlayerBoard()[a][b] == null) {
                getPlayerBoard()[a][b] = super.getSHIP_FIELD_NAME();
                count++;
            } else {
                message.enteringTheSameShipPositionInfo();
            }
        }
    }
}
