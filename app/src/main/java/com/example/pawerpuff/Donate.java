package com.example.pawerpuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class Donate extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String office;

    Button btn_sumbit, btn_view;
    EditText tv_fullname, tv_email, tv_phone;
    //ListView lv;

    DatabaseD databaseDonate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        databaseDonate = new DatabaseD(getApplicationContext());

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.office, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        btn_sumbit = findViewById(R.id.btn_submit);
        btn_view = findViewById(R.id.btn_view);
        tv_fullname = findViewById(R.id.tv_fullname);
        tv_email = findViewById(R.id.tv_email);
        tv_phone = findViewById(R.id.tv_phone);
        //lv = findViewById(R.id.lv_list);

        btn_sumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = tv_fullname.getText().toString();
                tv_fullname.setText("");

                String input2 = tv_email.getText().toString();
                tv_email.setText("");

                String input3 = tv_phone.getText().toString();
                tv_phone.setText("");

                if (!input3.isEmpty() && !input2.isEmpty() && !input1.isEmpty()) {
                    ConstructorsD donateDatabase = new ConstructorsD(1, input1, input2, input3);
                    databaseDonate.AddOne(donateDatabase);
                } else {
                    Toast.makeText(Donate.this, "Field cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                ConstructorsD dbD = new ConstructorsD(-1, tv_fullname.getText().toString(), tv_email.getText().toString(), tv_phone.getText().toString());
            }
        });

        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            this.office = adapterView.getItemAtPosition(i).toString();
            Toast.makeText(adapterView.getContext(), office,Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
}