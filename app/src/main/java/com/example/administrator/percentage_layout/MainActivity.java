package com.example.administrator.percentage_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button other,scroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        initButton();
    }

    private void initButton() {
        other= (Button) findViewById(R.id.row_one_item_one);
        scroll= (Button) findViewById(R.id.row_one_item_two);

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(MainActivity.this,other.class);
                startActivity(i);
            }
        });

        scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(MainActivity.this,scroll.class);
                startActivity(i);
            }
        });
    }
}
