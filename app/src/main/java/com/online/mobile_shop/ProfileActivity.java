package com.online.mobile_shop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar); setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar,menu);
        return super.onCreateOptionsMenu(menu);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.contactus:
                Intent intent = new Intent(getApplicationContext(),ContactusActivity.class);
                startActivity(intent);
                return true;
            case R.id.home_bar:
                setContentView(R.layout.activity_home);
                return true;
            case R.id.profile_bar:
                setContentView(R.layout.activity_profile);
                return true;
            case R.id.logout:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void showProfile(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
        startActivity(intent);
    }
    public void myCart(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(),CartActivity.class);
        startActivity(intent);
    }
    public void myOrder(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(),MyOrderActivity.class);
        startActivity(intent);
    }

    public void goToHome(MenuItem item) {
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }

}