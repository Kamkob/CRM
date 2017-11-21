package com.example.br.crm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private CallReceiver callReceiver;
    private static final String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callReceiver = new CallReceiver();

    }

    public class CallReceiver extends PhonecallReceiver {

        @Override
        protected void onIncomingCallReceived(Context ctx, String number, Date start) {
            Log.d(TAG, "onIncomingCallReceived #number:" + number + ", #Date: " + String.valueOf(start)  );
        }

        @Override
        protected void onIncomingCallAnswered(Context ctx, String number, Date start) {
            Log.d(TAG, "onIncomingCallReceived #number:" + number + ", #Date: " + String.valueOf(start)  );

        }

        @Override
        protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
            Log.d(TAG, "onIncomingCallReceived #number:" + number + ", #Date: " + String.valueOf(start)  );

        }

        @Override
        protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
            Log.d(TAG, "onIncomingCallReceived #number:" + number + ", #Date: " + String.valueOf(start)  );
        }

        @Override
        protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
            Log.d(TAG, "onIncomingCallReceived #number:" + number + ", #Date: " + String.valueOf(start)  );

        }

        @Override
        protected void onMissedCall(Context ctx, String number, Date start) {
            Log.d(TAG, "onIncomingCallReceived #number:" + number + ", #Date: " + String.valueOf(start)  );
        }


    }
}
