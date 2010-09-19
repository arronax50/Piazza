package com.gardin.piazza.dao;

import org.springframework.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gardin.piazza.domain.User;
import com.gardin.piazza.test.AbstractDBTest;

/**
 * Tests for the HibernateUserDAO class.
 * 
 * @author Pierre Gardin
 * 
 */
public class HibernateUserDAOTests extends AbstractDBTest {

    private static final String USER_COUNTRY = "France";
    private static final String USER_EMAIL = "romain.legrand@orange.fr";
    private static final String USER_EMAIL_2 = "alexis.legrand@orange.fr";
    private static final String USER_FIRST_NAME = "Romain";
    private static final String USER_FIRST_NAME_2 = "Alexis";
    private static final String USER_INSTITUTION = "Université de Caen";
    private static final String USER_PASSWORD = "rgf45F65gDgnT7";
    private static final String USER_SURNAME = "Legrand";

    @Test
    public void testSaveAndGetUser() {
        User user = new User();
        user.setCountry(USER_COUNTRY);
        user.setEmail(USER_EMAIL);
        user.setFirstName(USER_FIRST_NAME);
        user.setSurname(USER_SURNAME);
        user.setInstitution(USER_INSTITUTION);
        user.setPassword(USER_PASSWORD);
        Integer id = userDAO.save(user);

        User retrievedUser = userDAO.getByID(id);
        Assert.assertNotNull(retrievedUser);
        Assert.assertEquals(retrievedUser.getCountry(), USER_COUNTRY);
        Assert.assertEquals(retrievedUser.getEmail(), USER_EMAIL);
        Assert.assertEquals(retrievedUser.getFirstName(), USER_FIRST_NAME);
        Assert.assertEquals(retrievedUser.getSurname(), USER_SURNAME);
        Assert.assertEquals(retrievedUser.getInstitution(), USER_INSTITUTION);
        Assert.assertEquals(retrievedUser.getPassword(), USER_PASSWORD);
    }

    @Test
    public void testSaveOrUpdateUser(Integer id) {
        Assert.assertEquals(userDAO.getAll().size(), 0);

        User user = new User();
        user.setCountry(USER_COUNTRY);
        user.setEmail(USER_EMAIL);
        user.setFirstName(USER_FIRST_NAME);
        user.setSurname(USER_SURNAME);
        user.setInstitution(USER_INSTITUTION);
        user.setPassword(USER_PASSWORD);
        userDAO.saveOrUpdate(user);
        Assert.assertEquals(userDAO.getAll().size(), 1);

        User user2 = new User();
        user2.setCountry(USER_COUNTRY);
        user2.setEmail(USER_EMAIL_2);
        user2.setFirstName(USER_FIRST_NAME_2);
        user2.setSurname(USER_SURNAME);
        user2.setInstitution(USER_INSTITUTION);
        user2.setPassword(USER_PASSWORD);
        userDAO.saveOrUpdate(user2);
        Assert.assertEquals(userDAO.getAll().size(), 2);

        User userToChange = userDAO.getByEmail(USER_EMAIL);
        final String newPassword = StringUtils.capitalize(USER_PASSWORD);
        userToChange.setPassword(newPassword);
        userDAO.saveOrUpdate(userToChange);
        Assert.assertEquals(userDAO.getAll().size(), 2);

        User retrievedUser = userDAO.getByEmail(USER_EMAIL);
        Assert.assertEquals(retrievedUser.getPassword(), newPassword);
    }
}
