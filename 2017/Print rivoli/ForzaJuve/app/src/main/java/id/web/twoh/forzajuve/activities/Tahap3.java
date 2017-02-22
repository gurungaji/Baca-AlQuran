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

public class Tahap3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tahap3);

        Button Pra1 = (Button) findViewById(R.id.pa1);
        Button Pra2 = (Button) findViewById(R.id.pa2);

        Pra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tahpra1.class);
                startActivity(q);
            }
        });

        Pra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tahpra2.class);
                startActivity(q);
            }
        });
    }
}
