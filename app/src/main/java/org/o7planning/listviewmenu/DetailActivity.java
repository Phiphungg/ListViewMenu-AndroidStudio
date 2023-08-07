package org.o7planning.listviewmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        View ImageView = findViewById(R.id.imageID);
        TextView textview1 = findViewById(R.id.textID1);
        TextView textview2 = findViewById(R.id.textID2);
        TextView textview3 = findViewById(R.id.textID3);


    }
}