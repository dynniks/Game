package com.example.game;

public class Situation {
    private String description;
    private String choice1,choice2;
    private int pp1,money1,popularity1,army1,economy1;
    private int pp2,money2,popularity2,army2,economy2;
    private int connected1, connected2;
    public Situation(String description,String choice1,String choice2,int pp1, int money1, int popularity1, int army1, int economy1, int pp2, int money2, int popularity2, int army2, int economy2, int connected1, int connected2)
    {
        this.army1 = army1;
        this.army2 = army2;
        this.pp1 = pp1;
        this.pp2 = pp2;
        this.money1 = money1;
        this.money2 = money2;
        this.economy1 = economy1;
        this.economy2 = economy2;
        this.popularity1 = popularity1;
        this.popularity2 = popularity2;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.description = description;
        this.connected1 = connected1;
        this.connected2 = connected2;
    }
    public String getDescription()
    {
        return description;
    }
    public String getChoice1()
    {
        return choice1;
    }
    public String getChoice2()
    {
        return choice2;
    }
    public int getPp1()
    {
        return pp1;
    }
    public int getPp2()
    {
        return pp2;
    }
    public int getArmy1()
    {
        return army1;
    }
    public int getArmy2()
    {
        return army2;
    }
    public int getEconomy1()
    {
        return economy1;
    }
    public int getEconomy2()
    {
        return economy2;
    }
    public int getMoney1()
    {
        return money1;
    }
    public int getMoney2()
    {
        return money2;
    }
    public int getPopularity1()
    {
        return popularity1;
    }
    public int getPopularity2()
    {
        return popularity2;
    }
    public int getConnected1()
    {
        return connected1;
    }
    public int getConnected2()
    {
        return connected2;
    }
}
