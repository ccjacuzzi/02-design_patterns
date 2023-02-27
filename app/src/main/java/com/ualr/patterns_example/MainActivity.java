package com.ualr.patterns_example;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.patterns_example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // TODO 02: Add a new view binding member to the class

    private ActivityMainBinding mBinding;



    // TODO 04: We have to create an attribute of Activity class to hold a reference to the model.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO 03: Set content view using the new binding member.
        // These two lines link the xml layout to the java code
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        
        // TODO 05: Initialize the model
        // TODO 06: Check what information is in our database in this moment. We'll use the logcat
        // TODO 07: We have to define the code that is invoked when the user taps on each button
    }
}
