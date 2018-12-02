package players;

import java.util.Random;

public class Computer extends Player {
    private Random random;

    public Computer() {
        this.random = new Random();
    }

    @Override
    public void enterShipsPositions() {
        int count = 0;

        while (count < 10) {
            int a = random.nextInt(getPlayerBoard().length);
            int b = random.nextInt(getPlayerBoard().length);

            if (getPlayerBoard()[a][b] == null) {
                getPlayerBoard()[a][b] = getSHIP_FIELD_NAME();
                count++;
            }
        }
    }
}
