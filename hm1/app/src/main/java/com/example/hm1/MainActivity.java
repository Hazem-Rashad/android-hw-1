package com.example.hm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText QU = findViewById(R.id.Quizes15);
        EditText Hw = findViewById(R.id.Homeworke25);
        EditText Mid = findViewById(R.id.Midterms);
        EditText Final = findViewById(R.id.Final20);
        Button CALC = findViewById(R.id.Calculate);
        Button Rest = findViewById(R.id.Rest1);
        TextView Total = findViewById(R.id.Total1);
        CALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Quizes15 = Integer.parseInt(QU.getText().toString());
                int Homeworke25 = Integer.parseInt(Hw.getText().toString());
                int Midterms = Integer.parseInt(Mid.getText().toString());
                int Final20 = Integer.parseInt(Final.getText().toString());
                int Total1 = Quizes15 + Homeworke25 +Midterms + Final20 ;
                Total.setText(Total1+"%");
            }
        });

        Rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QU.setText("");
                Hw.setText("");
                Mid.setText("");
                Final.setText("");
                Total.setText("Total");
            }
        });

    }
}