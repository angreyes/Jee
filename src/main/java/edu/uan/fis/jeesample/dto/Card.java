package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Card implements Serializable {

    private Integer num_tarjeta;
    private Integer clave;
    private String banco;

    public Card() {
    }
    
    public Card(int num_tarjeta) {
        this.num_tarjeta=num_tarjeta;  //To change body of generated methods, choose Tools | Templates.
    }
    
    public Card(int num_tarjeta, String banco) {
        this.num_tarjeta=num_tarjeta;
        this.banco = banco; //To change body of generated methods, choose Tools | Templates.
    }
    public Card(int num_tarjeta, int clave) {
        this.num_tarjeta=num_tarjeta;
        this.clave = clave; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Card(int num_tarjeta, int clave, String banco) {
        this.num_tarjeta=num_tarjeta;
        this.clave = clave;
        this.banco = banco; //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getNumberC() {
        return num_tarjeta;
    }

    public void setNumberC(int num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }
    
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Card == false)
            return false;
        Card that = (Card) o;
        return that.num_tarjeta.equals(this.num_tarjeta);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.banco != null ? this.banco.hashCode() : 0);
        hash = 79 * hash + (this.clave != null ? this.clave.hashCode() : 0);
        hash = 79 * hash + (this.num_tarjeta != null ? this.num_tarjeta.hashCode() : 0);
        return hash;
    }
}
