package com.bignerdranch.android.beatbox;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeatBoxActivity extends SingleActivityFragment {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
