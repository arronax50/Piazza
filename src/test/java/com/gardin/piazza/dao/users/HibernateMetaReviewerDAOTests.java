package com.gardin.piazza.dao.users;

import java.util.HashSet;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gardin.piazza.domain.papers.Paper;
import com.gardin.piazza.domain.users.MetaReviewer;
import com.gardin.piazza.test.AbstractDBTest;

/**
 * Tests for the HibernateMetaReviewerDAO class.
 * 
 * @author Pierre Gardin
 * 
 */
public class HibernateMetaReviewerDAOTests extends AbstractDBTest {

    private static final String USER_COUNTRY = "France";
    private static final String USER_EMAIL = "romain.legrand@orange.fr";
    private static final String USER_FIRST_NAME = "Romain";
    private static final String USER_INSTITUTION = "Université de Caen";
    private static final String USER_PASSWORD = "rgf45F65gDgnT7";
    private static final String USER_SURNAME = "Legrand";

    @Test
    @Transactional
    public void testSaveAndGetMetaReviewer() {
        MetaReviewer user = new MetaReviewer();
        user.setCountry(USER_COUNTRY);
        user.setEmail(USER_EMAIL);
        user.setFirstName(USER_FIRST_NAME);
        user.setSurname(USER_SURNAME);
        user.setInstitution(USER_INSTITUTION);
        user.setPassword(USER_PASSWORD);

        Paper paper = new Paper();
        Set<Paper> papers = new HashSet<Paper>();
        papers.add(paper);

        user.setManagedPapers(papers);
        Integer id = metaReviewerDAO.save(user);

        MetaReviewer retrievedUser = metaReviewerDAO.getByID(id);
        Assert.assertNotNull(retrievedUser);
        Assert.assertTrue(retrievedUser.getManagedPapers().contains(paper),
                "The meta-reviewer should have a reference to the managed paper.");
    }

    @Test
    @Transactional
    public void testSaveOrUpdateMetaReviewer() {

    }
}
