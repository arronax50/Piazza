package com.gardin.piazza.domain.users;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Represents a reviewer.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "reviewer")
public final class Reviewer extends User {

}
