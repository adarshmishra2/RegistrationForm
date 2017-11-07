package com.example.abhishekpc.registrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText nm;
        EditText dob;
        EditText gen;
        EditText occ;

//    String edittxtval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.submit);
        nm = (EditText) findViewById(R.id.nametxt);
        dob = (EditText) findViewById(R.id.dobtxt);
        gen = (EditText) findViewById(R.id.gendertxt);
        occ = (EditText) findViewById(R.id.occtxt);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i=new Intent(MainActivity.this,Main2Activity.class);
            i.putExtra("value",nm.getText().toString());
            i.putExtra("db",dob.getText().toString());
            i.putExtra("gn",gen.getText().toString());
            i.putExtra("oc",occ.getText().toString());
            startActivity(i);
            finish();
        }
    });

    }

}
