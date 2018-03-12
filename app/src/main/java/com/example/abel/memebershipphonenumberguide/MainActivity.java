package com.example.abel.memebershipphonenumberguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //phone number for O'reillys Auto Store
    public void oreillyMessage(View view) {

        TextView phoneInformation = (TextView)findViewById(R.id.messageText);
        phoneInformation.setText("Orielly: 602-123-4567");
    }

    //phone number for Frys Grocery Store
    public void frysMessage(View view) {

        TextView phoneInformation = (TextView)findViewById(R.id.messageText);
        phoneInformation.setText("Frys: 602-123-4567");
    }

    //phone number for GreatClips Salon
    public void greatClipsMessage(View view) {

        TextView phoneInformation = (TextView)findViewById(R.id.messageText);
        phoneInformation.setText("Great Clips: 602-123-4567");
    }

    //phone number for petSmart
    public void petSmartMessage(View view) {

        TextView phoneInformation = (TextView)findViewById(R.id.messageText);
        phoneInformation.setText("Pet Smart: 602-123-4567");
    }

    //phone number for Harbor Fright Tools
    public void harborFreightMessage(View view) {

        TextView phoneInformation = (TextView)findViewById(R.id.messageText);
        phoneInformation.setText("Harbor Freight: 602-123-4567");
    }

}
