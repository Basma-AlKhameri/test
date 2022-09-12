package com.example.nnn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
ListView listView;
ArrayList array;
Button button;
EditText editText;
String text;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=findViewById(R.id.list);
        button=findViewById(R.id.add);
        editText=findViewById(R.id.editTextTextPersonName);

        array=new ArrayList();
        array.add("gghhh"); array.add("gghhh");
         adapter= new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,array);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                array.remove(i);
                adapter.notifyDataSetChanged();
            }
        });

    }

    public void addData(View view) {
        text=editText.getText().toString();
        if(text.isEmpty()){
            Toast.makeText(this,"please enter task name",Toast.LENGTH_LONG).show();
        }else
        array.add(text);
        adapter.notifyDataSetChanged();
        editText.setText("");
    }

}