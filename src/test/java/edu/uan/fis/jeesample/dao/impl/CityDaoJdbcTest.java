package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.City;
import java.util.List;
import junit.framework.TestCase;

public class CityDaoJdbcTest extends TestCase {
    
    public CityDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create prueba");
        City city = new City(3,"Cali");
        CityDaoJdbc instance = new CityDaoJdbc();
        City expResult = city;
        City result = instance.create(city);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        City city = new City(1,"Bucaramanga");
        CityDaoJdbc instance = new CityDaoJdbc();
        City expResult = city;
        City result = instance.update(city);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    public void testDelete() {
        System.out.println("delete");
        City city = new City(9,"Medellim");
       // city.setCityId(4);
        CityDaoJdbc instance = new CityDaoJdbc();
        instance.delete(city);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");  
    }

    public void testFindById() {
        System.out.println("findById");
        Integer cityId = 1;
        CityDaoJdbc instance = new CityDaoJdbc();
        City expResult = null;
        City result = instance.findById(cityId);
        System.out.println("RESULT:   "+result.getName());
      //  assertEquals(expResult, result);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        CityDaoJdbc instance = new CityDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the defau1lt call to fail.
        //fail("The test case is a prototype.");
    }
}
