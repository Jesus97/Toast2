package com.iesvirgendelcarmen.dam.toast2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Toast01 extends AppCompatActivity {
TextView texto1;
Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast01);

        texto1 = (TextView) findViewById(R.id.textView1);
        boton1 = (Button) findViewById(R.id.boton1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast,(ViewGroup) findViewById(R.id.layout));
                toast.setView(layout);
                toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_SHORT);
                TextView mensaje = (TextView) layout.findViewById(R.id.textoLL);
                mensaje.setText("NOTIFIQUEISION");
                toast.show();
            }
        });
    }
}
