package com.example.abhishekpc.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView nmtv,gntv,octv,dbtv;
    String valfrmact1,genact1,occact1,dobact1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nmtv = (TextView) findViewById(R.id.nametv);
        dbtv = (TextView) findViewById(R.id.dobtv);
        gntv = (TextView) findViewById(R.id.gentv);
        octv = (TextView) findViewById(R.id.occtv);
//        Intent i2=getIntent();
//        Bundle bundle=i2.getExtras();
//        String fr=bundle.getString("value");
//
        valfrmact1=getIntent().getExtras().getString("value");
        nmtv.setText(valfrmact1);
        dobact1=getIntent().getExtras().getString("db");
        dbtv.setText(dobact1);
        genact1=getIntent().getExtras().getString("gn");
        gntv.setText(genact1);
        occact1=getIntent().getExtras().getString("oc");
        octv.setText(occact1);
    }
}
