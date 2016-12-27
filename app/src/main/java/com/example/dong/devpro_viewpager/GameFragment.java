package com.example.dong.devpro_viewpager;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Random;

import java.util.ArrayList;


public class GameFragment extends Fragment {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private final int identifynum = random();
    private ArrayList<String> arr_sol = new ArrayList<>();

    public GameFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_game, container, false);
        // Inflate the layout for this fragment
        final int identify = identifynum;
        btn1 = (Button)view.findViewById(R.id.btn_1);
        btn2 = (Button)view.findViewById(R.id.btn_2);
        btn3 = (Button)view.findViewById(R.id.btn_3);
        btn4 = (Button)view.findViewById(R.id.btn_4);
        btn5 = (Button) view.findViewById(R.id.btn_5);
        btn6 = (Button) view.findViewById(R.id.btn_6);
        btn7 = (Button) view.findViewById(R.id.btn_7);
        btn8 = (Button) view.findViewById(R.id.btn_8);
        btn9 = (Button) view.findViewById(R.id.btn_9);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn1" + "," + identify;
                arr_sol.add(sol);
                btn1.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn2" + "," + identify;
                arr_sol.add(sol);
                btn2.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn3" + "," + identify;
                arr_sol.add(sol);
                btn3.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn4" + "," + identify;
                arr_sol.add(sol);
                btn4.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn5" + "," + identify;
                arr_sol.add(sol);
                btn5.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn6" + "," + identify;
                arr_sol.add(sol);
                btn6.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn7" + "," + identify;
                arr_sol.add(sol);
                btn7.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn8" + "," + identify;
                arr_sol.add(sol);
                btn8.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sol = "btn9" + "," + identify;
                arr_sol.add(sol);
                btn9.setText("x");
                Toast.makeText(getContext(), sol, Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }

    private final int random(){
        Random generator = new Random();
        int result = generator.nextInt(200 - 5) + 5;
        return result;
    }

    private HashMap<String, Boolean> checkSol(ArrayList<String> array, int ident){
        HashMap<String, Boolean> paint = new HashMap<>();
        if (array.size() != 0){

            for (String s : array) {
                String[] split = s.split(",");
                Boolean check = false;
                if (split[1].equals(ident)){
                    check = true;
                }

                paint.put(split[0], check);

            }
        }
        return paint;
    }


}
