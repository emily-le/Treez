package com.example.treez189;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MeditationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);

        final Button back_btn = findViewById(R.id.med_to_main);
        back_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MeditationActivity.this, "Going back to main menu...",
                        Toast.LENGTH_SHORT).show();
                //launch main activity
                startActivity(new Intent(MeditationActivity.this, MainActivity.class));
            }
        });
    }
}
