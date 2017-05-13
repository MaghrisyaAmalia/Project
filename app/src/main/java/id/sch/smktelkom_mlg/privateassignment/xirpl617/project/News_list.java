package id.sch.smktelkom_mlg.privateassignment.xirpl617.project;

import java.io.Serializable;

/**
 * Created by ASUS on 13-May-17.
 */

public class News_list implements Serializable {
    private String image;
    private String judul;
    private String popular;

    public News_list(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }

}

