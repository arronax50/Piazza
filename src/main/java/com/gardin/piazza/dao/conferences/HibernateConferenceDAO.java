package com.gardin.piazza.dao.conferences;

import org.springframework.stereotype.Repository;

import com.gardin.piazza.dao.AbstractHibernateDAO;
import com.gardin.piazza.domain.conferences.Conference;

/**
 * Implementation of ConferenceDAO that derives from AbstractHibernateDAO.
 * 
 * @author Pierre Gardin
 */
@Repository(value = "conferenceDAO")
public class HibernateConferenceDAO extends AbstractHibernateDAO<Conference, Integer> implements
        IConferenceDAO {

    public HibernateConferenceDAO() {
        super(Conference.class);
    }

}
