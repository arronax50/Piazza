package com.gardin.piazza.test;

import static com.gardin.piazza.test.TestConstants.UNIT_TESTS_CONTEXT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.gardin.piazza.dao.users.IMetaReviewerDAO;
import com.gardin.piazza.dao.users.IUserDAO;
import com.gardin.piazza.domain.users.User;


/**
 * Abstract class for tests that access the database.
 * 
 * @author Pierre Gardin
 *
 */
@ContextConfiguration(locations = UNIT_TESTS_CONTEXT)
@TransactionConfiguration(defaultRollback = true)
public abstract class AbstractDBTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    protected IUserDAO<User> userDAO;
    
    @Autowired
    protected IMetaReviewerDAO metaReviewerDAO;
}
