package com.example.employeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddEmployee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
