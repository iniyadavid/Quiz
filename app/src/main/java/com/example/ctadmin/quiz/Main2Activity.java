package com.example.ctadmin.quiz;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by ctadmin on 18-02-2017.
 */
public class Main2Activity extends AppCompatActivity {
public int quizScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button gotoButton1 = (Button) findViewById(R.id.buttonres);
        gotoButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
             // quizScore=0;

                RadioGroup rbGroup1 = (RadioGroup) findViewById(R.id.r1);
                int selectedId1 = rbGroup1.getCheckedRadioButtonId();
                if (selectedId1 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId1);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals(getString(R.string.jb))) {
                        quizScore = quizScore + 1;
                    }
                }
                CheckBox qAnswer1 = (CheckBox) findViewById(R.id.q21);
                boolean isChecked1 = qAnswer1.isChecked();
                CheckBox qAnswer2 = (CheckBox) findViewById(R.id.q22);
                boolean isChecked2 = qAnswer2.isChecked();
                CheckBox qAnswer3 = (CheckBox) findViewById(R.id.q23);
                boolean isChecked3 = qAnswer3.isChecked();

                if (isChecked1  && !isChecked2 && !isChecked3) {
                    quizScore = quizScore + 1;
                }
                RadioGroup rbGroup3 = (RadioGroup) findViewById(R.id.r2);
                int selectedId3 = rbGroup3.getCheckedRadioButtonId();
                if (selectedId3 != -1) {
                    RadioButton selectedRadioButton3 = (RadioButton) findViewById(selectedId3);
                    String radioButtonText3 = selectedRadioButton3.getText().toString();
                    if ((radioButtonText3).equals(getString(R.string.bs))) {
                        quizScore = quizScore + 1;
                    }
                }
                EditText nameofq3 = (EditText) findViewById(R.id.e1);
                String value = nameofq3.getText().toString();
                if((value).equals(getString(R.string.sg)))
                {
                    quizScore=quizScore+1;
                }
                RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.r3);
                int selectedId2 = rbGroup2.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selectedRadioButton1 = (RadioButton) findViewById(selectedId2);
                    String radioButtonText1 = selectedRadioButton1.getText().toString();
                    if ((radioButtonText1).equals(getString(R.string.vj))) {
                        quizScore = quizScore + 1;
                    }
                }

                TextView mytextView = (TextView) findViewById(R.id.t1);
                mytextView.setText("" + quizScore);


            }
        });



        Button gotoButton = (Button) findViewById(R.id.button);
        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(gotoIntent);
            }
        });
    }
}
