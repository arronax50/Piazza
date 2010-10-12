package com.gardin.piazza.domain.forums;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gardin.piazza.domain.papers.Paper;

/**
 * Represents a forum associated with a Paper, so that the Reviewers can discuss
 * it.
 * 
 * @author Pierre Gardin
 * 
 */
@Entity
@Table(name = "forum")
public class Forum {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "opening_date")
    private Date openingDate;

    @OneToOne()
    @JoinColumn(name = "paper_id")
    private Paper paper;

    public int getId() {
        return id;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
}
