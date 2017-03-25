package com.viralandroid.androidmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import co.mobiwise.library.OnActionClickedListener;

public class SongsPage extends AppCompatActivity implements OnActionClickedListener {
//Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songsPage);

        TextView textView=(TextView)findViewById(R.id.oneDirection);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageOneDirection);

        textView.setOnClickListener(clickListener);
        imageView1.setOnClickListener(clickListener);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.oneDirection:
                    startActivity(new Intent(getApplicationContext(),song1.class));
                    break;

                case R.id.imageOneDirection:
                    startActivity(new Intent(getApplicationContext(),song1.class));
                    break;

            }



        }
    };





    @Override
    public void onActionClicked(int id) {
        switch (id) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
