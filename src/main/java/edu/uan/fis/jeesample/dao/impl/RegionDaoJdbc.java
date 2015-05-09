package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.RegionDao;
import edu.uan.fis.jeesample.dto.Region;
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
 * Region DAO implementation using JDBC
 */
public class RegionDaoJdbc implements RegionDao {
    
    public Region create(Region region) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String insertData= "INSERT INTO `departamento`( `id_departamento`, `id_ciudad`,`nombre` )  VALUES (?,?,?)";
            stmt = conn.prepareStatement(insertData);
            stmt.setInt(1,region.getRegionId());
            stmt.setInt(2,region.getCityId());
            stmt.setString(3,region.getName());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return region;
    }
    
    public Region update(Region region) {
         // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String updateData= "UPDATE `departamento` SET `id_ciudad`=? WHERE `id_departamento`=?";
            stmt = conn.prepareStatement(updateData);
            stmt.setInt(1,region.getCityId());
            stmt.setInt(2,region.getRegionId());            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return region;
    }
    
    public void delete(Region region) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String deleteData= "DELETE FROM `departamento` WHERE `id_departamento`=?";
            stmt = conn.prepareStatement(deleteData);
            stmt.setInt(1,region.getRegionId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Region findById(Integer regionId) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Region p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String findId = "SELECT * FROM `departamento` WHERE `id_departamento`=?";
            stmt = conn.prepareStatement(findId);
            stmt.setInt(1, regionId);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new Region();
                p.setName(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return regionId;
        return p;
    }
    
    public List<Region> findAll() {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Region> regions = new ArrayList<Region>();
        Region p = null;        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the region in the database
            String findId= "SELECT * FROM `departamento` ";
            stmt = conn.prepareStatement(findId);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new Region();                
                p.setName(rs.getString("nombre"));
                regions.add(p);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RegionDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return regions;
    //    return null;
    }
}

