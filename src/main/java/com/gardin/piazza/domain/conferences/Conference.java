package com.gardin.piazza.domain.conferences;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a conference.
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "conference")
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    /**
     * If true, the Authors cannot know the identity of the Reviewers that are
     * assigned their Papers.
     */
    @Column(name = "authors_are_blind")
    private boolean authorsAreBlind;

    @Column(name = "call_for_papers_date")
    private Date callForPapersDate;

    @Column(name = "description")
    private String description;

    @Column(name = "end_date")
    private Date endDate;

    /**
     * The Conference logo (an image).
     */
    @Column(name = "logo")
    private Blob logo;

    @Column(name = "name")
    private String name;

    /**
     * If true, a Reviewer cannot know the identity of the other Reviewers that
     * are assigned the same Paper.
     */
    @Column(name = "reviewers_are_blind")
    private boolean reviewersAreBlind;

    @Column(name = "start_date")
    private Date startDate;

    public Date getCallForPapersDate() {
        return callForPapersDate;
    }

    public String getDescription() {
        return description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getId() {
        return id;
    }

    public Blob getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isAuthorsAreBlind() {
        return authorsAreBlind;
    }

    public boolean isReviewersAreBlind() {
        return reviewersAreBlind;
    }

    public void setAuthorsAreBlind(boolean authorsAreBlind) {
        this.authorsAreBlind = authorsAreBlind;
    }

    public void setCallForPapersDate(Date callForPapersDate) {
        this.callForPapersDate = callForPapersDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogo(Blob logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReviewersAreBlind(boolean reviewersAreBlind) {
        this.reviewersAreBlind = reviewersAreBlind;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
