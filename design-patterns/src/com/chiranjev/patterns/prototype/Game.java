package com.chiranjev.patterns.prototype;

public class Game implements Cloneable{

    private Membership membership;
    private int id;
    private String name;

    Game(){

    }

    Game(Game game) { // copy constructor
        this.id = game.id;
        this.name = game.name;
        this.membership = new Membership();
    }

    @Override
    public String toString() {
        return "Game{" +
                "membership=" + membership +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMembership(new Membership());
        return game;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
