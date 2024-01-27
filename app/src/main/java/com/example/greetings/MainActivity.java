package com.example.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button greetBTN;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.nameTxt);
        greetBTN = findViewById(R.id.greetingBTN);
        title = findViewById(R.id.title);

        greetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputname = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Welcome "+ inputname, Toast.LENGTH_LONG).show();
            }
        });
    }
}