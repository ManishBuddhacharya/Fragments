package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.softwarica.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment implements View.OnClickListener {

    private EditText etNumber;
    private Button btnCalculate;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        etNumber = view.findViewById(R.id.etNumber);
        btnCalculate= view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(etNumber.getText().toString());

        if (number % 2 == 0){
            Toast.makeText(getActivity(),"The Given Number is Even", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getActivity(),"The Given Number is Odd", Toast.LENGTH_LONG).show();
        }
    }
}
