package id.giansar.example;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {

    Button mEnter;

    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_welcome, container, false);
        mEnter = v.findViewById(R.id.btn_enter);
        mEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                BloodPressureListFragment bloodPressureListFragment = new BloodPressureListFragment();
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, bloodPressureListFragment).addToBackStack(null).commit();
            }
        });
        return v;
    }

}
