package com.example.manikyapavan.textfieldmaterial;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    AppCompatEditText t1,t2;
    RelativeLayout r1;
    TextInputLayout l1;
    TextInputLayout l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(AppCompatEditText)findViewById(R.id.ed1);
        t2=(AppCompatEditText)findViewById(R.id.ed2);
        l1=(TextInputLayout)findViewById(R.id.user_name);
        l2=(TextInputLayout)findViewById(R.id.enter_password);
        r1=(RelativeLayout)findViewById(R.id.layout1);
        //the main purpose of this r1.onclicklistener is whenever we need to press on focus one to get back
        // to the same position at that it will helpful
       r1.setOnClickListener(null);


        t1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(t1.getText().toString().isEmpty()){
                    //her we are just giving an error to user taht editext is empty
                    l1.setErrorEnabled(true);
                    l1.setError("please enter your username");

                }else{
                    l1.setErrorEnabled(false);

                    }
            }
        });
        t1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(t1.getText().toString().isEmpty()){
                    //her we are just giving an error to user taht editext is empty
                    l1.setErrorEnabled(true);
                    l1.setError("please enter your username");

                }else{
                    l1.setErrorEnabled(false);

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }




        });
        l2.setCounterEnabled(true);
        l2.setCounterMaxLength(20);

    }
}
