package Bt_ApdungAdapter;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(2);
        number.add(6);
        number.add(7);
        number.add(8);

        CollectionUtilsAdapter collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);
        client.printMaxValue(number);
    }
}
