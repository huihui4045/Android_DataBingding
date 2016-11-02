package com.huihui.databingding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;

/**
 * Author: gavin
 * Date: 2016/11/2
 * Time: 10:36
 * Email:2415580905@qq.com
 */
public class User extends BaseObservable {


    private String userName;

    private String city;


    public ObservableInt time = new ObservableInt();

    public User(String userName, String city, ObservableInt time) {
        this.userName = userName;
        this.city = city;
        this.time = time;
    }

    public User(String userName, String city) {
        this.userName = userName;
        this.city = city;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(com.huihui.databingding.BR.userName);
    }

    @Bindable
    public String getCity() {
        return city;

    }

    public void setCity(String city) {
        this.city = city;
        notifyPropertyChanged(com.huihui.databingding.BR.city);
    }
}
