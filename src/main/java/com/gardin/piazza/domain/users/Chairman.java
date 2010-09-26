package com.gardin.piazza.domain.users;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Represents a chairman.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "chairman")
public final class Chairman extends User {

}
