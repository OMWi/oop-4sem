public class Field {
    private int[][] field;
    private final int size;
    private final int winnerLength;
    //need to add number of turns

    //for saving
    public Memento createMemento() {
        Memento memento = new Memento(field, size);
        return memento;
    }

    //for restoring
    public void setMemento(Memento memento) {
        field = memento.getState();
    }

    public Field(int size, int length) {
        this.size = size;
        this.winnerLength = length;
        field = new int[size][size];
    }

    public void changeField(int[] coord, int value) {
        field[coord[1]][coord[0]] = value;
    }


    @Override
    public String toString() {
        String data = "";
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                data += Integer.toString(field[y][x]) + ' ';
            }
            data += '\n';
        }
        return data;
    }

    public int checkWinner() {
        int current = 0, previous = 0;
        int winner = 0;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (size - x < winnerLength && size - y < winnerLength) continue;
                if (field[y][x] == 0) continue;

                for (int player = 1; player <= 2; player++) {
                    if (field[y][x] == player) {
                        boolean statementX = size - x >= winnerLength, statementY = size - y >= winnerLength;
                        if (statementX) {
                            winner = player;
                            for (int i = x + 1; i < x + winnerLength; i++) {
                                if (field[y][i] != 1) {
                                    winner = 0;
                                    break;
                                }
                            }
                            if (winner == player) return winner;
                        }
                        if (statementY) {
                            winner = player;
                            for (int i = y + 1; i < y + winnerLength; i++) {
                                if (field[i][x] != 1) {
                                    winner = 0;
                                    break;
                                }
                            }
                            if (winner == player) return winner;
                        }
                        if (statementX && statementY) {
                            winner = player;
                            for (int i = x + 1, j = y + 1; i < x + winnerLength; i++, j++) {
                                if (field[j][i] != 1) {
                                    winner = 0;
                                    break;
                                }
                            }
                            if (winner == player) return winner;
                        }
                    }
                }
            }
        }
        return winner;
    }
}