package com.startuploader.uploading;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="video-sec" )
    private Long id;
    private String title;
    private double size;
    private String url;
    private Date created;
    private Date modified;

    public Video() {
    }

    public Video(String title, double size, String url) {
        this.title = title;
        this.size = size;
        this.url = url;
    }

}
