package com.gardin.piazza.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Interface that all Data Access Objects are required to implement.
 * 
 * @author Pierre Gardin
 * 
 * @param <T>
 *            the class of objects managed by this DAO (domain class).
 * @param <ID>
 *            the class of identifiers for the domain class.
 */
public interface IDAO<T, ID extends Serializable> {

    /**
     * Delete the given object entry from the database.
     * 
     * @param obj
     *            the Object that needs to be deleted from the database.
     */
    public void delete(T obj);

    /**
     * Get all the objects of this domain.
     * 
     * @return object list
     */
    public List<T> getAll();

    /**
     * Get all the objects of this domain ordered by id.
     * 
     * @return object list
     */
    public List<T> getAllOrderedByID();

    /**
     * Get an instance of <code>T</code> corresponding to the given identifier.
     * 
     * @return the matched object
     */
    public T getByID(ID id);

    /**
     * Persist the given object into the database.
     * 
     * @param obj
     *            the Object that needs to be persisted
     * @return the newly created object identifier
     */
    public ID save(T obj);

    /**
     * Persist the given object into the database or update its state if it is
     * already persisted.
     * 
     * @param obj
     *            Object that needs to be persisted or updated.
     */
    public void saveOrUpdate(T obj);
}
