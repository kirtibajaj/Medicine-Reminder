package com.example.mypc.ep;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class T2S_Activity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private TextToSpeech tts ;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t2_s_);
        textView = (TextView)findViewById(R.id.et);
        Intent i = getIntent() ;
        String name = i.getStringExtra("text");

        textView.setText(name);
        tts = new TextToSpeech(this , this);
        speakOut();

    }

    @Override
    protected void onDestroy() {
        if(tts!= null){
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();


    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.US);
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                //  Log.e("TTS", "This Language is not supported");
            } else {
                // bt.setEnabled(true);
                speakOut();
            }
        } else {
            //Log.e("TTS", "Initilization failed");
        }

    }

    private void speakOut(){
        try{
            Intent i = getIntent();
            String name = i.getStringExtra("text");
            textView.setText(name);
            tts.speak(name, TextToSpeech.QUEUE_FLUSH , null);
        }catch (Exception e ){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

}
