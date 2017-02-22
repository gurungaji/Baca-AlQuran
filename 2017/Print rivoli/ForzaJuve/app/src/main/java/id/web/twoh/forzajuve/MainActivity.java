package id.web.twoh.forzajuve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.web.twoh.forzajuve.activities.Hal2;
import id.web.twoh.forzajuve.activities.Halhij;
import id.web.twoh.forzajuve.activities.Kumpsurat;
import id.web.twoh.forzajuve.activities.Tahap2;
import id.web.twoh.forzajuve.activities.Tahap3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Belajar21 = (Button) findViewById(R.id.button1);
        Button BelajarHij = (Button) findViewById(R.id.buttonhijaiyah);
        Button Belajartahap2 = (Button) findViewById(R.id.button2);
        Button Belajartahap3 = (Button) findViewById(R.id.button3);
        Button Belajarkumsur = (Button) findViewById(R.id.button4);


        Belajar21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), Hal2.class);
                startActivity(q);
            }
        });

        BelajarHij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent (getApplicationContext(),Halhij.class);
                startActivity(q);
            }
        });

        Belajartahap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tahap2.class);
                startActivity(q);
            }
        });

        Belajartahap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tahap3.class);
                startActivity(q);
            }
        });

        Belajarkumsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Kumpsurat.class);
                startActivity(q);
            }
        });
    }
}
