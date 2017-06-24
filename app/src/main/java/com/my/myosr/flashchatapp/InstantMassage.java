package com.my.myosr.flashchatapp;


public class InstantMassage {
    private String massage;
    private String author;

    public InstantMassage(String massage, String author) {
        this.massage = massage;
        this.author = author;
    }

    public InstantMassage() {
    }

    public String getMassage() {
        return massage;
    }

    public String getAuthor() {
        return author;
    }
}
