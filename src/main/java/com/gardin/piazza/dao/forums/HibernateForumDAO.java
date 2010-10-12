package com.gardin.piazza.dao.forums;

import org.springframework.stereotype.Repository;

import com.gardin.piazza.dao.AbstractHibernateDAO;
import com.gardin.piazza.domain.forums.Forum;

/**
 * Implementation of ForumDAO that derives from AbstractHibernateDAO.
 * 
 * @author Pierre Gardin
 */
@Repository(value = "forumDAO")
public class HibernateForumDAO extends AbstractHibernateDAO<Forum, Integer> implements IForumDAO {

    public HibernateForumDAO() {
        super(Forum.class);
    }

}
