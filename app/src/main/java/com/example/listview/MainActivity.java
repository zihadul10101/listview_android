package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);

        String[] countryName=getResources().getStringArray(R.array.country_name);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.textView,countryName);
        listView.setAdapter(adapter);

    }
}