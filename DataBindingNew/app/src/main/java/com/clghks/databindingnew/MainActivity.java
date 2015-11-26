package com.clghks.databindingnew;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.clghks.databindingnew.data.User;
import com.clghks.databindingnew.databinding.ActivityMainBinding;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private User userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(userData);
    }

    private void initData() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, 1993);
        birthday.set(Calendar.MONTH, Calendar.MAY);
        birthday.set(Calendar.DAY_OF_MONTH, 16);

        userData = new User();
        userData.setImage(getDrawable(R.mipmap.image_iu));
        userData.setName("아이유");
        userData.setBirthday(birthday.getTime());
        userData.setJob("가수");
        userData.setWeight(44f);
        userData.setHeight(161.8f);
        userData.setSchool("동덕여자고등학교");
        userData.setBelong("로엔텐터테인먼트");
        userData.setHomepageUrl("http://loen-tree.com/?p=11");
    }
}


