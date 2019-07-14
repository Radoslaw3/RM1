package model;

import java.util.Comparator;

//public class Card implements Comparable<Card>{  //ta uzywa compareTo, metody do sortowania, co pozwoli jedynie sortowac po jednej z cech/pola np. codeID. Czyli metoda wywolujaca to Collections.sort(ArrayLista z kartami).
public class Card {
    private static int id = 0;
    private String codeID;
    private String name;
    private String type;
    private String job;
    private String element;//enum
    private int cost; //enum
    private String rarity;
    private int power;
    private String category;
    private String set;

/*    public int compareTo(Card c){
        return codeID.compareTo(c.getCodeID());
    }*/


    public Card(String codeID, String name, String type, String job, String element, int cost, String rarity, int power, String category, String set) {
        id++;
        this.codeID = codeID;
        this.name = name;
        this.type = type;
        this.job = job;
        this.element = element;
        this.cost = cost;
        this.rarity = rarity;
        this.power = power;
        this.category = category;
        this.set = set;

    }

    public int getId() {
        return id;
    }

    public String getCodeID() {
        return codeID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getJob() {
        return job;
    }

    public String getElement() {
        return element;
    }

    public int getCost() {
        return cost;
    }

    public String getRarity() {
        return rarity;
    }

    public int getPower() {
        return power;
    }

    public String getCategory() {
        return category;
    }

    public String getSet() {
        return set;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", codeID='" + codeID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", job='" + job + '\'' +
                ", element='" + element + '\'' +
                ", cost=" + cost +
                ", rarity='" + rarity + '\'' +
                ", power=" + power +
                ", category='" + category + '\'' +
                ", set='" + set + '\'' +
                '}';
    }
}
