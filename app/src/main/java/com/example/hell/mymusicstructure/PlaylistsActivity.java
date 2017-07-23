package com.example.hell.mymusicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

//home
        TextView homeText = (TextView) findViewById(R.id.homeText);


        homeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });


        ImageView homeImage = (ImageView) findViewById(R.id.homeImage);


        homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
// search

        TextView searchText = (TextView) findViewById(R.id.searchText);


        searchText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });


        ImageView searchImage = (ImageView) findViewById(R.id.searchImage);


        searchImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
//artists

        TextView artText = (TextView) findViewById(R.id.artText);


        artText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                startActivity(artIntent);
            }
        });


        ImageView artImage = (ImageView) findViewById(R.id.artImage);

        artImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(PlaylistsActivity.this, ArtistsActivity.class);
                startActivity(artIntent);
            }
        });


    }
}