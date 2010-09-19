package com.gardin.piazza.test;

import static com.gardin.piazza.test.TestConstants.UNIT_TESTS_CONTEXT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.gardin.piazza.dao.IUserDAO;


/**
 * Abstract class for tests that access the database.
 * 
 * @author Pierre Gardin
 *
 */
@ContextConfiguration(locations = UNIT_TESTS_CONTEXT)
public abstract class AbstractDBTest extends AbstractTestNGSpringContextTests {

    @Autowired
    protected IUserDAO userDAO;

}
