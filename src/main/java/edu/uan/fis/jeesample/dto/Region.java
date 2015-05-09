package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Region implements Serializable {

    private Integer id_departamento;
    private Integer id_ciudad;
    private String nombre;

    public Region() {
    }
    
    public Region(int id_departamento) {
        this.id_departamento=id_departamento;  //To change body of generated methods, choose Tools | Templates.
    }
    
    public Region(int id_departamento, String nombre) {
        this.id_departamento=id_departamento;
        this.nombre = nombre; //To change body of generated methods, choose Tools | Templates.
    }
    public Region(int id_departamento, int id_ciudad) {
        this.id_departamento=id_departamento;
        this.id_ciudad = id_ciudad; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Region(int id_departamento, int id_ciudad, String nombre) {
        this.id_departamento=id_departamento;
        this.id_ciudad = id_ciudad;
        this.nombre = nombre; //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getRegionId() {
        return id_departamento;
    }

    public void setRegionId(int id_departamento) {
        this.id_departamento = id_departamento;
    }
    
    public String getName() {
        return nombre;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }
    
    public Integer getCityId() {
        return id_ciudad;
    }

    public void setCityId(Integer id_ciudad) {
        this.id_ciudad = id_ciudad;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Region == false)
            return false;
        Region that = (Region) o;
        return that.id_departamento.equals(this.id_departamento);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.id_departamento != null ? this.id_departamento.hashCode() : 0);
        hash = 79 * hash + (this.id_ciudad != null ? this.id_ciudad.hashCode() : 0);
        hash = 79 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        return hash;
    }
}
