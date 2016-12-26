package com.example.dong.devpro_viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
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
    private ArrayList<CaroObject> arr_sol = new ArrayList<>();
    private CaroObject caroObject;

    public GameFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        final int identify = random();
//        caroObject.setIdent(identify);
//
//        btn1 = (Button)getView().findViewById(R.id.btn_1);
//        btn2 = (Button)getView().findViewById(R.id.btn_2);
//        btn3 = (Button)getView().findViewById(R.id.btn_3);
//        btn4 = (Button)getView().findViewById(R.id.btn_4);
//        btn5 = (Button)getView().findViewById(R.id.btn_5);
//        btn6 = (Button)getView().findViewById(R.id.btn_6);
//        btn7 = (Button)getView().findViewById(R.id.btn_7);
//        btn8 = (Button)getView().findViewById(R.id.btn_8);
//        btn9 = (Button)getView().findViewById(R.id.btn_9);
//
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                caroObject.setIdent(identify);
//                caroObject.setLocate(1);
//                arr_sol.add(caroObject);
//                String test = String.valueOf(arr_sol.get(0).getIdent()) + String.valueOf(arr_sol.get(0).getLocate());
//                btn1.setText("x");
//                Toast.makeText(getContext(), "1", Toast.LENGTH_SHORT).show();
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                caroObject.setIdent(identify);
//                caroObject.setLocate(2);
//                arr_sol.add(caroObject);
//                btn2.setText("x");
//                Toast.makeText(getContext(), "2", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(3);
//                arr_sol.add(caroObject);
//                btn3.setText("x");
//                Toast.makeText(getContext(), "3", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(4);
//                arr_sol.add(caroObject);
//                btn4.setText("x");
//                Toast.makeText(getContext(), "4", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(5);
//                arr_sol.add(caroObject);
//                btn4.setText("x");
//                Toast.makeText(getContext(), "5", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(6);
//                arr_sol.add(caroObject);
//                btn4.setText("x");
//                Toast.makeText(getContext(), "6", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(7);
//                arr_sol.add(caroObject);
//                btn4.setText("x");
//                Toast.makeText(getContext(), "7", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(8);
//                arr_sol.add(caroObject);
//                btn4.setText("x");
//                Toast.makeText(getContext(), "8", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        btn9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                caroObject.setLocate(9);
//                arr_sol.add(caroObject);
//                btn4.setText("x");
//                Toast.makeText(getContext(), "9", Toast.LENGTH_SHORT).show();
//
//            }
//        });
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    private final int random(){
        Random generator = new Random();
        int result = generator.nextInt(200 - 5) + 5;
        return result;
    }
}
