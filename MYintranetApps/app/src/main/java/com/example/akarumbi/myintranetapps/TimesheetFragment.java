package com.example.akarumbi.myintranetapps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimesheetFragment extends Fragment {

    private static final String TAG = "TimesheetFragment";
    private CalendarView mCalendarview;
    public TimesheetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.timesheet_fragment, container, false);
    }
//
}
