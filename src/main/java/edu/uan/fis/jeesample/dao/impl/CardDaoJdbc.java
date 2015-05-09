package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.CardDao;
import edu.uan.fis.jeesample.dto.Card;
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
 * Card DAO implementation using JDBC
 */
public class CardDaoJdbc implements CardDao {
    
    public Card create(Card card) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the card in the database
            String insertData= "INSERT INTO `tarjeta_credito`( `num_tarjeta`, `clave_tarjeta`,`banco` )  VALUES (?,?,?)";
            stmt = conn.prepareStatement(insertData);
            stmt.setInt(1,card.getNumberC());
            stmt.setInt(2,card.getClave());
            stmt.setString(3,card.getBanco());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return card;
    }
    
    public Card update(Card card) {
         // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the card in the database
            String updateData= "UPDATE `tarjeta_credito` SET `clave_tarjeta`=? WHERE `num_tarjeta`=?";
            stmt = conn.prepareStatement(updateData);
            stmt.setInt(1,card.getClave());
            stmt.setInt(2,card.getNumberC());            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return card;
    }
    
    public void delete(Card card) {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the card in the database
            String deleteData= "DELETE FROM `tarjeta_credito` WHERE `num_tarjeta`=?";
            stmt = conn.prepareStatement(deleteData);
            stmt.setInt(1,card.getNumberC());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Card findById(Integer cardId) {
       // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Card p = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the card in the database
            String findId = "SELECT * FROM `tarjeta_credito` WHERE `num_tarjeta`=?";
            stmt = conn.prepareStatement(findId);
            stmt.setInt(1, cardId);
            rs = stmt.executeQuery();
            if(rs.next()) {
                p = new Card();
                p.setBanco(rs.getString("banco"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     //   return cardId;
        return p;
    }
    
    public List<Card> findAll() {
        // Sample code
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Card> cards = new ArrayList<Card>();
        Card p = null;        
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:mysql://localhost/servicios?" + "user=root&password=admin");
            // 3. Creates the card in the database
            String findId= "SELECT * FROM `tarjeta_credito` ";
            stmt = conn.prepareStatement(findId);
            rs = stmt.executeQuery();
            while(rs.next()){
                p = new Card();                
                p.setBanco(rs.getString("banco"));
                cards.add(p);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CardDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return cards;
    //    return null;
    }
}

