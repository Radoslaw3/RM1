package controller;

import model.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSortClass {
        List<Card> cards = new ArrayList<Card>();
     //List<String> cards = new ArrayList<>();
     Collections collections;

     public void createCards() {
         Card c1 = new Card("1-003R", "Cerith", "Forvard", "Ancient", "Wind", 2, "R", 5000, "Final Fantasy VII", "Opus I");
         Card c2 = new Card("3-003R", "Berith", "Forvard", "Ancient", "Wind", 2, "R", 5000, "Final Fantasy VII", "Opus I");
         Card c3 = new Card("2-003R", "Aerith", "Forvard", "Ancient", "Wind", 2, "R", 5000, "Final Fantasy VII", "Opus I");
         cards.add(c1);
         cards.add(c2);
         cards.add(c3);
     }

     public void sortCards(){
         //System.out.println(cards);
         //Collections.sort(cards); //to dziala ze zwykla defaultowa metoda compareTo. Fajnie sortuje ale tylko po jednej z cech
        // System.out.println(cards);
         TaliaCardCompare compareTwoCards = new TaliaCardCompare(2);
         Collections.sort(cards, compareTwoCards);

     }

     public void showCards()  {

        for (Card a : cards) {
            System.out.println(a);
        }
    }

}
