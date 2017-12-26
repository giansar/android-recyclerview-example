package id.giansar.example;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BloodPressureListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    private List<BloodPressureModel> bloodPressures = new ArrayList<>();

    public BloodPressureListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blood_pressure_list, container, false);
        mRecyclerView = (RecyclerView) v.findViewById(R.id.blood_pressure_list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        BloodPressureModel bloodPressureModel = new BloodPressureModel();
        bloodPressureModel.setDate("12 Agt 2017");
        bloodPressureModel.setTime("07:30");
        bloodPressureModel.setSystolic("120");
        bloodPressureModel.setDiastolic("80");
        bloodPressures.add(bloodPressureModel);

        bloodPressureModel = new BloodPressureModel();
        bloodPressureModel.setDate("13 Agt 2017");
        bloodPressureModel.setTime("08:30");
        bloodPressureModel.setSystolic("110");
        bloodPressureModel.setDiastolic("70");
        bloodPressures.add(bloodPressureModel);

        bloodPressureModel = new BloodPressureModel();
        bloodPressureModel.setDate("14 Agt 2017");
        bloodPressureModel.setTime("08:00");
        bloodPressureModel.setSystolic("118");
        bloodPressureModel.setDiastolic("77");
        bloodPressures.add(bloodPressureModel);

        mAdapter = new BloodPressureRecyclerViewAdapter(bloodPressures);
        mRecyclerView.setAdapter(mAdapter);
        return v;
    }

}
