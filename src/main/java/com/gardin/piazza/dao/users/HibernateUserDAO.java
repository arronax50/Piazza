package com.gardin.piazza.dao.users;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gardin.piazza.dao.AbstractHibernateDAO;
import com.gardin.piazza.domain.users.User;

/**
 * Implementation of UserDAO that derives from AbstractHibernateDAO.
 * 
 * @author Pierre Gardin
 */
@Repository(value = "userDAO")
public class HibernateUserDAO extends AbstractHibernateDAO<User, Integer> implements IUserDAO<User> {

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
