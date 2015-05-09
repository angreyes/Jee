package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String lastName;
    private String email;
    private String username;    
    private String password;
    private String address;
    private Integer type;
    private Integer cellPhone=0;
    private Integer phone=0;
    private Integer userId=0;
    private Integer numberC=0;
    
    
    public User() {
    }
    
    public User(int userId, String name,String lastName,String email,String username,String password,String address, int type,int cellphone,int phone,int numberC) {
        this.userId=userId; 
        this.name=name; 
        this.lastName=lastName; 
        this.email=email; 
        this.username=username; 
        this.password=password; 
        this.address=address; 
        this.type=type; 
        this.cellPhone=cellPhone; 
        this.phone=phone; 
        this.numberC=numberC;
        
//To change body of generated methods, choose Tools | Templates.
    }

    public User(int userId, String name) {
        this.userId=userId; 
        this.name=name; 
        
//To change body of generated methods, choose Tools | Templates.
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
        
    public Integer getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Integer cellPhone) {
        this.cellPhone = cellPhone;
    }
    
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
    public Integer getNumberC() {
        return numberC;
    }

    public void setNumberC(Integer numberC) {
        this.numberC = numberC;
    }   
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer productId) {
        this.userId = userId;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof User == false)
            return false;
        User that = (User) o;
        return that.userId.equals(this.userId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 79 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 79 * hash + (this.username != null ? this.username.hashCode() : 0);
        hash = 79 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 79 * hash + (this.address != null ? this.address.hashCode() : 0);
        hash = 79 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 79 * hash + (this.cellPhone != null ? this.cellPhone.hashCode() : 0);
        hash = 79 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        hash = 79 * hash + (this.userId != null ? this.userId.hashCode() : 0);
        hash = 79 * hash + (this.numberC != null ? this.numberC.hashCode() : 0);
        
        return hash;
    }
}
