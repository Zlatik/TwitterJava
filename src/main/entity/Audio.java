package main.entity;

import java.util.Date;
import java.util.Objects;

public class Audio {

    private long id;
    private String src;
    private String name;
    private String format;
    private Date uploadDate;

    public Audio(long id, String src, String name, String format, Date uploadDate) {
        this.id = id;
        this.src = src;
        this.name = name;
        this.format = format;
        this.uploadDate = uploadDate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audio audio = (Audio) o;
        return id == audio.id &&
                src.equals(audio.src);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, src);
    }
}
