package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Region;
import java.util.List;
import junit.framework.TestCase;

public class RegionDaoJdbcTest extends TestCase {
    
    public RegionDaoJdbcTest(String testName) {
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
        Region region = new Region(2,2233,"Arauca");
        RegionDaoJdbc instance = new RegionDaoJdbc();
        Region expResult = region;
        Region result = instance.create(region);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("Santander");
        Region region = new Region(1,1111);
        RegionDaoJdbc instance = new RegionDaoJdbc();
        Region expResult = region;
        Region result = instance.update(region);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    public void testDelete() {
        System.out.println("delete");
        Region region = new Region(1000,"Meta");
       // region.setRegionId(4);
        RegionDaoJdbc instance = new RegionDaoJdbc();
        instance.delete(region);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");  
    }

    public void testFindById() {
        System.out.println("findById");
        Integer regionId = 1;
        RegionDaoJdbc instance = new RegionDaoJdbc();
        Region expResult = null;
        Region result = instance.findById(regionId);
        System.out.println("RESULT:   "+result.getName());
      //  assertEquals(expResult, result);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        RegionDaoJdbc instance = new RegionDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the defau1lt call to fail.
        //fail("The test case is a prototype.");
    }
}
