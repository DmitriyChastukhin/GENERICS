public class Main {

    public static void main(String[] args) {

        MagicBox<String> boxString = new MagicBox<>( 6);
        boxString.add("Карандаш");
        boxString.add("Ручка");
        boxString.add("Ластик");
        boxString.add("Линейка");
        boxString.add("Маркер");
        System.out.println(boxString.pick());

        MagicBox<Integer> boxInt = new MagicBox<>( 3);
        boxInt.add(1);
        boxInt.add(2);
        boxInt.add(3);
        boxInt.add(4);
        boxInt.add(5);
        System.out.println(boxInt.pick());
    }
}
