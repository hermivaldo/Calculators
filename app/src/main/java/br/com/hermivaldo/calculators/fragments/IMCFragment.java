package br.com.hermivaldo.calculators.fragments;


import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

import br.com.hermivaldo.calculators.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class IMCFragment extends Fragment {

    @BindView(R.id.from_peso)
    TextInputLayout tiPeso;

    @BindView(R.id.from_altura)
    TextInputLayout tiAltura;
    public IMCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_imc, container, false) ;
        ButterKnife.bind(this, myView);
        return myView;
    }


    @OnClick(R.id.btCalc)
    public void calcularIMC(View v){

        Long altura = Long.parseLong(this.obtemTexto(tiAltura));
        Long peso = Long.parseLong(this.obtemTexto(tiPeso));

        Long IMC = peso / (altura * altura) ;

    }

    private String obtemTexto(TextInputLayout textInputLayout){
        return textInputLayout.getEditText().getText().toString();
    }
}
