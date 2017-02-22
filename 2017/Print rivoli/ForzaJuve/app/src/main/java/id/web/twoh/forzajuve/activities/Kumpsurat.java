package id.web.twoh.forzajuve.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.web.twoh.forzajuve.R;

/**
 * Created by Seven on 15-Dec-16.
 */

public class Kumpsurat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kumsurat);


        final Button fatihah = (Button) findViewById(R.id.btnfatihah);
        final Button annas = (Button) findViewById(R.id.btnannas);
        final Button alfalaq = (Button) findViewById(R.id.btnalfalaq);
        final Button alikhlass = (Button) findViewById(R.id.btnalikhlas);
        final Button allahabb = (Button) findViewById(R.id.btnallahab);
        final Button annasrr = (Button) findViewById(R.id.btnannasr);


        fatihah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), fatihah.class);
                startActivity(q);
            }
        });

        annas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), annas.class);
                startActivity(q);
            }
        });

        alfalaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), alfalaq.class);
                startActivity(q);
            }
        });

        alikhlass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), alikhlas.class);
                startActivity(q);
            }
        });

        allahabb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), Allahab.class);
                startActivity(q);
            }
        });

        annasrr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), Annasr.class);
                startActivity(q);
            }
        });

    }
}
