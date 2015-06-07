package fi.atteheino.trackwhisperer;

import android.os.Bundle;
import android.preference.PreferenceFragment;


/**
 * Settings fragment
 */
public class PreferencesFragment extends PreferenceFragment {

    public PreferencesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }


}
