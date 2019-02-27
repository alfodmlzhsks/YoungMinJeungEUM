package com.goodset.younmin.youngminjeungeum;

import android.content.Intent;
import android.media.Image;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.goodset.younmin.youngminjeungeum.mainFragment.InfoFragment;
import com.goodset.younmin.youngminjeungeum.mainFragment.MainFragment;
import com.goodset.younmin.youngminjeungeum.mainFragment.QuizFragment;

public class MainActivity extends AppCompatActivity {

    //프래그먼트 부분
    private FrameLayout frmMainBox;

    private final int FRAGMENT_MAIN=1;
    private final int FRAGMENT_QUIZ=2;
    private final int FRAGMENT_INFO=3;
    private int pageStat=1;

    //상단 버튼 부분
    private ImageView ivTitleTopImage;
    private ImageButton ibtnTitleTopIcon;
    private TextView tvTitleTopText;


    //하단 버튼 부분
    private ImageView ivTitleBottomImage;
    private ImageButton ibtnTitleBottomIcon;
    private TextView tvTitleBottomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initInstance();
        eventListener();

        defaultPageSetting();

    }

    private void initView(){
        frmMainBox=findViewById(R.id.frmMainBox);

        ivTitleTopImage=findViewById(R.id.ivTitleTopImage);
        ibtnTitleTopIcon=findViewById(R.id.ibtnTitleTopIcon);
        tvTitleTopText=findViewById(R.id.tvTitleTopText);

        ivTitleBottomImage=findViewById(R.id.ivTitleBottomImage);
        ibtnTitleBottomIcon=findViewById(R.id.ibtnTitleBottomIcon);
        tvTitleBottomText=findViewById(R.id.tvTitleBottomText);


    }

    private void initInstance(){


    }

    private void eventListener(){
        ivTitleBottomImage.setOnClickListener(titleBarListener);
        ibtnTitleBottomIcon.setOnClickListener(titleBarListener);
        tvTitleBottomText.setOnClickListener(titleBarListener);
        ivTitleTopImage.setOnClickListener(titleBarListener);
        ibtnTitleTopIcon.setOnClickListener(titleBarListener);
        tvTitleTopText.setOnClickListener(titleBarListener);

    }

    private void callFragment(int fragmentNo,int anim){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

        switch(fragmentNo){
            case 1:
                MainFragment mainFragment=new MainFragment();
                if(anim==0){
                    transaction.setCustomAnimations(R.anim.slide_in_up,R.anim.slide_out_up);
                }else if(anim==1){
                    transaction.setCustomAnimations(R.anim.slide_in_down,R.anim.slide_out_down);
                }
                transaction.replace(R.id.frmMainBox,mainFragment);
                transaction.commit();
                break;
            case 2:
                QuizFragment quizFragment=new QuizFragment();
                if(anim==0){
                    transaction.setCustomAnimations(R.anim.slide_in_up,R.anim.slide_out_up);
                }else if(anim==1){
                    transaction.setCustomAnimations(R.anim.slide_in_down,R.anim.slide_out_down);
                }
                transaction.replace(R.id.frmMainBox,quizFragment);
                transaction.commit();
                break;
            case 3:
                InfoFragment infoFragment=new InfoFragment();
                if(anim==0){
                    transaction.setCustomAnimations(R.anim.slide_in_up,R.anim.slide_out_up);
                }else if(anim==1){
                    transaction.setCustomAnimations(R.anim.slide_in_down,R.anim.slide_out_down);
                }
                transaction.replace(R.id.frmMainBox,infoFragment);
                transaction.commit();
                break;
        }
    }

    private void defaultPageSetting(){
        callFragment(FRAGMENT_MAIN,-1);
    }

    private View.OnClickListener titleBarListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ibtnTitleTopIcon:
                case R.id.ivTitleTopImage:
                case R.id.tvTitleTopText:
                    if((--pageStat)!=0){
                        callFragment(pageStat,0);
                        pageSetText();

                    }else{
                        pageStat=3;
                        callFragment(pageStat,0);
                        pageSetText();
                    }

                    break;
                case R.id.ibtnTitleBottomIcon:
                case R.id.ivTitleBottomImage:
                case R.id.tvTitleBottomText:
                    if((++pageStat)!=4){
                        callFragment(pageStat,1);
                        pageSetText();
                    }else{
                        pageStat=1;
                        callFragment(pageStat,1);
                        pageSetText();
                    }
                    break;


            }
        }
    };

    private void pageSetText(){
        switch (pageStat){
            case 1:
                tvTitleTopText.setText("영민정음");
                tvTitleBottomText.setText("퀴즈풀기");
                break;
            case 2:
                tvTitleTopText.setText("발음공부");
                tvTitleBottomText.setText("설정");
                break;
            case 3:
                tvTitleTopText.setText("퀴즈풀기");
                tvTitleBottomText.setText("발음공부");
                break;
        }
    }

}
