package com.example.prince.heroku;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("data")
    @Expose
    private List<Movies> data = null;

    public List<Movies> getData() {
        return data;
    }

    public void setData(List<Movies> data) {
        this.data = data;
    }
}
