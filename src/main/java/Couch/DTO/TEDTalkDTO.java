/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.ektorp.support.CouchDbDocument;

/**
 *
 * @author krancruz
 */
public class TEDTalkDTO extends CouchDbDocument {

    private String _id;
    private String _rev;
    private String title;
    private String author;
    private String date;
    private int views;
    private int likes;
    private String link;

    public TEDTalkDTO() {
    }

    public TEDTalkDTO(String[] attr) {
        this.title = attr[0];
        this.author = attr[1];
        this.date = attr[2];
        this.views = Integer.parseInt(attr[3]);
        this.likes = Integer.parseInt(attr[4]);
        this.link = attr[5];
    }

    public TEDTalkDTO(
            String title,
            String author,
            String date,
            int views,
            int likes,
            String link) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.views = views;
        this.likes = likes;
        this.link = link;
    }

    public TEDTalkDTO(
            String _id,
            String title,
            String author,
            String date,
            int views,
            int likes,
            String link) {
        this._id = _id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.views = views;
        this.likes = likes;
        this.link = link;
    }

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getRev() {
        return _rev;
    }

    public void setRev(String _rev) {
        this._rev = _rev;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "TEDTalkDTO{" + "_id=" + _id + ", _rev=" + _rev + ", title=" + 
                title + ", author=" + author + ", date=" + date + ", views=" + 
                views + ", likes=" + likes + ", link=" + link + '}';
    }
}
