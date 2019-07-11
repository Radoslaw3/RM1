package model;

public class Card {
    private int id;
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


    public Card(String codeID, String name, String type, String job, String element, int cost, String rarity, int power, String category, String set) {
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
}
