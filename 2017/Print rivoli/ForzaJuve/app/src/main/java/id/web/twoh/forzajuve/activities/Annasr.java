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

public class Annasr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.annasr);

        final MediaPlayer annasr1 = MediaPlayer.create(this, R.raw.annasr);

        ImageButton nasr = (ImageButton) this.findViewById(R.id.btnannasr1);

        nasr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                annasr1.start();
            }
        });
    }
}