package com.example.bt_quatrinh_2;

public class note {
    private String name;
    private String description;
    private String img;
    private String date;
    private String timer;

    public note(String name, String description, String img, String date, String timer) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.date = date;
        this.timer = timer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }
}
