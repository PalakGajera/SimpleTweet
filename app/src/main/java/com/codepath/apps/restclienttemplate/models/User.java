package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class User {

    public String name;
    public String screename;
    public String profileImageUrl;

    //empty constructor needed by the Parceler Library
    public User()
    {

    }
    //parse and get info from jsonobject
    public static User  fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.screename = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        return user;


    }
}
