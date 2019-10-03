package com.example.worldclock;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat sdf12 = new SimpleDateFormat("h:mm a");

        Date currentTimeSyd = Calendar.getInstance().getTime();

        String syd12 = sdf12.format(currentTimeSyd);

        Date currentTimeParis = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(16));
        String paris12 = sdf12.format(currentTimeParis);

        Date currentTimeNY = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(10));
        String ny12 = sdf12.format(currentTimeNY);

        Date currentTimeTokyo = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(23));
        String tokyo12 = sdf12.format(currentTimeTokyo);

        Date currentTimeSF = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(7));
        String sf12 = sdf12.format(currentTimeSF);

        TextView tv = (TextView)findViewById(R.id.textViewSyd);
        tv.setText("Time: " + syd12);
        TextView tv2 = (TextView)findViewById(R.id.textViewParis);
        tv2.setText("Time: " + paris12);
        TextView tv3 = (TextView)findViewById(R.id.textViewNY);
        tv3.setText("Time: " + ny12);
        TextView tv4 = (TextView)findViewById(R.id.textViewTokyo);
        tv4.setText("Time: " + tokyo12);
        TextView tv5 = (TextView)findViewById(R.id.textViewSF);
        tv5.setText("Time: " + sf12);
    }

    public void click24(View v)
    {

        SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm");

        Date currentTimeSyd = Calendar.getInstance().getTime();

        String syd24 = sdf24.format(currentTimeSyd);

        Date currentTimeParis = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(16));
        String paris24 = sdf24.format(currentTimeParis);

        Date currentTimeNY = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(10));
        String ny24 = sdf24.format(currentTimeNY);

        Date currentTimeTokyo = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(23));
        String tokyo24 = sdf24.format(currentTimeTokyo);

        Date currentTimeSF = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(7));
        String sf24 = sdf24.format(currentTimeSF);

                TextView tv = (TextView)findViewById(R.id.textViewSyd);
                tv.setText("Time: " + syd24);
                TextView tv2 = (TextView)findViewById(R.id.textViewParis);
                tv2.setText("Time: " + paris24);
                TextView tv3 = (TextView)findViewById(R.id.textViewNY);
                tv3.setText("Time: " + ny24);
                TextView tv4 = (TextView)findViewById(R.id.textViewTokyo);
                tv4.setText("Time: " + tokyo24);
                TextView tv5 = (TextView)findViewById(R.id.textViewSF);
                tv5.setText("Time: " + sf24);

    }

    public void click12(View v)
    {

        SimpleDateFormat sdf12 = new SimpleDateFormat("h:mm a");

        Date currentTimeSyd = Calendar.getInstance().getTime();

        String syd12 = sdf12.format(currentTimeSyd);

        Date currentTimeParis = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(16));
        String paris12 = sdf12.format(currentTimeParis);

        Date currentTimeNY = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(10));
        String ny12 = sdf12.format(currentTimeNY);

        Date currentTimeTokyo = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(23));
        String tokyo12 = sdf12.format(currentTimeTokyo);

        Date currentTimeSF = new Date(currentTimeSyd.getTime() + TimeUnit.HOURS.toMillis(7));
        String sf12 = sdf12.format(currentTimeSF);

        TextView tv = (TextView)findViewById(R.id.textViewSyd);
        tv.setText("Time: " + syd12);
        TextView tv2 = (TextView)findViewById(R.id.textViewParis);
        tv2.setText("Time: " + paris12);
        TextView tv3 = (TextView)findViewById(R.id.textViewNY);
        tv3.setText("Time: " + ny12);
        TextView tv4 = (TextView)findViewById(R.id.textViewTokyo);
        tv4.setText("Time: " + tokyo12);
        TextView tv5 = (TextView)findViewById(R.id.textViewSF);
        tv5.setText("Time: " + sf12);
    }
}
