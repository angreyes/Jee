package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class City implements Serializable {

    private Integer id_ciudad;
    private String name;

    public City() {
    }
    
    public City(int id_ciudad) {
        this.id_ciudad=id_ciudad;  //To change body of generated methods, choose Tools | Templates.
    }
    
    public City(int id_ciudad, String name) {
        this.id_ciudad=id_ciudad;
        this.name = name; //To change body of generated methods, choose Tools | Templates.
    }
    
    public City(String name) {
        this.name = name; //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getIdCity() {
        return id_ciudad;
    }

    public void setIdCity(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof City == false)
            return false;
        City that = (City) o;
        return that.id_ciudad.equals(this.id_ciudad);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id_ciudad != null ? this.id_ciudad.hashCode() : 0);
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }
}
