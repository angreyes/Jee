package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Card;
import java.util.List;

public interface CardDao {

    /**
     * Creates a new card. 
     * @param card
     * @return 
     */
    Card create(Card card);

    /**
     * Updates an existing card. Card id can't be modified.
     * @param card
     * @return 
     */
    Card update(Card card);

    /**
     * Deletes an existing card
     * @param card 
     */
    void delete(Card card);

    /**
     * Find a card by id
     * @param cardId
     * @return 
     */
    Card findById(Integer cardId);

    /**
     * Returns all the cards in the database
     * @return 
     */
    List<Card> findAll();
}
