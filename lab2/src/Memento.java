public class Memento {
    private int[][] field;
    public int[][] getState() {
        return field;
    }
    public void setState(int[][] field, int size) {
        this.field = new int[size][size];
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                this.field[y][x] = field[y][x];
            }
        }
    }
    public Memento(int[][] field, int size) {
        setState(field, size);
    }
}
