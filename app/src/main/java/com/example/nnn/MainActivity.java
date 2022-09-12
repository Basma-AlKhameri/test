package com.example.nnn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Restuarant> Data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);

        Data = new ArrayList<>();
        Data.add(new Restuarant(R.drawable.ic_baseline_notifications_24, "hghjh", "jhghjhg",
                "https://goo.gl/maps/Q5LkjuJ5M1SpDWi37"));
        Data.add(new Restuarant(R.drawable.ic_baseline_notifications_24, "hghjh", "jhghjhg",
                "https://goo.gl/maps/Q5LkjuJ5M1SpDWi37"));

        MyAdapter adapter = new MyAdapter(this, Data);
        listView.setAdapter(adapter);
    }
}