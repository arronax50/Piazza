package com.gardin.piazza.domain.papers;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents an article.
 * 
 * @author Pierre Gardin
 * 
 */
@Entity
@Table(name = "paper")
public class Paper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "content")
    private Blob content;

    /**
     * Comma-separated list of keywords.
     */
    @Column(name = "keywords")
    private String[] keywords;

    @Column(name = "title")
    private String title;

    public Blob getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(Blob content) {
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
