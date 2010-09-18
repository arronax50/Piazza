package com.gardin.piazza.dao;

import com.gardin.piazza.domain.User;

/**
 * Implementation of UserDAO that derives from .
 * 
 * @author Pierre Gardin
 */
public class HibernateUserDAO extends AbstractHibernateDAO<User, Integer> implements IUserDAO {

    public HibernateUserDAO() {
        super(User.class);
    }

}
