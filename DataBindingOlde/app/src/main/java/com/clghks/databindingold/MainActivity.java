package com.clghks.databindingold;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.clghks.databindingold.data.User;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView nameTextView;
    private TextView birthdayTextView;
    private TextView physicalTextView;
    private TextView schoolTextView;
    private TextView belongTextView;
    private TextView homepageUrlTextView;

    private User userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
        setUserData();
    }

    private void setUserData() {
        imageView.setImageResource(userData.getImage());
        nameTextView.setText(userData.getName() + " (" + userData.getJob()+ ")");
        birthdayTextView.setText(getDateFormat(userData.getBirthday()));
        physicalTextView.setText(getString(R.string.physical, userData.getHeight(), userData.getWeight()));
        schoolTextView.setText(userData.getSchool());
        belongTextView.setText(userData.getBelong());
        homepageUrlTextView.setText(userData.getHomepageUrl());
    }

    private String getDateFormat(Date birthday) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        return dateFormat.format(birthday);
    }

    private void initView() {
        imageView = (ImageView)findViewById(R.id.iv_image);
        nameTextView = (TextView)findViewById(R.id.tv_name);
        birthdayTextView = (TextView)findViewById(R.id.tv_birthday);
        physicalTextView = (TextView)findViewById(R.id.tv_physical);
        schoolTextView = (TextView)findViewById(R.id.tv_school);
        belongTextView = (TextView)findViewById(R.id.tv_belong);
        homepageUrlTextView = (TextView)findViewById(R.id.tv_homepageUrl);
    }

    private void initData() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, 1993);
        birthday.set(Calendar.MONTH, Calendar.MAY);
        birthday.set(Calendar.DAY_OF_MONTH, 16);

        userData = new User();
        userData.setImage(R.mipmap.image_iu);
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
