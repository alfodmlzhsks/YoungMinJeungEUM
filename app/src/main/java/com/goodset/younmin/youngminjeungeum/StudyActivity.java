package com.goodset.younmin.youngminjeungeum;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.goodset.younmin.youngminjeungeum.databinding.ActivityStudyBinding;

public class StudyActivity extends AppCompatActivity {

    ActivityStudyBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_study);
        binding.setStudy(this);

        binding.ibtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
