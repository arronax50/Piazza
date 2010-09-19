package com.gardin.piazza.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

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

    @Override
    public User getByEmail(String userEmail) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("email", userEmail));
        return (User) criteria.uniqueResult();
    }

}
