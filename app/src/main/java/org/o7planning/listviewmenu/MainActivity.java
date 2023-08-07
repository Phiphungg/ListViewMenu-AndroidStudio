package org.o7planning.listviewmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] nameArray = {"Pizza","Burger","Pizza","Burger","Burger","Mango","Apple" };

    String[] infoArray = {
            "Spicy Chiken Pizza",
            "Beef Burger",
            "Chiken Pizza",
            "Chiken Burger",
            "Fish Burger",
            "Mango",
            "Apple"
    };

    String[] priceArray = {
            "RS 310.00",
            "RS 350.00",
            "RS 250.00",
            "RS 350.00",
            "RS 600.00",
            "RS 250.00",
            "RS 200.00"
    };

    Integer[] imageArray = {R.drawable.pizza1,
            R.drawable.burger1,
            R.drawable.pizza2,
            R.drawable.burger2,
            R.drawable.burger3,
            R.drawable.mango,
            R.drawable.apple};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, priceArray, imageArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(whatever);

        //
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                if(position == 0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, DetailActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}