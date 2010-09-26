package com.gardin.piazza.domain.users;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Represents a meta-reviewer.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "meta_reviewer")
public final class MetaReviewer extends User {

}
