
package com.example.mybankappapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUsername;
    private EditText edtPassword;
    private Switch switchUserAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        switchUserAdmin = findViewById(R.id.switchUserAdmin);
    }

    public void onLoginClick(View view) {
        String username = edtUsername.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();
        boolean isAdmin = switchUserAdmin.isChecked();

        if (isValidCredentials(username, password, isAdmin)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidCredentials(String username, String password, boolean isAdmin) {
        if (isAdmin) {
            return username.equals("admin123") && password.equals("adminpassword123");
        } else {
            return username.equals("user123") && password.equals("password123");
        }
    }
}
