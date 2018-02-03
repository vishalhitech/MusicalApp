package com.example.hp.musicalapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    // Helpful Constants Use in A[[lication

    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    //Add member variables here

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Created a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        //Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b, 1);
    }


    //Add the play methods triggered by the buttons
    public void play_C(View v){
        Log.d("Musical App" , "RED button Clicked");
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void play_D(View v){
        Log.d("Musical App" , "ORIANGE button Clicked");
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void play_E(View v){
        Log.d("Musical App" , "YELLOW button Clicked");
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void play_F(View v){
        Log.d("Musical App" , "RED button Clicked");
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void play_G(View v){
        Log.d("Musical App" , "Turquoise button Clicked");
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void play_A(View v){
        Log.d("Musical App" , "GREEN button Clicked");
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

    public void play_B(View v){
        Log.d("Musical App" , "PURPLE button Clicked");
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }

}
