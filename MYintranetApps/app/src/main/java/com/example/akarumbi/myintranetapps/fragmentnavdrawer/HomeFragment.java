package com.example.akarumbi.myintranetapps.fragmentnavdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.akarumbi.myintranetapps.activity.Pop;
import com.example.akarumbi.myintranetapps.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);

        Button btnstaffattandance = (Button) rootView.findViewById(R.id.button2);
        btnstaffattandance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Pop.class));
            }
        });

        Button btnprofile = (Button) rootView.findViewById(R.id.btn_profile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileFragment profileFragment = new ProfileFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.frame, profileFragment,profileFragment.getTag()).commit();
            }
        });

        Button btnmytimesheet = (Button) rootView.findViewById(R.id.btn_my_timesheet);
        btnmytimesheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimesheetFragment timesheetFragment = new TimesheetFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.frame, timesheetFragment,timesheetFragment.getTag()).commit();
            }
        });

        Button btnlms = (Button) rootView.findViewById(R.id.btn_lms);
        btnlms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LmsFragment lmsFragment = new LmsFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.frame, lmsFragment,lmsFragment.getTag()).commit();
            }
        });


        
        // Inflate the layout for this fragment
        return rootView;
    }


}
