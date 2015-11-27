package com.clghks.databinding_observable_old;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView firstName;
    private TextView lastName;
    private EditText firstNameEditText;
    private EditText lastNameEditText;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User("Test", "User");
        initView();
        setUserData();
    }

    private void initView() {
        firstName = (TextView)findViewById(R.id.tv_firstName);
        lastName = (TextView)findViewById(R.id.tv_lastName);
        firstNameEditText = (EditText)findViewById(R.id.firstName);
        lastNameEditText = (EditText)findViewById(R.id.lastName);
    }

    private void setUserData() {
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
    }

    public void editButtonClick(View view){
        user.setFirstName(firstNameEditText.getText().toString());
        user.setLastName(lastNameEditText.getText().toString());

        setUserData();
    }
}
