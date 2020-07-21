package com.example.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="new")
public class NewEntity extends BaseEntity{

    private static final long serialVersionUID = -1149307988081590377L;

    @Column
    private  String code;

    @Column
    private String thumbnail;

    @Column
    private String title;

    @Column
    private Date content;

    @Column
    private Date shortDescription;


    public void setCode(String code) {
        this.code = code;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getContent() {
        return content;
    }

    public void setContent(Date content) {
        this.content = content;
    }

    public Date getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(Date shortDescription) {
        this.shortDescription = shortDescription;
    }
}
