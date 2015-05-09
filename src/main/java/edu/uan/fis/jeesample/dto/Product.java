package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private String descripcion;
    private Integer productId=0;

    public Product() {
    }
    
    public Product(int productId) {
        this.productId=productId;  //To change body of generated methods, choose Tools | Templates.
    }
    
    public Product(int productId, String name) {
        this.productId=productId;
        this.name = name; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Product(int productId, String name, String descripcion) {
        this.productId=productId;
        this.name = name;
        this.descripcion = descripcion; //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String name) {
        this.descripcion = descripcion;
    }   
    
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Product == false)
            return false;
        Product that = (Product) o;
        return that.productId.equals(this.productId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.productId != null ? this.productId.hashCode() : 0);
        return hash;
    }

    public int getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Product getProductId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
