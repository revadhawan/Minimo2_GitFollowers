package edu.upc.eetac.dsa.minimo2_gitfollowers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    //Atributo, declarar las mismas variables que queremos coger del json (poner los mismos nombre de la API)
    @SerializedName("login")
    @Expose
    String login;
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("avatar_url")
    @Expose
    String avatar_url;
    @SerializedName("followers")
    @Expose
    int followers;
    @SerializedName("followings")
    @Expose
    int followings;
    @SerializedName("public_repos")
    @Expose
    int public_repos;

    //Constructor
    public User(String login, int id, String avatar_url, int followers, int followings, int public_repos) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.followers = followers;
        this.followings = followings;
        this.public_repos = public_repos;
    }

    //Set i Get
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowings() {
        return followings;
    }

    public void setFollowings(int followings) {
        this.followings = followings;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }
}
