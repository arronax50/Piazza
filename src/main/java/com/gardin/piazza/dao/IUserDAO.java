package com.gardin.piazza.dao;

import org.springframework.stereotype.Repository;

import com.gardin.piazza.domain.User;

/**
 * Data Access Object for the User class.
 * 
 * @author Pierre Gardin
 */
public interface IUserDAO extends IDAO<User, Integer> {

    /**
     * 
     * @param userEmail
     *            the email address
     * @return the User corresponding to the email address
     */
    public User getByEmail(String userEmail);
}
