package com.example.arafat.fragmenttoactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {


    private EditText editText1, editText2;
    private Button send;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        editText1 = view.findViewById(R.id.edit_text_1);
        editText2 = view.findViewById(R.id.edit_text_2);
        send = view.findViewById(R.id.send);
        
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String country_name = editText1.getText().toString();
                String capital = editText2.getText().toString();
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.sendInformation(country_name, capital);
            }
        });



        return view;
    }

}
