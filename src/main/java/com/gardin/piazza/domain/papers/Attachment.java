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

    @Column(name = "content")
    private String extension;

    @Column(name = "file")
    private Blob file;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String getExtension() {
        return extension;
    }

    public Blob getFile() {
        return file;
    }

    public int getId() {
        return id;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setFile(Blob file) {
        this.file = file;
    }

    public void setId(int id) {
        this.id = id;
    }

}
