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

public class Tahap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tahap2);

        Button Pemb1 = (Button) findViewById(R.id.tahap21);
        Button Pemb2 = (Button) findViewById(R.id.tahap22);
        Button Pemb3 = (Button) findViewById(R.id.tahap23);
        Button Pemb4 = (Button) findViewById(R.id.tahap24);
        Button Pemb5 = (Button) findViewById(R.id.tahap25);

        Pemb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah2pem1.class);
                startActivity(q);
            }
        });

        Pemb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah2pem2.class);
                startActivity(q);
            }
        });

        Pemb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah2pem3.class);
                startActivity(q);
            }
        });

        Pemb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah2pem4.class);
                startActivity(q);
            }
        });

        Pemb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah2pem5.class);
                startActivity(q);
            }
        });
    }
}
