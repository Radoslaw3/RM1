package main;

import controller.CardSortClass;

public class Main {
    public static void main(String[] args) {
        CardSortClass crdSorter = new CardSortClass();
        crdSorter.createCards();
        crdSorter.sortCards();
        crdSorter.showCards();

    }
}
