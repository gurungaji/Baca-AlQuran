package id.web.twoh.forzajuve.activities;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import id.web.twoh.forzajuve.R;

/**
 * Created by Seven on 06-Feb-17.
 */

public class fatihah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alfatihah);

        final MediaPlayer fatihah = MediaPlayer.create(this, R.raw.alfatihah);

        ImageButton fatih = (ImageButton) this.findViewById(R.id.btnfatihah1);

        fatih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fatihah.start();
            }
        });
    }

}