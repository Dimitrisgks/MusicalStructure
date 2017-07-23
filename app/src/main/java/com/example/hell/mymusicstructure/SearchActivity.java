package com.example.hell.mymusicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

//home

        TextView homeText = (TextView) findViewById(R.id.homeText);


        homeText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });


        ImageView homeImage = (ImageView) findViewById(R.id.homeImage);


        homeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
//playlists

        TextView playText = (TextView) findViewById(R.id.playText);


        playText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(SearchActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });


        ImageView playImage = (ImageView) findViewById(R.id.playImage);


        playImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(SearchActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        //art

        TextView artText = (TextView) findViewById(R.id.artText);


        artText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(SearchActivity.this, ArtistsActivity.class);
                startActivity(artIntent);
            }
        });


        ImageView artImage = (ImageView) findViewById(R.id.artImage);
        artImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mood ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(SearchActivity.this, ArtistsActivity.class);
                startActivity(artIntent);
            }
        });


    }
}