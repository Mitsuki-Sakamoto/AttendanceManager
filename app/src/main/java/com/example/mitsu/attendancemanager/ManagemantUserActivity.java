package com.example.mitsu.attendancemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ManagemantUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managemant_user);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        View view = findViewById(R.id.new_user);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(ManagemantUserActivity.this, UserRegistrationActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // オプションメニューを作成する
        getMenuInflater().inflate(R.menu.sub_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
