package controller;

import model.Card;

import java.util.Comparator;

public class TaliaCardCompare implements Comparator<Card> {
    private int sorter = 0;
    public TaliaCardCompare() {
    }
    public TaliaCardCompare(int i) {
        this.sorter = i;
    }

    public int compare(Card c1, Card c2) {
        if (sorter == 1) {
            //return c1.getId().compareTo(c2.getId());
        } else if (sorter == 2) {
            return c1.getCodeID().compareTo(c2.getCodeID());
        } else if (sorter == 3) {
            return c1.getName().compareTo(c2.getName());
        } else if (sorter == 4) {
            return c1.getType().compareTo(c2.getType());
        } else if (sorter == 5) {
            return c1.getJob().compareTo(c2.getJob());
        } else if (sorter == 6) {
            return c1.getElement().compareTo(c2.getElement());
        } else if (sorter == 7) {
            //return c1.getCost().compareTo(c2.getCost());
        } else if (sorter == 8) {
            //return c1.getRarity().compareTo(c2.getRarity());
        } else if (sorter == 9) {
            //return c1.getPower().compareTo(c2.getPower());
        } else if (sorter == 10) {
            return c1.getCategory().compareTo(c2.getCategory());
        } else if (sorter == 11) {
            return c1.getSet().compareTo(c2.getSet());
        } else {
            System.out.println("Wrong sort number selected");
        }
        return 0; //to be corrected
    }

}
