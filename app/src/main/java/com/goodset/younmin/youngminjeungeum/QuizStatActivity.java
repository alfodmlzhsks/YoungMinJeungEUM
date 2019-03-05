package com.goodset.younmin.youngminjeungeum;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.goodset.younmin.youngminjeungeum.databinding.ActivityQuizStatBinding;

public class QuizStatActivity extends AppCompatActivity {

    ActivityQuizStatBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_quiz_stat);
        binding.setQuizStat(this);

        binding.ibtnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
