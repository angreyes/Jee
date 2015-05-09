package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Region;
import java.util.List;

public interface RegionDao {

    /**
     * Creates a new region. 
     * @param region
     * @return 
     */
    Region create(Region region);

    /**
     * Updates an existing region. Region id can't be modified.
     * @param region
     * @return 
     */
    Region update(Region region);

    /**
     * Deletes an existing region
     * @param region 
     */
    void delete(Region region);

    /**
     * Find a region by id
     * @param regionId
     * @return 
     */
    Region findById(Integer regionId);

    /**
     * Returns all the regions in the database
     * @return 
     */
    List<Region> findAll();
}
