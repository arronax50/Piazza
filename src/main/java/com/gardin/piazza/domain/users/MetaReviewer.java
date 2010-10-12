package com.gardin.piazza.domain.users;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.gardin.piazza.domain.papers.Paper;

/**
 * Represents a meta-reviewer.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "meta_reviewer")
public final class MetaReviewer extends User {

    @OneToMany
    private Set<Paper> managedPapers;

    public Set<Paper> getManagedPapers() {
        return managedPapers;
    }

    public void setManagedPapers(Set<Paper> managedPapers) {
        this.managedPapers = managedPapers;
    }
}
