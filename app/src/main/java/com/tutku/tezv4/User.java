package com.tutku.tezv4;

/**
 * Created by Toshiba on 3.11.2016.
 */

public class User {
    private String name;
    private String email;
    private String photo_id;

    public User(String name, String email,String photo_id) {
        this.name = name;
        this.email = email;
        this.photo_id = photo_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
    }
}
