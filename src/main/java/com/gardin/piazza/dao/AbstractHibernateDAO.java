package com.gardin.piazza.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Abstract class for all DAO's that use Hibernate behind-the-scenes.
 * @author Pierre Gardin
 *
 * @param <T> the domain class
 * @param <ID> the identifier class (implements {@link Serializable})
 */
public class AbstractHibernateDAO<T, ID extends Serializable> extends HibernateDaoSupport implements
        IDAO<T, ID> {

    private final Class<T> domainClass;

    
    public final Class<T> getDomainClass() {
        return domainClass;
    }

    @Autowired
    private SessionFactory sessionFactory;

    public AbstractHibernateDAO(Class<T> domainClass) {
        this.domainClass = domainClass;
    }

    @Override
    public void delete(T obj) {
        getSession().delete(obj);
    }

    /**
     * Evict given Hibernate proxy object from the {@link Session}.
     * 
     * @param obj
     *            Hibernate proxy
     */
    public void evict(T obj) {
        getSession().evict(obj);
    }

    /**
     * Flushes the session.
     */
    public void flush() {
        getSession().flush();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> getAll() {
        return getSession().createCriteria(domainClass).list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> getAllOrderedByID() {
        Criteria criteria = getSession().createCriteria(domainClass);
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getByID(ID id) {
        return (T) getSession().get(domainClass, id);
    }

    @PostConstruct
    public void initSessionFactory() {
        setSessionFactory(sessionFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public ID save(T obj) {
        return (ID) getSession().save(obj);
    }

    @Override
    public void saveOrUpdate(T obj) {
        getSession().saveOrUpdate(obj);
    }
}
