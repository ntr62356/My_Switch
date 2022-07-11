package com.example.myswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView  img_view;
    LinearLayout layout_1;
    Switch switch1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_view = findViewById(R.id.img_view);
        layout_1 = findViewById(R.id.layout_1);
        switch1 = findViewById(R.id.switch1);

        findViewById(R.id.switch1).setOnClickListener(this);
        findViewById(R.id.radio_button1).setOnClickListener(this);
        findViewById(R.id.radio_button2).setOnClickListener(this);
        findViewById(R.id.radio_button3).setOnClickListener(this);
        findViewById(R.id.btn_begin).setOnClickListener(this);
        findViewById(R.id.btn_exit).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.switch1:
                if(switch1.setVisibility());

                break;
            case R.id.radio_button1:

                break;
            case R.id.radio_button2:

                break;
            case R.id.radio_button3:

                break;
            case R.id.btn_begin:

                break;
            case R.id.btn_exit:

                break;
        }
    }
}