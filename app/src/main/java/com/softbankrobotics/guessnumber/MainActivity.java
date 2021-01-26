package com.softbankrobotics.guessnumber;

import android.os.Bundle;

import com.aldebaran.qi.sdk.QiContext;
import com.aldebaran.qi.sdk.QiSDK;
import com.aldebaran.qi.sdk.RobotLifecycleCallbacks;
import com.aldebaran.qi.sdk.design.activity.RobotActivity;

public class MainActivity extends RobotActivity implements RobotLifecycleCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // don't forget to say hello...
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // don't forget to say bye...
    }

    @Override
    public void onRobotFocusGained(QiContext qiContext) {

        /////////////////////////////////////////////////
        //////////////////  HANDS ON  //////////////////
        //
        // 1. create a .top for your topic

        // 2. build the chat

        // 3/ set a variable to use in the chatbot

        // 4/ you'll need at least one bookmark to communicate between code and topic

        // 5/ and a listener to process bookmarks as they are met while pepper speaks

        // 6/ use a bookmark and a listener to make Pepper speaks first

        ///////////////////////////////////////////////////////////////
    }

    @Override
    public void onRobotFocusLost() {

    }

    @Override
    public void onRobotFocusRefused(String reason) {

    }
}
