package com.example.a10soalradiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int hasil = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup Jawaban1 = (RadioGroup) findViewById(R.id.rgJawaban1);
        final RadioGroup Jawaban2 = (RadioGroup) findViewById(R.id.rgJawaban2);
        final RadioGroup Jawaban3 = (RadioGroup) findViewById(R.id.rgJawaban3);
        final RadioGroup Jawaban4 = (RadioGroup) findViewById(R.id.rgJawaban4);
        final RadioGroup Jawaban5 = (RadioGroup) findViewById(R.id.rgJawaban5);
        final RadioGroup Jawaban6 = (RadioGroup) findViewById(R.id.rgJawaban6);
        final RadioGroup Jawaban7 = (RadioGroup) findViewById(R.id.rgJawaban7);
        final RadioGroup Jawaban8 = (RadioGroup) findViewById(R.id.rgJawaban8);
        final RadioGroup Jawaban9 = (RadioGroup) findViewById(R.id.rgJawaban9);
        final RadioGroup Jawaban10 = (RadioGroup) findViewById(R.id.rgJawaban10);

        Button btSubmit = (Button) findViewById(R.id.buttonkirim);
        btSubmit.setOnClickListener((View) ->{
            int s1 = Jawaban1.getCheckedRadioButtonId();
            switch (s1){
                case R.id.jwb1:
                    break;
                case R.id.jwb2:
                    break;
                case R.id.jwb3:
                    hasil += 10;
                    break;  }

            int s2 = Jawaban2.getCheckedRadioButtonId();
            switch (s2){
                case R.id.jwb1_2:
                    break;
                case R.id.jwb2_2:
                    hasil += 10;
                    break;
                case R.id.jwb3_2:
                    break;  }

            int s3 = Jawaban3.getCheckedRadioButtonId();
            switch (s3){
                case R.id.jwb1_3:
                    hasil += 10;
                    break;
                case R.id.jwb2_3:
                    break;
                case R.id.jwb3_3:
                    break;  }

            int s4 = Jawaban4.getCheckedRadioButtonId();
            switch (s4){
                case R.id.jwb1_4:
                    break;
                case R.id.jwb2_4:
                    hasil += 10;
                    break;
                case R.id.jwb3_4:
                    break;  }

            int s5 = Jawaban5.getCheckedRadioButtonId();
            switch (s5){
                case R.id.jwb1_5:
                    hasil += 10;
                    break;
                case R.id.jwb2_5:
                    break;
                case R.id.jwb3_5:
                    break;  }

            int s6 = Jawaban6.getCheckedRadioButtonId();
            switch (s6){
                case R.id.jwb1_6:
                    break;
                case R.id.jwb2_6:
                    break;
                case R.id.jwb3_6:
                    hasil += 10;
                    break;  }

            int s7 = Jawaban7.getCheckedRadioButtonId();
            switch (s7){
                case R.id.jwb1_7:
                    hasil += 10;
                    break;
                case R.id.jwb2_7:
                    break;
                case R.id.jwb3_7:
                    break; }

            int s8 = Jawaban8.getCheckedRadioButtonId();
            switch (s8){
                case R.id.jwb1_8:
                    hasil += 10;
                    break;
                case R.id.jwb2_8:
                    break;
                case R.id.jwb3_8:
                    break; }

            int s9 = Jawaban9.getCheckedRadioButtonId();
            switch (s9){
                case R.id.jwb1_9:
                    hasil += 10;
                    break;
                case R.id.jwb2_9:
                    break;
                case R.id.jwb3_9:
                    break; }

            int s10 = Jawaban10.getCheckedRadioButtonId();
            switch (s10){
                case R.id.jwb1_10:
                    break;
                case R.id.jwb2_10:
                    hasil += 10;
                    break;
                case R.id.jwb3_10:
                    break; }

            Toast.makeText(getApplicationContext(), "Score mu = " +hasil, Toast.LENGTH_SHORT).show();
            hasil = 0;
        });

    }
}