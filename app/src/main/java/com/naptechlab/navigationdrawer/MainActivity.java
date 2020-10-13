package com.naptechlab.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer) ;
        navigationView=(NavigationView)findViewById(R.id.nav_menu);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.menu_home:
                        Intent intent= new Intent(MainActivity.this,HomeActivity.class);
                        startActivity(intent);

                        break;
                    case R.id.menu_settings:
                        Intent intent1= new Intent(MainActivity.this,SettingsActivity.class);
                        startActivity(intent1);

                        break;
                    case R.id.menu_store:
                        Intent intent2= new Intent(MainActivity.this,StoreActivity.class);
                        startActivity(intent2);

                        break;
                    case R.id.menu_contacts:
                        Intent intent3= new Intent(MainActivity.this,ContactsActivity.class);
                        startActivity(intent3);

                        break;

                }
                return true;
            }
        });

    }




 }
