package com.example.mybankappapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    private TextView txtCheckingBalance;
    private TextView txtSavingsBalance;
    private TextView txtCreditBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        txtCheckingBalance = findViewById(R.id.txtCheckingBalance);
        txtSavingsBalance = findViewById(R.id.txtSavingsBalance);
        txtCreditBalance = findViewById(R.id.txtCreditBalance);

        displayBalances();
    }

    private void displayBalances() {
        double checkingBalance = 500.0;
        double savingsBalance = 1000.0;
        double creditBalance = -200.0;

        txtCheckingBalance.setText("Checking Balance: $" + checkingBalance);
        txtSavingsBalance.setText("Savings Balance: $" + savingsBalance);
        txtCreditBalance.setText("Credit Balance: $" + creditBalance);
    }

    public void onTransferCheckingToCreditClick(View view) {
        boolean onTransferCheckingToCreditClick; {
            double transferAmount = 100.0;
            double checkingBalance = 500.0;
            double creditBalance = -200.0;

            if (checkingBalance >= transferAmount) {
                checkingBalance -= transferAmount;

                creditBalance += transferAmount;

                displayBalances();

                Toast.makeText(this, "Transfer from Checking to Credit successful!", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(this, "Insufficient funds in the Checking account", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void onTransferSavingsToCheckingClick(View view) {
        boolean onTransferSavingsToCheckingClick;
            double transferAmount = 50.0;
            double savingsBalance = 1000.0;
            double checkingBalance = 500.0;

            if (savingsBalance >= transferAmount) {
                savingsBalance -= transferAmount;
                checkingBalance += transferAmount;
                displayBalances();

                Toast.makeText(this, "Transfer from Savings to Checking successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Insufficient funds in the Savings account", Toast.LENGTH_SHORT).show();
            }
        }

    public void onLogoutClick(View view) {

        finish();
    }
}
