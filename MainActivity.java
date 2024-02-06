package com.jp.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ListView listView;
   ArrayList<String> arrNames=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);

        arrNames.add("Manjit");
        arrNames.add("Sanjit");
        arrNames.add("Ranjit");
        arrNames.add("Debjit");
        arrNames.add("jit");
        arrNames.add("Manjit");
        arrNames.add("Sanjit");
        arrNames.add("Ranjit");
        arrNames.add("Debjitjit");
        arrNames.add("jit");
        arrNames.add("Manjit");
        arrNames.add("Sanjit");
        arrNames.add("Ranjit");
        arrNames.add("Debjitjit");
        arrNames.add("jit");
        arrNames.add("Manjit");
        arrNames.add("Arpita");
        arrNames.add("Ranjit");
        arrNames.add("Debjitjit");
        arrNames.add("jit");
        arrNames.add("Manjit");
        arrNames.add("Dona");
        arrNames.add("Ranjit");
        arrNames.add("Debjitjit");
        arrNames.add("jit");
        arrNames.add("Manjit");
        arrNames.add("Nikita");
        arrNames.add("Ranjit");
        arrNames.add("Debjitjit");
        arrNames.add("Mandira");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,arrNames);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}