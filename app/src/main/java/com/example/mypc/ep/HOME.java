package com.example.mypc.ep;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HOME extends AppCompatActivity {

    private TextView mTextMessage;
    private HomeFragment homeFragment;
    private ScheduleFragment scheduleFragment;
    private NotificationFragment notificationFragment;
   // private Schedule schedule;
    //private Contact contact;
    Button button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // schedule=new Schedule();
        homeFragment =new HomeFragment();
        notificationFragment=new NotificationFragment();
        scheduleFragment=new ScheduleFragment();
       // contact=new Contact();

        setFragment(homeFragment);
        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
     BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setFragment(homeFragment);
                    return true;
                case R.id.navigation_dashboard:
                    startActivity(new Intent(HOME.this,Main2Activity.class));
                    return true;
                case R.id.navigation_notifications:
                    setFragment(notificationFragment);
                    return true;
                case R.id.Contact:
                    ContactFragment contact=new ContactFragment();
                setFragment(contact);
                    return true;
                case R.id.Schedule:
                    startActivity(new Intent(HOME.this,MainActivity.class));
                    return true;


            }
            return false;
        }
    };


        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
