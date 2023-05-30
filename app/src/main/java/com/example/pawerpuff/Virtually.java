package com.example.pawerpuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class Virtually extends AppCompatActivity {

    Button btn_sumbit, btn_view;
    EditText tv_fullname, tv_address, tv_email, tv_phone;
    Switch switch1;
    //ListView lv;

    private DatabaseV databaseV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtually);

        databaseV = new DatabaseV(getApplicationContext());

        btn_sumbit = findViewById(R.id.btn_submit);
        btn_view = findViewById(R.id.btn_view);
        tv_fullname = findViewById(R.id.tv_fullname);
        tv_address = findViewById(R.id.tv_address);
        tv_email = findViewById(R.id.tv_email);
        tv_phone = findViewById(R.id.tv_phone);
        switch1 = findViewById(R.id.switch1);
        //lv = findViewById(R.id.lv_list);

        btn_sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = tv_fullname.getText().toString();
                tv_fullname.setText("");

                String input2 = tv_address.getText().toString();
                tv_address.setText("");

                String input3 = tv_email.getText().toString();
                tv_email.setText("");

                String input4 = tv_phone.getText().toString();
                tv_phone.setText("");

                if (!input4.isEmpty() && !input3.isEmpty() && !input2.isEmpty() && !input1.isEmpty()) {
                    ConstructorsV virtualDatabase = new ConstructorsV(1, input1, input2, input3, input4, false);
                    databaseV.AddOne(virtualDatabase);
                }else{
                    Toast.makeText(Virtually.this, "Field cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                ConstructorsV dbV = new ConstructorsV(-1, tv_fullname.getText().toString(), tv_email.getText().toString(), tv_address.getText().toString(), tv_phone.getText().toString(), switch1.isChecked());

            }
        });

        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}