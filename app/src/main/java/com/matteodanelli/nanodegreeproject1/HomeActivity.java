package com.matteodanelli.nanodegreeproject1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Snackbar homeSnackbar = Snackbar.make(findViewById(R.id.home_linear_layout), "", Snackbar.LENGTH_LONG);

        final CardView card1 = (CardView) findViewById(R.id.home_card_1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeSnackbar.setText("This button will launch Popular Movies");
                homeSnackbar.show();
            }
        });


        final CardView card2 = (CardView) findViewById(R.id.home_card_2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeSnackbar.setText("This button will launch Stock Hawk");
                homeSnackbar.show();
            }
        });

        final CardView card3 = (CardView) findViewById(R.id.home_card_3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeSnackbar.setText("This button will launch Build it Bigger");
                homeSnackbar.show();
            }
        });

        final CardView card4 = (CardView) findViewById(R.id.home_card_4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeSnackbar.setText("This button will launch Make Your App Material");
                homeSnackbar.show();
            }
        });

        final CardView card5 = (CardView) findViewById(R.id.home_card_5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeSnackbar.setText("This button will launch Go Ubiquitous");
                homeSnackbar.show();
            }
        });

        final CardView card6 = (CardView) findViewById(R.id.home_card_6);
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeSnackbar.setText("This button will launch Capstone");
                homeSnackbar.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

}
