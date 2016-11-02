package com.huihui.databingding;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Author: gavin
 * Date: 2016/11/2
 * Time: 15:25
 * Email:2415580905@qq.com
 */
public class Student {


    public ObservableField<String> sName=new ObservableField<>();

    public ObservableInt sAge=new ObservableInt();


    public Student(ObservableField<String> sName, ObservableInt sAge) {
        this.sName = sName;
        this.sAge = sAge;
    }
}
