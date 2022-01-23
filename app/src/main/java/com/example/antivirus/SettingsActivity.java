package com.example.antivirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        RadioButton hourlyButton = (RadioButton)findViewById(R.id.hourly_option_button);
        RadioButton dailyButton = (RadioButton)findViewById(R.id.daily_option_button);
        RadioButton weeklyButton = (RadioButton)findViewById(R.id.weekly_option_button);
        RadioButton monthlyButton = (RadioButton)findViewById(R.id.monthly_option_button);

        CheckBox scanEnabledCheckBox = (CheckBox)findViewById(R.id.fast_scan_enable_checkbox);
        scanEnabledCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                // disable radio group if fast scan disabled
                hourlyButton.setEnabled(isChecked);
                dailyButton.setEnabled(isChecked);
                weeklyButton.setEnabled(isChecked);
                monthlyButton.setEnabled(isChecked);
            }
        });
    }
}