package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        User user=getIntent().getParcelableExtra("myUser");
//        if(null!=user){
//            System.out.println(user.getId()+"  "+user.getName());
//        }
        User user=getIntent().getExtras().getParcelable("myUser");
          if(null!=user){
              System.out.println(user.getId()+"  "+user.getName());
       }
    }
}
