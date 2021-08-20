package com.example.login_register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity {

    private Button farm_add;
    private Button homeTop;
//    private Button notif;
    private Button logout;
    private Button aboutUs;
    private ImageView farmAddImage;
    private ImageView farmAddImage2;
    private TextView farm_add1;
    private TextView joinUs;
    private FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setFarmUi();

        firebaseAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(Home.this, MainActivity.class));
            }
        });

        farm_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, add_farm.class));
            }
        });

        farmAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, add_farm.class));
            }
        });

        farmAddImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, add_farm.class));
            }
        });

        farm_add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, add_farm.class));
            }
        });

        joinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, add_farm.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            /*case R.id.logoutMenu:{
                LogOut();
                break;
            }*/
            case R.id.profileMenu:{
                startActivity(new Intent(Home.this, profileActivity.class));
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    /*private void LogOut(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(Home.this, MainActivity.class));
    }*/



    private void setFarmUi(){
        farm_add = (Button) findViewById(R.id.add_farm);
        homeTop = (Button) findViewById(R.id.button3);
//        notif = (Button) findViewById(R.id.button5);
        logout = (Button) findViewById(R.id.button6);
        farmAddImage = (ImageView) findViewById(R.id.imageView2);
        farmAddImage2 = (ImageView) findViewById(R.id.imageView4);
        farm_add1 = (TextView) findViewById(R.id.textView);
        joinUs = (TextView) findViewById(R.id.textView3);
        aboutUs = (Button) findViewById(R.id.button5);
    }
}