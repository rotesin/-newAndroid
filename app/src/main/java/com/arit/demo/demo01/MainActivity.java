package com.arit.demo.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import android.widget.TextView;

import java.security.PublicKey;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.arit.demo.demo01.R.string.helloMessage;

public class MainActivity extends AppCompatActivity  {

@BindView(R.id.tvMessage) TextView tvMessage;
//create onclick

    @OnClick(R.id.btnHello)
    public void doClickHello(){

        this.tvMessage.setText(R.string.helloMessage);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //TextView tvMessage= (TextView) findViewById(R.id.tvMessage)
//        final TextView tvMessage=  findViewById(R.id.tvMessage); //xml
//
//
//
//
//        Button btnHello= (Button) findViewById(R.id.btnHello);
//        btnHello.setText("Hello John!");
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                //tvMessage.setText("hello John Doe, this is a custom message");
//                this.tvMessage.setText("...");
//
//            }
//        });

    }





}
