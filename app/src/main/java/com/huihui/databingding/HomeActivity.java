package com.huihui.databingding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private View.OnClickListener itemClickListener;
    private ListView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        itemClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), v.getClass().getSimpleName(), Toast.LENGTH_SHORT).show();
            }
        };
        gridView = (ListView) findViewById(R.id.gridView);
        MMyAdapter adapter = new MMyAdapter(getBaseContext());
        adapter.setOnclickListener(itemClickListener);
        gridView.setAdapter(adapter);


    }
}
