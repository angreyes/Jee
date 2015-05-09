package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.UserDao;
import edu.uan.fis.jeesample.dto.User;
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
 * User DAO implementation using JDBC
 */
public class UserDaoJdbc implements UserDao {
    
    public User create(User user) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the user in the database
         //   String insertData= "INSERT INTO `usuarios`( `id_servicio`, `nombre`, `apellido`, `telefono`, `email`, `username`, `password`, `celular`,  `direccion`, `tipo`, `num_tc`)  VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            String insertData= "INSERT INTO `usuario`( `id_usuario`,`nombre`,`apellido`,`telefono`,`email`,`username`,`password`,`celular` , `direccion`,`tipo`,`num_tc`)  VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            stmt = conn.prepareStatement(insertData);
            stmt.setInt(1,user.getUserId());
            stmt.setString(2,user.getName());
            stmt.setString(3,user.getLastName());
            stmt.setInt(4,user.getPhone()); 
            stmt.setString(5,user.getEmail());
            stmt.setString(6,user.getUsername());
            stmt.setString(7,user.getPassword());
            stmt.setInt(8,user.getCellPhone()); 
            stmt.setString(9,user.getAddress());
            stmt.setInt(10,user.getType());
            stmt.setInt(11,user.getNumberC());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }
    
    public User update(User user) {
         // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String updateData= "UPDATE `usuario` SET `nombre`=? WHERE `id_usuario`=?";
            stmt = conn.prepareStatement(updateData);
            stmt.setString(1,user.getName());
            stmt.setInt(2,user.getUserId());   
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return user;
    }
    
    public void delete(User user) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String deleteData= "DELETE FROM `usuario` WHERE `id_usuario`=?";
            stmt = conn.prepareStatement(deleteData);
            stmt.setInt(1,user.getUserId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public User findById(Integer userId) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String findId = "SELECT * FROM `usuario` WHERE `id_usuario`=?";
            stmt = conn.prepareStatement(findId);
            stmt.setInt(1, userId);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new User();
                p.setName(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return userId;
        return p;
    }
    
    public List<User> findAll() {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<User> users = new ArrayList<User>();
        User p = null;        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the user in the database
            String findId= "SELECT * FROM `usuario` ";
            stmt = conn.prepareStatement(findId);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new User();                
                p.setUserId(rs.getInt("id_usuario"));
                p.setName(rs.getString("nombre"));
                p.setLastName(rs.getString("apellido"));
                p.setPhone(rs.getInt("telefono"));
                p.setEmail(rs.getString("email"));
                p.setUsername(rs.getString("username"));
                p.setPassword(rs.getString("password"));
                p.setCellPhone(rs.getInt("celular"));
                p.setAddress(rs.getString("direccion"));
                p.setType(rs.getInt("tipo"));
                p.setNumberC(rs.getInt("num_tc"));
                
                users.add(p);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return users;
    //    return null;
    }
}
