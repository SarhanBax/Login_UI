package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttona,loginbuttona;
    TextView forgetpass;
    RelativeLayout relativeforgetb,relativelogina;
    LinearLayout login_panelb,loginpanela;
    Button buttonb;
    TextView loginforforgetb,forgetforforgetb,texta,forgettexta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativelogina=findViewById(R.id.relativelogin);
        loginpanela=findViewById(R.id.login_panel);
        buttona=findViewById(R.id.loginbutton);
        texta=findViewById(R.id.text1);
        forgettexta=findViewById(R.id.forgetpassword);


        relativeforgetb=findViewById(R.id.relativeforget);
        login_panelb=findViewById(R.id.login_panelb);
        buttonb=findViewById(R.id.button);
        loginforforgetb=findViewById(R.id.loginforforget);
        forgetforforgetb=findViewById(R.id.forgetforforget);

        forgettexta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                relativeforgetb.setVisibility(View.VISIBLE);
                login_panelb.setVisibility(View.VISIBLE);

                buttonb.setVisibility(View.VISIBLE);

                loginforforgetb.setVisibility(View.VISIBLE);

                forgetforforgetb.setVisibility(View.VISIBLE);

                relativelogina.setVisibility(View.GONE);
                loginpanela.setVisibility(View.GONE);
                buttona.setVisibility(View.GONE);
                texta.setVisibility(View.GONE);
                forgettexta.setVisibility(View.GONE);


            }
        });

        loginforforgetb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeforgetb.setVisibility(View.GONE);
                login_panelb.setVisibility(View.GONE);

                buttonb.setVisibility(View.GONE);

                loginforforgetb.setVisibility(View.GONE);

                forgetforforgetb.setVisibility(View.GONE);

                relativelogina.setVisibility(View.VISIBLE);
                loginpanela.setVisibility(View.VISIBLE);
                buttona.setVisibility(View.VISIBLE);
                texta.setVisibility(View.VISIBLE);
                forgettexta.setVisibility(View.VISIBLE);

            }
        });






    }
}