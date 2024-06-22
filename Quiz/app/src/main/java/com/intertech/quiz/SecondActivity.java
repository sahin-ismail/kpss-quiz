package com.intertech.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by emiryalgin on 2019-07-02.
 */
public class SecondActivity extends AppCompatActivity {

    private Button questionButton;
    private RadioButton aButton;
    private RadioButton bButton;
    private RadioButton cButton;
    private RadioButton dButton;
    private RadioButton eButton;
    private ImageView questionImage;
    private TextView questionText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        questionButton = findViewById(R.id.btn_question);
        aButton = findViewById(R.id.btn_a);
        bButton = findViewById(R.id.btn_b);
        cButton = findViewById(R.id.btn_c);
        dButton = findViewById(R.id.btn_d);
        eButton = findViewById(R.id.btn_e);
        questionImage = findViewById(R.id.image_question);
        questionText = findViewById(R.id.question_text);


        questionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aButton.isChecked() || bButton.isChecked() || cButton.isChecked() || dButton.isChecked() || eButton.isChecked()){

                }
                else{
                    Toast.makeText(SecondActivity.this, "Bir şıkkı işaretleyiniz" ,Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}

