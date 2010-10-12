package com.gardin.piazza.domain.conferences;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents a track (i.e. a Machine Translation-themed track in a Natural
 * Language Processing conference).
 * 
 * @author Pierre Gardin
 */
@Entity
@Table(name = "track")
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    /**
     * The Date that represents the beginning of the reviewing period.
     */
    @Column(name = "reviews_start_date")
    private Date reviewsStartDate;

    /**
     * The Date that represents the end of the reviewing period.
     */
    @Column(name = "reviews_end_date")
    private Date reviewsEndDate;

    /**
     * The Date when the notifications will be sent to the authors.
     */
    @Column(name = "result_notification_date")
    private Date resultNotificationDate;

    /**
     * The Date that represents the end of the submission period.
     */
    @Column(name = "submission_end_date")
    private Date submissionEndDate;

    /**
     * The Date that represents the beginning of the submission period.
     */
    @Column(name = "submission_start_date")
    private Date submissionStartDate;

    public Conference getConference() {
        return conference;
    }

    public int getId() {
        return id;
    }

    public Date getResultNotificationDate() {
        return resultNotificationDate;
    }

    public Date getReviewsEndDate() {
        return reviewsEndDate;
    }

    public Date getReviewsStartDate() {
        return reviewsStartDate;
    }

    public Date getSubmissionEndDate() {
        return submissionEndDate;
    }

    public Date getSubmissionStartDate() {
        return submissionStartDate;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResultNotificationDate(Date resultNotificationDate) {
        this.resultNotificationDate = resultNotificationDate;
    }

    public void setReviewsEndDate(Date reviewsEndDate) {
        this.reviewsEndDate = reviewsEndDate;
    }

    public void setReviewsStartDate(Date reviewsStartDate) {
        this.reviewsStartDate = reviewsStartDate;
    }

    public void setSubmissionEndDate(Date submissionEndDate) {
        this.submissionEndDate = submissionEndDate;
    }

    public void setSubmissionStartDate(Date submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
    }
}
