package com.gardin.piazza.domain.papers;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents an (optional) abstract of an article.
 * 
 * @author Pierre Gardin
 * 
 */
@Entity
@Table(name = "abstract")
public class Abstract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Paper_id", nullable = false)
    private Paper paper;

    @Column(name = "execution_datetime", nullable = false)
    private Blob content;

    /**
     * 
     * @return the identifier of this abstract.
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return the Paper associated with this abstract.
     */
    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    /**
     * 
     * @return the content of this abstract.
     */
    public void setContent(Blob content) {
        this.content = content;
    }

    public Blob getContent() {
        return content;
    }
}
