package com.example.addapter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
EditText tx;
Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       tx=findViewById(R.id.editText);
       btn = findViewById(R.id.button0);
        ListView lv = findViewById(R.id.country);

        ArrayList<String>countries=new ArrayList<>();
        countries.add("Moroocco");
        countries.add("Egypt");
        countries.add("Qatar");
        countries.add("libia");
        countries.add("yemen");
        countries.add("Algeria");
        
        MyAdapter my=new MyAdapter(countries,this);
        lv.setAdapter(my);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countries.add(tx.getText().toString());
                lv.setAdapter(my);
            }});
//        ArrayAdapter<String>adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,countries);
//        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        lv.setAdapter(adapter);

lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        countries.remove(i);
        my.notifyDataSetChanged();
    }
});
    }
}































//    EditText tx=findViewById(R.id.text0);
//    Button btn = findViewById(R.id.button0);
//    ListView lv = findViewById(R.id.country);
//        btn.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        HashMap<String,String>data=new HashMap<>();
//        data.put("text",tx.getText().toString());
//        }
//        });