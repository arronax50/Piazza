package com.gardin.piazza.domain.forum;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gardin.piazza.domain.users.User;

/**
 * Represents a message in the forum.
 * 
 * @author Pierre Gardin
 * 
 */
@Entity
@Table(name = "message")
public class Message {

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @Column(name = "content")
    private Blob content;

    @Column(name = "date")
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "forum_id", nullable = false)
    private Forum forum;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "position")
    private int position;

    @Column(name = "precedingMessage")
    @OneToOne()
    private Message precedingMessage;

    public User getAuthor() {
        return author;
    }

    public Blob getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public Forum getForum() {
        return forum;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public Message getPrecedingMessage() {
        return precedingMessage;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setContent(Blob content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setPrecedingMessage(Message precedingMessage) {
        this.precedingMessage = precedingMessage;
    }
}
