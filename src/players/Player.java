package players;

public abstract class Player {
    private String[][] playerBoard;
    private final static String SHIP_FIELD_NAME = "Ship";
    private final static String NONE_SHIP_FIELD_NAME = "X";


    Player() {
        playerBoard = new String[5][5];
    }


    public String[][] getPlayerBoard() {
        return playerBoard;
    }

    public void generateBoard() {
        enterShipsPositions();
        for (int i = 0; i < playerBoard.length; i++) {
            for (int j = 0; j < playerBoard.length; j++) {
                if (playerBoard[i][j] == null) {
                    playerBoard[i][j] = NONE_SHIP_FIELD_NAME;
                }
            }
        }
    }

    public abstract void enterShipsPositions();

    String getSHIP_FIELD_NAME() {
        return SHIP_FIELD_NAME;
    }
}
