package com.gardin.piazza.domain.users;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Represents an admin.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "admin")
public final class Admin extends User {

}
