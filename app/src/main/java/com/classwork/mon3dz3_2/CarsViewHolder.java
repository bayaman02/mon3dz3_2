package com.classwork.mon3dz3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarsViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCars;
    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCars = itemView.findViewById(R.id.tv_cars);
    }
    public void onBind(String cars){
        if (cars == "Audi"){
            tvCars.setTextColor(R.color.white);
        }
        tvCars.setText(cars);
    }
}
