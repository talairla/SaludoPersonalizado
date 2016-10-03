package com.example.teo.saludopersonalizado;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSaludo;
    TextView lblSaludo;
    TextView lblError;
    EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);
        lblError = (TextView) findViewById(R.id.lblError);
        txtNombre = (EditText) findViewById(R.id.txtNombre);

        btnSaludo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (txtNombre.length()==0){
            lblError.setText(getString(R.string.faltaNombre));
            txtNombre.setBackgroundColor(getColor(R.color.txtInputError));
        }else{
        lblSaludo.setText(getString(R.string.hola) + txtNombre.getText()+ "!");
        }
    }
}
