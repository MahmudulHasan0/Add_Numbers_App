package com.hasan.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hasan.addnumbersapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //CODE:
        Button addBtn = (Button) findViewById(R.id.addBtn);
        /*Code 1^: creating a variable within the {OnCreate} method/function that is of type {Button} and we are naming it {addBtn}
         * Using [findViewById()] to search through my resources for an ID called "addbtn". That is going to give us a result
         * Then we will cast that result at a Button [(Button)]. to store it as a reference called {addBtn) */
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //all code that happens when i click button goes here:
                // after clicking the buttons i need to get the numbers in the two boxes and then display it in the results.
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);     //will an EditText by an id called firstNumEditText
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);         //like the EditText, we will find a TextView object using its resource ID called resultTextView
                int num1 = Integer.parseInt(firstNumEditText.getText().toString() );            //getting numbers from the boxes. Need to turn the integer into string
                int num2 = Integer.parseInt(secondNumEditText.getText().toString() );
                int result = num1+num2;
                resultTextView.setText(result + ""); //pritn the results into the text view box
            }
        });
        /*Code 2^: making it so that after clicking the button. it takes in the numbers in the box and displays them in the results box.
         * Whenever i click the button do this. It now knows that "addBtn" it. It references it to that button in the layouts file.
         * setting an (onCLick) listener
         * [ addBtn.setOnClickListener(new...) ] typing the new auto completes the function */



    }
}
