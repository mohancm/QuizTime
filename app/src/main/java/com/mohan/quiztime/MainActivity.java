package com.mohan.quiztime;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox qz1Option1, qz1Option2, qz1Option3, qz1Option4;
    private RadioGroup radioGroup2, radioGroup3;
    private EditText q4Answer, q5Answer;
    private Button mSubmit;
    private RadioButton radioButton;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qz1Option1 = findViewById(R.id.checkBox1);
        qz1Option2 = findViewById(R.id.checkBox2);
        qz1Option3 = findViewById(R.id.checkBox3);
        qz1Option4 = findViewById(R.id.checkBox4);

        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);

        q4Answer = findViewById(R.id.editTextAnswer4);
        q5Answer = findViewById(R.id.editTextAnswer5);
        mSubmit = findViewById(R.id.submit_button);
        mSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        checkQuestion1();
        checkQuestion2();
        checkQuestion3();
        checkQuestion4();
        checkQuestion5();
        Toast.makeText(MainActivity.this, "" + getString(R.string.score) + " " + score + " " + getString(R.string.outOf), Toast.LENGTH_LONG).show();
        score = 0;
    }

    private void checkQuestion5() {
        String answer = q5Answer.getText().toString().trim().toLowerCase();
        if (!answer.equals("")) {
            if (getString(R.string.q5Answer).trim().toLowerCase().equals(answer)) {
                q5Answer.setTextColor(getResources().getColor(R.color.white));
                score++;
            } else {
                q5Answer.setTextColor(getResources().getColor(R.color.red));
            }
        }

    }

    private void checkQuestion4() {
        String answer = q4Answer.getText().toString().trim().toLowerCase();
        if (!answer.equals("")) {
            if (getString(R.string.q4Answer).trim().toLowerCase().equals(answer)) {
                q4Answer.setTextColor(getResources().getColor(R.color.white));
                score++;
            } else {
                q4Answer.setTextColor(getResources().getColor(R.color.red));
            }
        }
    }

    private void checkQuestion3() {
        int selectedID2 = radioGroup3.getCheckedRadioButtonId();
        int rightAnswer = Integer.parseInt(getString(R.string.q3Answer));
        RadioButton r1, r2, r3, r4;
        r1 = findViewById(R.id.radioGroup3Option1);
        r2 = findViewById(R.id.radioGroup3Option2);
        r3 = findViewById(R.id.radioGroup3Option3);
        r4 = findViewById(R.id.radioGroup3Option4);
        //set color for right answer
        switch (rightAnswer) {
            case 1:
                r1.setTextColor(getResources().getColor(R.color.white));
                break;
            case 2:
                r2.setTextColor(getResources().getColor(R.color.white));
                break;
            case 3:
                r3.setTextColor(getResources().getColor(R.color.white));
                break;
            case 4:
                r4.setTextColor(getResources().getColor(R.color.white));
                break;
            default:
        }
        // find the radiobutton by returned id

        if (selectedID2 != -1) {
            radioButton = findViewById(selectedID2);
            switch (selectedID2) {
                case R.id.radioGroup3Option1:
                    if (rightAnswer == Integer.parseInt(getString(R.string.q1Answer))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));


                    break;
                case R.id.radioGroup3Option2:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option2))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));

                    break;
                case R.id.radioGroup3Option3:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option3))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));

                    break;
                case R.id.radioGroup3Option4:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option4))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));

                    break;
                default:

            }
        }


    }

    private void checkQuestion2() {
        int selectedID2 = radioGroup2.getCheckedRadioButtonId();
        int rightAnswer = Integer.parseInt(getString(R.string.q2Answer));
        RadioButton r1, r2, r3, r4;
        r1 = findViewById(R.id.radioGroup2Option1);
        r2 = findViewById(R.id.radioGroup2Option2);
        r3 = findViewById(R.id.radioGroup2Option3);
        r4 = findViewById(R.id.radioGroup2Option4);
        //set color for right answer
        switch (rightAnswer) {
            case 1:
                r1.setTextColor(getResources().getColor(R.color.white));
                break;
            case 2:
                r2.setTextColor(getResources().getColor(R.color.white));
                break;
            case 3:
                r3.setTextColor(getResources().getColor(R.color.white));
                break;
            case 4:
                r4.setTextColor(getResources().getColor(R.color.white));
                break;
            default:

        }
        // find the radiobutton by returned id

        if (selectedID2 != -1) {
            radioButton = findViewById(selectedID2);
            switch (selectedID2) {
                case R.id.radioGroup2Option1:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option1))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
                    break;
                case R.id.radioGroup2Option2:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option2))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
                    break;
                case R.id.radioGroup2Option3:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option3))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
                    break;
                case R.id.radioGroup2Option4:
                    if (rightAnswer == Integer.parseInt(getString(R.string.option4))) {
                        score++;
                        radioButton.setTextColor(getResources().getColor(R.color.white));
                    } else
                        radioButton.setTextColor(getResources().getColor(R.color.red));
                    break;
                default:

            }
        }

    }

    private void checkQuestion1() {
        int rightAnswer = Integer.parseInt(getString(R.string.q1Answer));

        switch (rightAnswer) {
            case 1:
                qz1Option1.setTextColor(getResources().getColor(R.color.white));
                if (qz1Option1.isChecked() && !qz1Option2.isChecked() && !qz1Option3.isChecked() && !qz1Option4.isChecked()) {
                    score++;
                }
                if (qz1Option2.isChecked()) {
                    qz1Option2.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option3.isChecked()) {
                    qz1Option3.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option4.isChecked()) {
                    qz1Option4.setTextColor(getResources().getColor(R.color.red));
                }

                break;
            case 2:
                qz1Option2.setTextColor(getResources().getColor(R.color.white));
                if (!qz1Option1.isChecked() && qz1Option2.isChecked() && !qz1Option3.isChecked() && !qz1Option4.isChecked()) {
                    score++;

                }
                if (qz1Option1.isChecked()) {
                    qz1Option1.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option3.isChecked()) {
                    qz1Option3.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option4.isChecked()) {
                    qz1Option4.setTextColor(getResources().getColor(R.color.red));
                }

                break;
            case 3:
                qz1Option3.setTextColor(getResources().getColor(R.color.white));
                if (!qz1Option1.isChecked() && !qz1Option2.isChecked() && qz1Option3.isChecked() && !qz1Option4.isChecked()) {
                    score++;

                }
                if (qz1Option1.isChecked()) {
                    qz1Option1.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option2.isChecked()) {
                    qz1Option2.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option4.isChecked()) {
                    qz1Option4.setTextColor(getResources().getColor(R.color.red));
                }
                break;
            case 4:
                qz1Option4.setTextColor(getResources().getColor(R.color.white));
                if (!qz1Option1.isChecked() && !qz1Option2.isChecked() && !qz1Option3.isChecked() && qz1Option4.isChecked()) {
                    score++;
                }
                if (qz1Option1.isChecked()) {
                    qz1Option1.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option2.isChecked()) {
                    qz1Option2.setTextColor(getResources().getColor(R.color.red));
                }
                if (qz1Option3.isChecked()) {
                    qz1Option3.setTextColor(getResources().getColor(R.color.red));
                }
                break;
            default:

        }

    }
}
