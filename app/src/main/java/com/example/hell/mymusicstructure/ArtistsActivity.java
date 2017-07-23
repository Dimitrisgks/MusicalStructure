package com.example.hell.mymusicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

//home

        TextView homeText = (TextView) findViewById(R.id.homeText);


        homeText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });


        ImageView homeImage = (ImageView) findViewById(R.id.homeImage);


        homeImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

//playlists

        TextView playText = (TextView) findViewById(R.id.playText);


        playText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);
                startActivity(playlistIntent);
            }
        });


        ImageView playlistsImage = (ImageView) findViewById(R.id.playImage);


        playlistsImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playlists ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(ArtistsActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

//search

        TextView searchText = (TextView) findViewById(R.id.searchText);

        searchText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search TextView is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(ArtistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });


        ImageView searchImage = (ImageView) findViewById(R.id.searchImage);


        searchImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search ImageView is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(ArtistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });


    }
}