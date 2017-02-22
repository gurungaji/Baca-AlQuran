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

public class alikhlas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alikhlas1);

        final MediaPlayer aliklas = MediaPlayer.create(this, R.raw.alikhlas);

        ImageButton iklas = (ImageButton) this.findViewById(R.id.btnikhlas);

        iklas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aliklas.start();
            }
        });
    }

}