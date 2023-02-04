package com.online.mobile_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void gotocart(MenuItem item) {
        Intent intent=new Intent(getApplicationContext(),CartActivity.class);
        startActivity(intent);
    }

    public void showProfile(MenuItem item) {
        Intent intent=new Intent(getApplicationContext(),ProfileActivity.class);
        startActivity(intent);
    }

    public void contc(MenuItem item) {
        Intent intent=new Intent(getApplicationContext(),ContactusActivity.class);
        startActivity(intent);
    }
}