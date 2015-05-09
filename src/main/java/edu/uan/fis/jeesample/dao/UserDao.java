package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dao.*;
import edu.uan.fis.jeesample.dto.User;
import java.util.List;

public interface UserDao {

    /**
     * Creates a new user. 
     * @param user
     * @return 
     */
    User create(User user);

    /**
     * Updates an existing user. User id can't be modified.
     * @param user
     * @return 
     */
    User update(User user);

    /**
     * Deletes an existing user
     * @param user 
     */
    void delete(User user);

    /**
     * Find a user by id
     * @param userId
     * @return 
     */
    User findById(Integer userId);

    /**
     * Returns all the users in the database
     * @return 
     */
    List<User> findAll();
}
