package com.example.akarumbi.myintranetapps.fragmentnavdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import com.example.akarumbi.myintranetapps.R;


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
        return inflater.inflate(R.layout.timesheet_fragment, container, false);
    }
//
}
