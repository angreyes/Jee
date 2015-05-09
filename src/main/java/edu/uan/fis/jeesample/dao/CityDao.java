package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.City;
import java.util.List;

public interface CityDao {

    /**
     * Creates a new city. 
     * @param city
     * @return 
     */
    City create(City city);

    /**
     * Updates an existing city. City id can't be modified.
     * @param city
     * @return 
     */
    City update(City city);

    /**
     * Deletes an existing city
     * @param city 
     */
    void delete(City city);

    /**
     * Find a city by id
     * @param cityId
     * @return 
     */
    City findById(Integer cityId);

    /**
     * Returns all the citys in the database
     * @return 
     */
    List<City> findAll();
}
