package com.twigtotree.lingayatmatrimony.auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.google.firebase.quickstart.auth.R;

/**
 * Created by sgoud1 on 7/4/16.
 */
public class WelcomeActivity extends BaseActivity{
    String TAG = "WelcomeActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void startCustomSignUp(View v){
        Log.d(TAG,"startCustomSignUp");

    }

    public void startCustomSignIn(View v){
        Log.d(TAG,"startCustomSignIn");
        startActivity(new Intent(this, GoogleSignInActivity.class));
    }
}
