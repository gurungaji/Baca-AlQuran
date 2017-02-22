package id.web.twoh.forzajuve.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import id.web.twoh.forzajuve.R;

/**
 * Created by Seven on 14-Dec-16.
 */

public class Hal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hal2);

        Button Belajar31 = (Button) findViewById(R.id.buttonhal21);
        Button Tah1pem2 = (Button) findViewById(R.id.buttonhal22);
        final Button Tah1pem3 = (Button) findViewById(R.id.buttonhal23);

        Belajar31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(), Hal3.class);
                startActivity(q);
            }
        });

        Tah1pem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah1pem2.class);
                startActivity(q);
            }
        });

        Tah1pem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(getApplicationContext(),Tah1pem3.class);
                startActivity(q);
            }
        });
    }
}
