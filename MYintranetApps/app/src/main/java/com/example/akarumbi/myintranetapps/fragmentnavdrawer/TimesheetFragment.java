package com.example.akarumbi.myintranetapps.fragmentnavdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import com.example.akarumbi.myintranetapps.R;
import com.example.akarumbi.myintranetapps.activity.ApplyTimesheet;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimesheetFragment extends Fragment {

    private static final String TAG = "TimesheetFragment";
    private CalendarView mCalendarview;

    public TimesheetFragment() {
        // Required empty public constructor
    }
    //pakar

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.timesheet_fragment, container, false);
        View rootView = inflater.inflate(R.layout.timesheet_fragment, container, false);


        mCalendarview  = (CalendarView) rootView.findViewById(R.id.mCalendarview);
        mCalendarview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1+1) + "/" + i2 + "/" + i;
                Log.d(TAG, "onSelectedDayChange: date: mm/dd/yyyy " + date);
                Intent in = new Intent(getActivity(),ApplyTimesheet.class);
                startActivity(in);            }
        });
//        btnlms.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                LmsFragment lmsFragment = new LmsFragment();
//                FragmentManager manager = getFragmentManager();
//                manager.beginTransaction().replace(R.id.frame, lmsFragment,lmsFragment.getTag()).commit();




        // Inflate the layout for this fragment
        return rootView;

    }
//
}
