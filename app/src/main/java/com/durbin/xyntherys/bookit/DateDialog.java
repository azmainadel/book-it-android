package com.durbin.xyntherys.bookit;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;


public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    EditText editText;

    public DateDialog(View view){
        editText = (EditText)view;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar calendar = Calendar.getInstance();

        int year  = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this,year,month,day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day){
        String date = day + "/" + (month+1) + "/" + year;
        editText.setText(date);
    }
}
