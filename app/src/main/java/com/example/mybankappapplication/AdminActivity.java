package com.example.mybankappapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void onSwitchPasswordClick(View view) {

        Toast.makeText(this, "Password switched!", Toast.LENGTH_SHORT).show();
    }

    public void onAddUserClick(View view) {

        Toast.makeText(this, "User added!", Toast.LENGTH_SHORT).show();
    }

    public void onLogoutClick(View view) {

        finish();
    }
}
