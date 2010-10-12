package com.gardin.piazza.dao.conferences;

import org.springframework.stereotype.Repository;

import com.gardin.piazza.dao.AbstractHibernateDAO;
import com.gardin.piazza.domain.conferences.Track;

/**
 * Implementation of TrackDAO that derives from AbstractHibernateDAO.
 * 
 * @author Pierre Gardin
 */
@Repository(value = "trackDAO")
public class HibernateTrackDAO extends AbstractHibernateDAO<Track, Integer> implements
        ITrackDAO {

    public HibernateTrackDAO() {
        super(Track.class);
    }

}
