package com.example.animatedgradients;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.gradientImageView);
        image.setBackgroundResource(R.drawable.gradient_animation);

        Drawable gradientAnimation = image.getBackground();
        if (gradientAnimation instanceof Animatable) {
            ((Animatable)gradientAnimation).start();
        }
    }
}
