package com.example.akarumbi.myintranetapps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class LmsFragment extends Fragment {


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
        return rootView;
    }


}
