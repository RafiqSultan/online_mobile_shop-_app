package com.online.mobile_shop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
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

    public void AddToCart(View view) {
        Intent intent=new Intent(getApplicationContext(),CartActivity.class);
        startActivity(intent);
    }
}