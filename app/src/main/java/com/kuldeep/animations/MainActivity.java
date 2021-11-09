package com.kuldeep.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean flag = true;
    public void fade(View view){
        ImageView imageView = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        Log.i("info", "ImageView is pressed");

        if(flag ){
            flag = false;
            imageView2.animate().alpha(0).setDuration(2000);
            imageView.animate().alpha(1).setDuration(2000);
        }
        else{
            flag = true;
            imageView.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}