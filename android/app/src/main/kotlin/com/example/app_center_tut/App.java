package com.example.app_center_tut;
import android.app.Application;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AppCenter.start(this, "511f74e5-a948-47ee-b239-6b68437e1757",
                Analytics.class, Crashes.class);
    }
}
