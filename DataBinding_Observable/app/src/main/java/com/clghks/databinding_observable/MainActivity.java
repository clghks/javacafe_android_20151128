package com.clghks.databinding_observable;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.clghks.databinding_observable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new User("Test", "User");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(user);
    }

    public void editButtonClick(View view){
        user.setFirstName(binding.firstName.getText().toString());
        user.setLastName(binding.lastName.getText().toString());
    }
}


