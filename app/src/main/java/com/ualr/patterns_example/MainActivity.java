package com.ualr.patterns_example;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ualr.patterns_example.databinding.ActivityMainBinding;
import com.ualr.patterns_example.model.Database;

public class MainActivity extends AppCompatActivity {
    // TODO 02: Add a new view binding member to the class

    private ActivityMainBinding mBinding;
    private Database database;  //declared outside of the classes so everyone can access


    // TODO 07: We have to create an attribute of Activity class to hold a reference to the model.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // TODO 03: Set content view using the new binding member.
        // These two lines link the xml layout to the java code
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        // TODO 08: Initialize the model
        database = new Database();
        database.addContact("cjacuzzi","Casey Jacuzzi");
        database.addContact("JHatfield", "James Hatfield");



        // TODO 09: Check what information is in our database in this moment. We'll use the logcat

        // TODO 10: We have to define the code that is invoked when the user taps on each button
        this.mBinding.saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSaveBtnClicked();
            }
        });

        this.mBinding.retrieveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRetrieveBtnClicked();
            }
        });

    }


    private void onSaveBtnClicked(){
        String id = mBinding.idEditText.getText().toString();
        String name = mBinding.nameEditText.getText().toString();
        database.addContact(id,name);
        mBinding.idEditText.setText("");
        mBinding.nameEditText.setText("");
    }

    private void onRetrieveBtnClicked(){
        String id = mBinding.idEditText.getText().toString();
        mBinding.outputTextView.setText(database.getContact(id));
        mBinding.idEditText.setText("");
        mBinding.nameEditText.setText("");
    }
}
