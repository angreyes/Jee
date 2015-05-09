package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.CityDao;
import edu.uan.fis.jeesample.dto.City;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * City DAO implementation using JDBC
 */
public class CityDaoJdbc implements CityDao {
    
    public City create(City city) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the city in the database
            String insertData= "INSERT INTO `ciudad`( `id_ciudad`, `nombre`)  VALUES (?,?)";
            stmt = conn.prepareStatement(insertData);
            stmt.setInt(1,city.getIdCity());
            stmt.setString(2,city.getName());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return city;
    }
    
    public City update(City city) {
         // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the city in the database
            String updateData= "UPDATE `ciudad` SET `nombre`=? WHERE `id_ciudad`=?";
            stmt = conn.prepareStatement(updateData);
            stmt.setInt(2,city.getIdCity());
            stmt.setString(1,city.getName());            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return city;
    }
    
    public void delete(City city) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the city in the database
            String deleteData= "DELETE FROM `ciudad` WHERE `id_ciudad`=?";
            stmt = conn.prepareStatement(deleteData);
            stmt.setInt(1,city.getIdCity());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public City findById(Integer cityId) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        City p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the city in the database
            String findId = "SELECT * FROM `ciudad` WHERE `id_ciudad`=?";
            stmt = conn.prepareStatement(findId);
            stmt.setInt(1, cityId);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new City();
                p.setName(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return cityId;
        return p;
    }
    
    public List<City> findAll() {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<City> citys = new ArrayList<City>();
        City p = null;        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the city in the database
            String findId= "SELECT * FROM `ciudad` ";
            stmt = conn.prepareStatement(findId);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new City();                
                p.setIdCity(rs.getInt("id_ciudad"));
                p.setName(rs.getString("nombre"));
                citys.add(p);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CityDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return citys;
    //    return null;
    }
}

