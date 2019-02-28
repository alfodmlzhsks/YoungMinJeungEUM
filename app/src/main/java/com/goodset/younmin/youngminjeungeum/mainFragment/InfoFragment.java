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

import com.goodset.younmin.youngminjeungeum.AppInfoActivity;
import com.goodset.younmin.youngminjeungeum.OpenLicenseActivity;
import com.goodset.younmin.youngminjeungeum.R;

public class InfoFragment extends Fragment {

    private ViewGroup root;

    private ImageView ivInfoBackground;
    private TextView tvInfoText;
    private ImageView ivLicenseBackground;
    private TextView tvLicenseText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root=(ViewGroup)inflater.inflate(R.layout.fragment_info,container,false);

        initView();
        initInstance();
        eventListener();

        return root;
    }

    private void initView(){
        ivInfoBackground=root.findViewById(R.id.ivInfoBackground);
        tvInfoText=root.findViewById(R.id.tvInfoText);
        ivLicenseBackground=root.findViewById(R.id.ivLicenseBackground);
        tvLicenseText=root.findViewById(R.id.tvLicenseText);


    }

    private void initInstance(){


    }

    private void eventListener(){
        ivInfoBackground.setOnClickListener(iconListener);
        tvInfoText.setOnClickListener(iconListener);
        ivLicenseBackground.setOnClickListener(iconListener);
        tvLicenseText.setOnClickListener(iconListener);

    }

    private View.OnClickListener iconListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ivInfoBackground:
                case R.id.tvInfoText:
                    Intent infoIntent=new Intent(getActivity(), AppInfoActivity.class);
                    startActivity(infoIntent);
                    break;
                case R.id.ivLicenseBackground:
                case R.id.tvLicenseText:
                    Intent openLicenseIntent=new Intent(getActivity(), OpenLicenseActivity.class);
                    startActivity(openLicenseIntent);
                    break;
            }
        }
    };
}
