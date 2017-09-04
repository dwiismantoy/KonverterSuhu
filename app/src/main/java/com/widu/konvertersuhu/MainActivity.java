package com.widu.konvertersuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    RadioGroup rg;
    Button submit;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.nilai);
        rg = (RadioGroup)findViewById(R.id.rbgrup);
        submit = (Button)findViewById(R.id.hitung);
        t1 = (TextView)findViewById(R.id.output);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mengambil value nama dan dioutputkan
                int equals = Integer.parseInt(input.getText().toString());

                switch (rg.getCheckedRadioButtonId()){
                    case(R.id.f):
                        double ef = ((equals*9)/5)+32;
                        t1.setText(String.valueOf(ef));
                        break;
                    case(R.id.r):
                        double er = (equals*4)/5;
                        t1.setText(String.valueOf(er));
                        break;
                    case(R.id.c):
                        double ec = equals+273;
                        t1.setText(String.valueOf(ec));
                        break;
                }
            }
        });
    }

}
