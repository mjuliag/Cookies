package com.example.julia.com.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.julia.com.cookies.R.drawable.after_cookie;
import static com.example.julia.com.cookies.R.drawable.before_cookie;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView beforeCookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        beforeCookieImageView.setImageResource(after_cookie);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView beforeCookieTextView = (TextView) findViewById(R.id.status_text_view);
        beforeCookieTextView.setText("I'm so full");

    }

    public void reset(View view) {
        ImageView afterCookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        afterCookieImageView.setImageResource(before_cookie);

        TextView afterCookieTextView = (TextView) findViewById(R.id.status_text_view);
        afterCookieTextView.setText("I'm so hungry");
    }
}