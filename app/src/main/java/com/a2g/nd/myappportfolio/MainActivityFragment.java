package com.a2g.nd.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button buttonPopularMovies = (Button) rootView.findViewById(R.id.main_btn_popularMovies);
        Button buttonStockHawk = (Button) rootView.findViewById(R.id.main_btn_stockHawk);
        Button buttonBuildItBigger = (Button) rootView.findViewById(R.id.main_btn_buildItBigger);
        Button buttonMakeYourAppMaterial = (Button) rootView.findViewById(R.id.main_btn_makeYourAppMaterial);
        Button buttonGoUbiquitous = (Button) rootView.findViewById(R.id.main_btn_goUbiquitous);
        Button buttonCapstone = (Button) rootView.findViewById(R.id.main_btn_capstone);

        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToastText(getString(R.string.toast_text_popularMovies));
            }
        });

        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToastText(getString(R.string.toast_text_stockHawk));
            }
        });

        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToastText(getString(R.string.toast_text_buildItBigger));
            }
        });

        buttonMakeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToastText(getString(R.string.toast_text_makeYourAppMaterial));
            }
        });

        buttonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToastText(getString(R.string.toast_text_goUbiquitous));
            }
        });

        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayToastText(getString(R.string.toast_text_capstone));
            }
        });

        return rootView;
    }

    void DisplayToastText(String s){
        Toast.makeText(getContext(), s, Toast.LENGTH_SHORT).show();
    }
}
