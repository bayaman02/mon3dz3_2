package com.classwork.mon3dz3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
private RecyclerView rv_cars;
ArrayList<String> carsList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_cars = requireActivity().findViewById(R.id.rv_cars);
        loadData();
        CarsAdapter adapter = new CarsAdapter(carsList);
        rv_cars.setAdapter(adapter);


    }

    private void loadData() {
        carsList.add("BMW");
        carsList.add("Mercedes");
        carsList.add("Honda");
        carsList.add("Range Rover");
        carsList.add("Bugatti");
        carsList.add("Ferrari");
        carsList.add("Lamborghini");
        carsList.add("Mazda");
        carsList.add("Porsche");
        carsList.add("Audi");
        carsList.add("Kamaz");
        carsList.add("Tico");
        carsList.add("Lexus");
    }
}