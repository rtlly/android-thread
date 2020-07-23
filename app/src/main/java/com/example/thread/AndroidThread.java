package com.example.thread;

import android.os.SystemClock;
import android.widget.Button;

public class AndroidThread extends Thread {
    private Button startThread;

    public AndroidThread(Button startThread) {
        this.startThread = startThread;
    }


    @Override
    public void run() {
        int count = 0;
        startThread.setClickable(false);
        for (int i = 0; i < 10; ++i) {
            SystemClock.sleep(1000);
            ++count;
            final int finalCount = count;
            startThread.post(new Runnable() {
                @Override
                public void run() {
                    startThread.setText(String.valueOf(finalCount));
                }
            });
        }
        startThread.setClickable(true);
    }
}
