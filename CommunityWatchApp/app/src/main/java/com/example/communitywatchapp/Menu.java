package com.example.communitywatchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void clickedNotif(View view){
        if(view.getId()==R.id.btnNotifications){
            Intent intent = new Intent(this, Notifications.class);
            startActivity(intent);
        }
    }

    public void clickedReport(View view){
        if(view.getId()==R.id.btnReport){
            Intent intent = new Intent(this, Report.class);
            startActivity(intent);
        }
    }

    public void clickedEmergency(View view){
        if(view.getId()==R.id.btnEmergency){
            Intent intent = new Intent(this, EmergencyMessage.class);
            startActivity(intent);
        }
    }
}
