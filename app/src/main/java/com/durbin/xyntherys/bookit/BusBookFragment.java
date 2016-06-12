package com.durbin.xyntherys.bookit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusBookFragment extends Fragment {
    Spinner spinnerFrom;
    Spinner spinnerTo;

    public BusBookFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bus_book, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        spinnerFrom = (Spinner) view.findViewById(R.id.fromPicker);
        spinnerTo = (Spinner) view.findViewById(R.id.toPicker);

        ArrayAdapter<CharSequence> sourceList = ArrayAdapter.createFromResource(getActivity(), R.array.fromNames,
                android.R.layout.simple_spinner_item);
        sourceList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFrom.setAdapter(sourceList);

        ArrayAdapter<CharSequence> destinationList = ArrayAdapter.createFromResource(getActivity(), R.array.toNames,
                android.R.layout.simple_spinner_item);
        destinationList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTo.setAdapter(destinationList);

        super.onViewCreated(view, savedInstanceState);
    }
}
