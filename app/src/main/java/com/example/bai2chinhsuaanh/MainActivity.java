package com.example.bai2chinhsuaanh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private CheckBox chkHair;
    private CheckBox chkShirt;
    private CheckBox chkPant;
    private ImageView imgPicture;
    private Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();
        setEvent();
    }
    private void setEvent() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkHair.isChecked() && chkShirt.isChecked() && chkPant.isChecked()) {
                    imgPicture.setImageResource(R.drawable.full_body1);

                }
                else
                {
                    imgPicture.setImageResource(R.drawable.body1);
                }
                    if (chkHair.isChecked()) {
                        imgPicture.setImageResource(R.drawable.hair1);

                    }
                    if (chkShirt.isChecked()) {
                        imgPicture.setImageResource(R.drawable.shirt1);
                    }
                    if (chkPant.isChecked()) {
                        imgPicture.setImageResource(R.drawable.pant1);
                    }

                    if (chkHair.isChecked() && chkShirt.isChecked()) {
                        imgPicture.setImageResource(R.drawable.hair_shirt1);
                    }
                    if (chkHair.isChecked() && chkPant.isChecked()) {
                        imgPicture.setImageResource(R.drawable.hair_pant1);
                    }

                    if (chkShirt.isChecked() && chkPant.isChecked()) {
                        imgPicture.setImageResource(R.drawable.shirt_pant1);
                    }





            }
        });
    }

    private void setControl() {
        chkHair = (CheckBox) findViewById(R.id.chkHair);
        chkShirt = (CheckBox) findViewById(R.id.chkShirt);
        chkPant = (CheckBox) findViewById(R.id.chkPant);
        imgPicture = (ImageView) findViewById(R.id.imgPicture);
        btnOK = (Button) findViewById(R.id.btnOK);
    }


}
