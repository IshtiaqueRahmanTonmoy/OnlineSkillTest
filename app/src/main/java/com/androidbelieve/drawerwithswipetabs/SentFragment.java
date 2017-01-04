package com.androidbelieve.drawerwithswipetabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Ratan on 7/29/2015.
 */
public class SentFragment extends Fragment {

    Button startButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sent_layout, container, false);

        startButton = (Button) rootView.findViewById(R.id.startquizbutton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),QuizTakenActivity.class);
                startActivity(intent);
            }
        });
        return rootView;

    }
}
