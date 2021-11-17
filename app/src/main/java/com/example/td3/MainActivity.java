package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton =(Button) findViewById(R.id.button);
        TextView textView1 = (TextView) findViewById(R.id.textv1);
        TextView textView2 = (TextView) findViewById(R.id.textv2);
        EditText faceDe=(EditText) findViewById(R.id.face_de);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rn = new Random();
                int range = new Integer(faceDe.getText().toString()) - 1 + 1;
                Integer randomNum1 =  rn.nextInt(range) + 1;
                Integer randomNum2 =  rn.nextInt(range) + 1;
                textView1.setText(randomNum1.toString());
                textView2.setText(randomNum2.toString());
            }
        });
    }
}