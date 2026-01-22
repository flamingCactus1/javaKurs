package Abstraction.abstractClassesChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(new ArrayList<ProductForSale>());

        store.createAssortment();

        store.mainAction();
    }
}
