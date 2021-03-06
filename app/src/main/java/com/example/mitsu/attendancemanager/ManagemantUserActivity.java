package com.example.mitsu.attendancemanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ManagemantUserActivity extends AppCompatActivity {

    private View.OnClickListener buttonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.new_user:
                    Intent intent = new Intent(ManagemantUserActivity.this, UserRegistrationActivity.class);
                    startActivity(intent);
                    break;
                default:
                    alert("ユーザー編集","氏名");
                    break;
            }

        }
    };
    private void alert(String a){
        AlertDialog.Builder alertDlg = new AlertDialog.Builder(ManagemantUserActivity.this);
        alertDlg.setMessage(a);
        alertDlg.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // OK ボタンクリック処理
                    }
                });
        alertDlg.setNegativeButton(
                "キャンセル",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        alertDlg.setCancelable(true);
        alertDlg.create().show();
    }
    private void alert(String a,String b){
        AlertDialog.Builder alertDlg = new AlertDialog.Builder(ManagemantUserActivity.this);
        alertDlg.setTitle(a);
        alertDlg.setMessage(b);
        alertDlg.setPositiveButton(
                "削除",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        alert("削除しますか");
                    }
                });
        alertDlg.setNegativeButton(
                "編集",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(ManagemantUserActivity.this, UserUpdateActivity.class);
                        startActivity(intent);
                    }
                });
        // 表示
        alertDlg.setCancelable(true);
        alertDlg.create().show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managemant_user);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        View view;
        view = findViewById(R.id.new_user);
        view.setOnClickListener(buttonClick);
        view = findViewById(R.id.user1);
        view.setOnClickListener(buttonClick);
        view = findViewById(R.id.user2);
        view.setOnClickListener(buttonClick);
        view = findViewById(R.id.user3);
        view.setOnClickListener(buttonClick);
        view = findViewById(R.id.user4);
        view.setOnClickListener(buttonClick);
        view = findViewById(R.id.user5);
        view.setOnClickListener(buttonClick);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // オプションメニューを作成する
        getMenuInflater().inflate(R.menu.sub_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
