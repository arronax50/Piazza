package com.gardin.piazza.domain.papers;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents a file attached to the paper.
 * 
 * @author Pierre Gardin
 * 
 */
@Entity
@Table(name = "attachment")
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "content")
    private String extension;

    @Column(name = "content")
    private Blob file;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public void setFile(Blob file) {
        this.file = file;
    }

    public Blob getFile() {
        return file;
    }

}
