package com.huihui.databingding;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableInt;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.huihui.databingding.databinding.MainActivityBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private User user;

    private Person person;

    private int age = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   setContentView(R.layout.activity_main);


        MainActivityBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("配音会", "北京", new ObservableInt(2017));

        dataBinding.setUser(user);
        dataBinding.setStr("你好啊");
        person = new Person();
        person.age.set(age);
        dataBinding.setPerson(person);
        ArrayList<String> list = new ArrayList<>();
        list.add("美利坚");
        dataBinding.setList(list);


        HashMap<String, String> map = new HashMap<>();

        map.put("name", "这个是map");

        dataBinding.setMap(map);

        dataBinding.setOnClick(this);

        dataBinding.tvText.setText("这个是测试数据");

    }


    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.button:
                Toast.makeText(MainActivity.this, "登录", Toast.LENGTH_LONG).show();

                user.setUserName("刘德华");
                break;
            case R.id.button1:

                Toast.makeText(MainActivity.this, "注册", Toast.LENGTH_LONG).show();
                user.setCity("南京");
                break;

            case R.id.btn_age:

                age++;

                person.age.set(age);

                break;
        }
    }
}
