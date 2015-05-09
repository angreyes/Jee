package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Card;
import java.util.List;
import junit.framework.TestCase;

public class CardDaoJdbcTest11 extends TestCase {
    
    public CardDaoJdbcTest11(String testName) {
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
        Card card = new Card(6666,2233,"bogota");
        CardDaoJdbc instance = new CardDaoJdbc();
        Card expResult = card;
        Card result = instance.create(card);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Card card = new Card(2222,1111);
        CardDaoJdbc instance = new CardDaoJdbc();
        Card expResult = card;
        Card result = instance.update(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    public void testDelete() {
        System.out.println("delete");
        Card card = new Card(1000,"Bogota");
       // card.setCardId(4);
        CardDaoJdbc instance = new CardDaoJdbc();
        instance.delete(card);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");  
    }

    public void testFindById() {
        System.out.println("findById");
        Integer cardId = 4444;
        CardDaoJdbc instance = new CardDaoJdbc();
        Card expResult = null;
        Card result = instance.findById(cardId);
        System.out.println("RESULT:   "+result.getNumberC());
      //  assertEquals(expResult, result);        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        CardDaoJdbc instance = new CardDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the defau1lt call to fail.
        //fail("The test case is a prototype.");
    }
}
