package com.gardin.piazza.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gardin.piazza.domain.users.MetaReviewer;
import com.gardin.piazza.domain.users.User;

/**
 * Implementation of UserDAO that derives from AbstractHibernateDAO.
 * 
 * @author Pierre Gardin
 */
@Repository(value = "metaReviewerDAO")
public class HibernateMetaReviewerDAO extends AbstractHibernateDAO<MetaReviewer, Integer>  implements IMetaReviewerDAO {

    public HibernateMetaReviewerDAO() {
        super(MetaReviewer.class);
    }

    @Override
    public MetaReviewer getByEmail(String userEmail) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("email", userEmail));
        return (MetaReviewer) criteria.uniqueResult();
    }

}
