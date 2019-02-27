package com.goodset.younmin.youngminjeungeum.mainFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goodset.younmin.youngminjeungeum.R;

public class QuizFragment extends Fragment {

    private ViewGroup root;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root=(ViewGroup)inflater.inflate(R.layout.fragment_quiz,container,false);

        return root;
    }
}
