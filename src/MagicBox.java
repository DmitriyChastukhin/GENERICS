import java.util.Random;

public class MagicBox<T> {

    private T item;
    private int sizeBox;
    private T[] itemsInBox;
    private Random random = new Random();

    public MagicBox (int sizeBox) {
        this.sizeBox = sizeBox;
        itemsInBox = (T[]) new Object[sizeBox];
    }

    public boolean add (T item) {
        for (int i = 0; i < sizeBox; i++) {
            if (itemsInBox[i] == null) {
                itemsInBox[i] = item;
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public T pick() {
        int emptyCells = 0;
        int randomInt;
        for (int i = 0; i < sizeBox; i++) {
            if (itemsInBox[i] == null) {
                emptyCells++;
            }
        }
        if (emptyCells > 0) {
            throw new RuntimeException("Коробка не полна, осталось ещё " + emptyCells + "  ячеек заполнить");
        } else {
            randomInt = random.nextInt(sizeBox);
            return itemsInBox[randomInt];
        }
    }
}
