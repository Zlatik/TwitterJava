package main.entity;

import java.util.Date;
import java.util.Objects;

public class Video {
    private long id;
    private String src;
    private Date uploadDate;
    private String imageName;
    private String videoFormat;

    public Video(long id, String src, Date uploadDate, String imageName, String videoFormat) {
        this.id = id;
        this.src = src;
        this.uploadDate = uploadDate;
        this.imageName = imageName;
        this.videoFormat = videoFormat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return id == video.id &&
                src.equals(video.src);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, src);
    }
}
