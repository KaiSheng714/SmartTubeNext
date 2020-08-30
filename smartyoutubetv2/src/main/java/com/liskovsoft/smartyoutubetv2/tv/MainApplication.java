package com.liskovsoft.smartyoutubetv2.tv;

import android.app.Application;
import com.liskovsoft.smartyoutubetv2.common.mvp.ViewManager;
import com.liskovsoft.smartyoutubetv2.common.mvp.views.DetailsView;
import com.liskovsoft.smartyoutubetv2.common.mvp.views.MainView;
import com.liskovsoft.smartyoutubetv2.common.mvp.views.OnboardingView;
import com.liskovsoft.smartyoutubetv2.common.mvp.views.PlaybackView;
import com.liskovsoft.smartyoutubetv2.common.mvp.views.SearchView;
import com.liskovsoft.smartyoutubetv2.tv.ui.main.MainActivity;
import com.liskovsoft.smartyoutubetv2.tv.ui.details.VideoDetailsActivity;
import com.liskovsoft.smartyoutubetv2.tv.ui.onboarding.OnboardingActivity;
import com.liskovsoft.smartyoutubetv2.tv.ui.playback.PlaybackActivity;
import com.liskovsoft.smartyoutubetv2.tv.ui.search.SearchActivity;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ViewManager viewManager = ViewManager.instance(this);

        viewManager.register(MainView.class, MainActivity.class);
        viewManager.register(PlaybackView.class, PlaybackActivity.class);
        viewManager.register(OnboardingView.class, OnboardingActivity.class);
        viewManager.register(DetailsView.class, VideoDetailsActivity.class);
        viewManager.register(SearchView.class, SearchActivity.class);
    }
}
