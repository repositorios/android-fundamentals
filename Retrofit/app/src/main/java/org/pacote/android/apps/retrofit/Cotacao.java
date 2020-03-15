package org.pacote.android.apps.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cotacao {

    @SerializedName("high")
    public float maior;
    @SerializedName("low")
    public float menor;
    public float vol;
    public float last;
    public float buy;
    public float sell;
    public Integer date;

    @Expose(deserialize = false)
    private String nome;
    @Expose(deserialize = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getHigh() {
        return maior;
    }

    public void setHigh(float high) {
        this.maior = high;
    }

    public float getLow() {
        return menor;
    }

    public void setLow(float low) {
        this.menor = low;
    }

    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
    }

    public float getLast() {
        return last;
    }

    public void setLast(float last) {
        this.last = last;
    }

    public float getBuy() {
        return buy;
    }

    public void setBuy(float buy) {
        this.buy = buy;
    }

    public float getSell() {
        return sell;
    }

    public void setSell(float sell) {
        this.sell = sell;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
