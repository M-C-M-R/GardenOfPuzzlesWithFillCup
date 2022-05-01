package com.example.gardenofpuzzles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fillCupPuzzleOne extends PuzzleActivity {

    TextView textView;

    Button fillButton;
    Button emptyButton;

    Button fiveUnitButton;
    Button threeUnitButton;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_cup_puzzle_one);
        textView = findViewById(R.id.textView);
        fillButton = findViewById(R.id.fill);
        emptyButton = findViewById(R.id.empty);
        submitButton = findViewById(R.id.submit);

        fiveUnitButton = findViewById(R.id.fiveUnitCup);
        threeUnitButton = findViewById(R.id.threeUnitCup);



        fillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Jug.setToFill();
            }
        });

        emptyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Jug.setToEmpty();
            }
        });

            // check if its puzzle one that you are doing
        Intent intent = getIntent();
        int question = intent.getIntExtra("FILLCUPINT", 0);
        if(question == 5) {
                // make array of jusgs to pass into fullCupPuzzle class
            Jug jugFive = new Jug(5, fiveUnitButton, 2);
            Jug jugThree = new Jug(3, threeUnitButton, 2);
            Jug[] jugs = {jugFive, jugThree};
            fillCupPuz puzzleFirst = new fillCupPuz(jugs, textView, 2, 5);
            textView.setText("You have a cup of 5 oz and 3 oz. Try to get 2 oz");
            puzzleFirst.makePuzzle();


            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (puzzleFirst.if_win) {
                        // TODO: make correct index
                        MainActivity.completed[5] = true;
                        Intent intentWin = new Intent(getApplicationContext(), winFillCupScreen.class);
                        startActivity(intentWin);
                    }
                }
            });
        }
        if(question == 6){

            // make array of jusgs to pass into fullCupPuzzle class
            Jug jugFive = new Jug(7, fiveUnitButton, 5);
            Jug jugThree = new Jug(4, threeUnitButton, 5);
            Jug[] jugs = {jugFive, jugThree};
            fillCupPuz puzzleFirst = new fillCupPuz(jugs, textView, 2, 6);
            textView.setText("You have a cup of 7 oz and 4 oz. Try to get 5 oz");
            puzzleFirst.makePuzzle();


            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (puzzleFirst.if_win) {
                        MainActivity.completed[6] = true;
                        Intent intentWin = new Intent(getApplicationContext(), winFillCupScreen.class);
                        startActivity(intentWin);
                    }
                }
            });
        }

        if(question == 7) {
            // make array of jusgs to pass into fullCupPuzzle class
            Jug jugFive = new Jug(7, fiveUnitButton, 6);
            Jug jugThree = new Jug(4, threeUnitButton, 6);
            Jug[] jugs = {jugFive, jugThree};
            fillCupPuz puzzleFirst = new fillCupPuz(jugs, textView, 2, 6);
            textView.setText("You have a cup of 7 oz and 4 oz. Try to get 6 oz");
            puzzleFirst.makePuzzle();


            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (puzzleFirst.if_win) {
                        // TODO: make correct index
                        MainActivity.completed[7] = true;
                        Intent intentWin = new Intent(getApplicationContext(), winFillCupScreen.class);
                        startActivity(intentWin);
                    }
                }
            });
        }
        if(question == 8) {
            // make array of jusgs to pass into fullCupPuzzle class
            Jug jugFive = new Jug(5, fiveUnitButton, 4);
            Jug jugThree = new Jug(3, threeUnitButton, 4);
            Jug[] jugs = {jugFive, jugThree};
            fillCupPuz puzzleFirst = new fillCupPuz(jugs, textView, 2, 8);
            textView.setText("You have a cup of 5 oz and 3 oz. Try to get 4 oz");
            puzzleFirst.makePuzzle();


            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (puzzleFirst.if_win) {
                        // TODO: make correct index
                        MainActivity.completed[8] = true;
                        Intent intentWin = new Intent(getApplicationContext(), winFillCupScreen.class);
                        startActivity(intentWin);
                    }
                }
            });
        }
        if(question == 9) {
            // make array of jusgs to pass into fullCupPuzzle class
            Jug jugFive = new Jug(9, fiveUnitButton, 7);
            Jug jugThree = new Jug(5, threeUnitButton, 7);
            Jug[] jugs = {jugFive, jugThree};
            fillCupPuz puzzleFirst = new fillCupPuz(jugs, textView, 2, 9);
            textView.setText("You have a cup of 9 oz and 5 oz. Try to get 7 oz");
            puzzleFirst.makePuzzle();


            submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (puzzleFirst.if_win) {
                        // TODO: make correct index
                        MainActivity.completed[9] = true;
                        Intent intentWin = new Intent(getApplicationContext(), winFillCupScreen.class);
                        startActivity(intentWin);
                    }
                }
            });
        }




    }
}