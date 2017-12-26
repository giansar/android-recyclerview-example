package id.giansar.example;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gians on 26/12/2017.
 */

public class BloodPressureRecyclerViewAdapter extends RecyclerView.Adapter<BloodPressureRecyclerViewAdapter.BloodPressureViewHolder> {

    private List<BloodPressureModel> bloodPressures;

    public BloodPressureRecyclerViewAdapter(List<BloodPressureModel> bloodPressures) {
        this.bloodPressures = bloodPressures;
    }

    @Override
    public BloodPressureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blood_pressure_item, parent, false);
        BloodPressureViewHolder bloodPressureViewHolder = new BloodPressureViewHolder(v);
        return bloodPressureViewHolder;
    }

    @Override
    public void onBindViewHolder(BloodPressureViewHolder holder, int position) {
        BloodPressureModel bloodPressure = bloodPressures.get(position);
        holder.txv_date.setText(bloodPressure.getDate());
        holder.txv_time.setText(bloodPressure.getTime());
        holder.txv_pressure.setText(bloodPressure.getSystolic() + "/" + bloodPressure.getDiastolic());
        if (position % 2 != 1) {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#EFEFEF"));
        }
    }

    @Override
    public int getItemCount() {
        return bloodPressures.size();
    }

    public static class BloodPressureViewHolder extends RecyclerView.ViewHolder {
        public TextView txv_date;
        public TextView txv_time;
        public TextView txv_pressure;

        public BloodPressureViewHolder(View itemView) {
            super(itemView);
            txv_date = (TextView) itemView.findViewById(R.id.txv_date);
            txv_time = (TextView) itemView.findViewById(R.id.txv_time);
            txv_pressure = (TextView) itemView.findViewById(R.id.txv_pressure);
        }
    }
}
