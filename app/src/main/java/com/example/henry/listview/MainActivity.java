package com.example.henry.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView)findViewById(R.id.myListView);
        final ArrayList<String>myFamily = new ArrayList<String>();

        myFamily.add("Henry");
        myFamily.add("Dach");
        myFamily.add("Naomi");
        myFamily.add("Ruth");
        myFamily.add("Mary");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, myFamily);

        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Hello! how are you " + myFamily.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}
