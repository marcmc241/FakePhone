package com.fakephone.marcmc6.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    private TextView numText;
    private String num = "";
    private ImageButton btn_del;
    int[] buttonIDs = new int[] {R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4, R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9, R.id.btn_0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        numText = (TextView) findViewById(R.id.numText);

        for(int i=0; i<=9; i++){
            Button currbtn = (Button) findViewById(buttonIDs[i]);

            currbtn.setOnClickListener(new View.OnClickListener() {//button listener for every number
                @Override
                public void onClick(View view) {
                    addNumber(view);
                }
            });

        }

        btn_del = (ImageButton) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(new View.OnClickListener() {//button listener for every number
            @Override
            public void onClick(View view) {
                //delNumber();
            }
        });
    }

    private void addNumber(View Vi){
        Button b = (Button)Vi;
        String buttonText = b.getText().toString();
        num = num+buttonText;
        numText.setText(num);
    }


}
