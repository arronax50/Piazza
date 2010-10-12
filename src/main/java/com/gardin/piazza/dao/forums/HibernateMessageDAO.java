package com.gardin.piazza.dao.forums;

import org.springframework.stereotype.Repository;

import com.gardin.piazza.dao.AbstractHibernateDAO;
import com.gardin.piazza.domain.forums.Message;

/**
 * Implementation of MessageDAO that derives from AbstractHibernateDAO.
 * 
 * @author Pierre Gardin
 */
@Repository(value = "messageDAO")
public class HibernateMessageDAO extends AbstractHibernateDAO<Message, Integer> implements
        IMessageDAO {

    public HibernateMessageDAO() {
        super(Message.class);
    }

}
