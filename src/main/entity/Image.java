package main.entity;

import java.util.Date;
import java.util.Objects;

public class Image {
    private long id;
    private String src;
    private Date uploadDate;
    private String imageName;

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    private String imageFormat;

    public Image(long id, String src, Date uploadDate, String imageName, String imageFormat) {
        this.id = id;
        this.src = src;
        this.uploadDate = uploadDate;
        this.imageName = imageName;
        this.imageFormat = imageFormat;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return id == image.id &&
                src.equals(image.src);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, src);
    }
}
