package com.gardin.piazza.dao;

import com.gardin.piazza.domain.users.User;

/**
 * Data Access Object for the User class.
 * 
 * @author Pierre Gardin
 */
public interface IUserDAO<T extends User> extends IDAO<T, Integer> {

    /**
     * 
     * @param userEmail
     *            the email address
     * @return the User corresponding to the email address
     */
    public T getByEmail(String userEmail);
}
