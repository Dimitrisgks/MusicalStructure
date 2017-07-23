package com.example.hell.mymusicstructure;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//search
        TextView searchText = (TextView) findViewById(R.id.searchText);


        searchText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });


        ImageView searchImage = (ImageView) findViewById(R.id.searchImage);


        searchImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
//playlist

        TextView playText = (TextView) findViewById(R.id.playText);


        playText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });


        ImageView playImage = (ImageView) findViewById(R.id.playImage);


        playImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

//art
        TextView artText = (TextView) findViewById(R.id.artText);


        artText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artIntent);
            }
        });


        ImageView artImage = (ImageView) findViewById(R.id.artImage);


        artImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artIntent);
            }
        });
//buy
        ImageView buyImage = (ImageView) findViewById(R.id.ImageBuy);

        buyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyingintent = new Intent(MainActivity.this, BuyActivity.class);
                startActivity(buyingintent);
            }
        });


    }
}