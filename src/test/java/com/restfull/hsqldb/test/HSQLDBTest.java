package com.restfull.hsqldb.test;

import static org.junit.Assert.assertNotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@Transactional
public class HSQLDBTest {
	
	@Autowired
    private SessionFactory sessionFactory;
    private Session currentSession;
    
    @Before
    public void openSession() {
        this.currentSession = sessionFactory.getCurrentSession();
    }
 
    @Test
    public void shouldHaveASessionFactory() {
        assertNotNull(sessionFactory);
    }

}
