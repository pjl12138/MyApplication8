package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void go(View view){
        Intent intent=new Intent(this,Main2Activity.class);
        User user=new User(100,"Peng");
        //intent.putExtra("myUser",user);
        Bundle bundle=new Bundle();
        bundle.putParcelable("myUser",user);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
