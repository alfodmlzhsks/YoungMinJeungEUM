package com.goodset.younmin.youngminjeungeum.mainFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.goodset.younmin.youngminjeungeum.QuizActivity;
import com.goodset.younmin.youngminjeungeum.QuizStatActivity;
import com.goodset.younmin.youngminjeungeum.R;

public class QuizFragment extends Fragment {

    private ViewGroup root;
    private ImageView ivQuizBackground;
    private TextView tvQuizText;
    private ImageView ivQuizStatBackground;
    private TextView tvQuizStatText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root=(ViewGroup)inflater.inflate(R.layout.fragment_quiz,container,false);

        initView();
        initInstance();
        eventListener();


        return root;
    }

    private void initView(){
        ivQuizBackground=root.findViewById(R.id.ivQuizBackground);
        ivQuizStatBackground=root.findViewById(R.id.ivQuizStatBackground);
        tvQuizText=root.findViewById(R.id.tvQuizText);
        tvQuizStatText=root.findViewById(R.id.tvQuizStatText);
    }

    private void initInstance(){


    }

    private void eventListener(){
        ivQuizStatBackground.setOnClickListener(iconListener);
        tvQuizStatText.setOnClickListener(iconListener);
        ivQuizBackground.setOnClickListener(iconListener);
        tvQuizText.setOnClickListener(iconListener);

    }

    private View.OnClickListener iconListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ivQuizBackground:
                case R.id.tvQuizText:
                    Intent quizIntent =new Intent(getActivity(), QuizActivity.class);
                    startActivity(quizIntent);
                    break;
                case R.id.ivQuizStatBackground:
                case R.id.tvQuizStatText:
                    Intent quizStatIntent =new Intent(getActivity(), QuizStatActivity.class);
                    startActivity(quizStatIntent);
                    break;
            }
        }
    };
}
