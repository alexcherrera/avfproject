package com.fullsail.avfproandr;

import android.os.Bundle;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///Users/alexcherrera/Desktop/FullSail/Month%209/avfproject/avfandrpro/assets/www/index.html");  
    }
}
