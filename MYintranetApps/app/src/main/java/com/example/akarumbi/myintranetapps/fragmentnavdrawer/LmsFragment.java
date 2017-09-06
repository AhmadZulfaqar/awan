package com.example.akarumbi.myintranetapps.fragmentnavdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.akarumbi.myintranetapps.fragmenttabbed.MyLeaveTab;
import com.example.akarumbi.myintranetapps.activity.MyLeavesNext;
import com.example.akarumbi.myintranetapps.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class  LmsFragment extends Fragment {


    public LmsFragment() {
        // Required empty public constructor
    }

    /////

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_lms_fragment, container, false);

        // Inflate the layout for this fragment
        Button btnmyleave = (Button) rootView.findViewById(R.id.button6);
        btnmyleave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),MyLeavesNext.class);
                startActivity(in);
            }
        });

        Button btnreport = (Button) rootView.findViewById(R.id.button7);
        btnreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getActivity(),MyLeaveTab.class);
                startActivity(in);
            }
        });
        return rootView;
    }


}
