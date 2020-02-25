package com.baizhi.entity;

public class Asx {
    private  String id;
    private  String ha;

    public Asx(String id, String ha) {
        this.id = id;
        this.ha = ha;
    }

    public Asx() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHa() {
        return ha;
    }

    public void setHa(String ha) {
        this.ha = ha;
    }

    @Override
    public String toString() {
        return "Asx{" +
                "id='" + id + '\'' +
                ", ha='" + ha + '\'' +
                '}';
    }
}
