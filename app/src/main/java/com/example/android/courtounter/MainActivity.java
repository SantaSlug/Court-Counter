package com.example.android.courtounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamA(View view) {
        int score = 3;
        scoreTeamA += score;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsTeamA(View view) {
        int score = 2;
        scoreTeamA += score;
        displayForTeamA(scoreTeamA);
    }


    public void freeThrowPointsTeamA(View view) {
        int score = 1;
        scoreTeamA += score;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointsTeamB(View view) {
        int score = 3;
        scoreTeamB += score;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsTeamB(View view) {
        int score = 2;
        scoreTeamB += score;
        displayForTeamB(scoreTeamB);
    }


    public void freeThrowPointsTeamB(View view) {
        int score = 1;
        scoreTeamB += score;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}