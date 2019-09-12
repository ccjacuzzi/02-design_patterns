package com.ualr.patterns_example;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText mIdET;
    private EditText mNameET;
    private Button mRetrieveBtn;
    private Button mSaveBtn;
    private TextView mOutputUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 13: We can test everything is ok with our model
        // TODO 14: Check what information is in our database in this moment. We'll use the logcat
        // TODO 15: Obviously we can check that everything is ok debugging
        // TODO 16: We have to get the references to the text fields in the GUI in order to get data
        this.mIdET = findViewById(R.id.id_edit_text);
        this.mNameET = findViewById(R.id.name_edit_text);
        this.mOutputUser = findViewById(R.id.output_text_view);
        // TODO 17: We have to get a reference of each Button in the text field in order to define the
        // actions triggered in response to a click action
        this.mRetrieveBtn = findViewById(R.id.retrieve_btn);
        // TODO 18: Ctrl + D is very useful. We can duplicate a line
        this.mSaveBtn = findViewById(R.id.save_btn);
        // TODO 19: We have to define the code that is invoked when the user taps on each button
        // TODO 20: Maybe you don't remember all the methods of a class or interface...
    }
}
