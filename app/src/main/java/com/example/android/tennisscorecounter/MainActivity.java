package com.example.android.tennisscorecounter;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String playerA = "Simona Halep";
    String playerB = "Serena Williams";
    String message1 = "Match started";
    String message2 = "Point won by " + playerA;
    String message3 = "Point won by " + playerB;
    String message4 = "Game won by " + playerA;
    String message5 = "Game won by " + playerB;
    String message6 = "Game and set won by " + playerA;
    String message7 = "Game and set won by " + playerB;
    String message8 = "Game, set and match.\n Winner: " + playerA;
    String message9 = "Game, set and match.\n Winner: " + playerB;
    String message10 = "Advantage for " + playerA;
    String message11 = "Advantage for " + playerB;
    String message12 = "Deuce";
    String tiebreakSet1 = "No tiebreak in Set1";
    String tiebreakSet2 = "No tiebreak in Set2";

    int pointsPlayerA = 0;
    int pointsPlayerB = 0;
    int firstSetPlayerA = 0;
    int secondSetPlayerA = 0;
    int thirdSetPlayerA = 0;
    int firstSetPlayerB = 0;
    int secondSetPlayerB = 0;
    int thirdSetPlayerB = 0;
    int currentSet = 1;
    int advantage = 0;
    int tiebreak = 0;
    int matchFinished = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Point won by Player A.
     */
    public void addPointForPlayerA(View view) {
if(matchFinished==0) {
    if(currentSet==1) {
        if(tiebreak==0) {
            if(firstSetPlayerA<5 | (firstSetPlayerA==5 & firstSetPlayerB==5)) {
        switch (pointsPlayerA) {
        case 40:
            if(pointsPlayerB<40) {
                pointsPlayerA = 0;
                pointsPlayerB = 0;
                displayPointsForPlayerA(pointsPlayerA);
                displayPointsForPlayerB(pointsPlayerB);
                firstSetPlayerA = firstSetPlayerA + 1;
                displaySet1ForPlayerA(firstSetPlayerA);
                displayMessage(message4);
                }
            else if(advantage==0) {
                    advantage = 1;
                    displayMessage(message10);
                    }
                    else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                            }
                            else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    firstSetPlayerA=firstSetPlayerA+1;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet1ForPlayerA(firstSetPlayerA);
                                    displayMessage(message4);

                                }
            break;
            case 0:
                pointsPlayerA = 15;
                displayPointsForPlayerA(pointsPlayerA);
                displayMessage(message2);
                break;
            case 15:
                pointsPlayerA = 30;
                displayPointsForPlayerA(pointsPlayerA);
                displayMessage(message2);
                break;
            case 30:
                pointsPlayerA = 40;
                displayPointsForPlayerA(pointsPlayerA);
                displayMessage(message2);
                break;
    }}
        else if(firstSetPlayerB==6) {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            firstSetPlayerA = firstSetPlayerA+1;
                            tiebreak = 1;
                            displaySet1ForPlayerA(firstSetPlayerA);
                            displayMessage(message4);
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            firstSetPlayerA=firstSetPlayerA+1;
                            tiebreak = 1;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet1ForPlayerA(firstSetPlayerA);
                            displayMessage(message4);

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }
            }
            else {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            firstSetPlayerA = firstSetPlayerA+1;
                            currentSet=2;
                            displaySet2ForPlayerA(0);
                            displaySet2ForPlayerB(0);
                            tiebreak=0;
                            displaySet1ForPlayerA(firstSetPlayerA);
                            displayMessage(message6);
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            firstSetPlayerA=firstSetPlayerA+1;
                            currentSet=2;
                            displaySet2ForPlayerA(0);
                            displaySet2ForPlayerB(0);
                            tiebreak=0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet1ForPlayerA(firstSetPlayerA);
                            displayMessage(message6);

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }
            }

        }
    else if(pointsPlayerA<6) {
            pointsPlayerA = pointsPlayerA + 1;
            displayPointsForPlayerA(pointsPlayerA);
            displayMessage(message2);
        }
else if(pointsPlayerA>pointsPlayerB) {
            pointsPlayerA = pointsPlayerA+1;
            tiebreakSet1 = "Tiebreak Set1: "+pointsPlayerA+" - "+pointsPlayerB;
            pointsPlayerA=0;
            pointsPlayerB=0;
            firstSetPlayerA=7;
            currentSet=2;
            displaySet2ForPlayerA(0);
            displaySet2ForPlayerB(0);
            tiebreak=0;
            displayPointsForPlayerA(pointsPlayerA);
            displayPointsForPlayerB(pointsPlayerB);
            displaySet1ForPlayerA(firstSetPlayerA);
            displayMessage(message6);
            displayTiebreakSet1(tiebreakSet1);
        }
        else {
            pointsPlayerA=pointsPlayerA+1;
            displayPointsForPlayerA(pointsPlayerA);
            displayMessage(message2);
        }
    }
    else     if(currentSet==2) {
        if(tiebreak==0) {
            if(secondSetPlayerA<5 | (secondSetPlayerA==5 & secondSetPlayerB==5)) {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            secondSetPlayerA = secondSetPlayerA + 1;
                            displaySet2ForPlayerA(secondSetPlayerA);
                            displayMessage(message4);
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            secondSetPlayerA=secondSetPlayerA+1;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet2ForPlayerA(secondSetPlayerA);
                            displayMessage(message4);

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }}
            else if(secondSetPlayerB==6) {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            secondSetPlayerA = secondSetPlayerA+1;
                            tiebreak = 1;
                            displaySet2ForPlayerA(secondSetPlayerA);
                            displayMessage(message4);
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            secondSetPlayerA=secondSetPlayerA+1;
                            tiebreak = 1;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet2ForPlayerA(secondSetPlayerA);
                            displayMessage(message4);

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }
            }
            else {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            secondSetPlayerA = secondSetPlayerA+1;
                            currentSet=3;
                            tiebreak=0;
                            displaySet2ForPlayerA(secondSetPlayerA);
                            if(firstSetPlayerA>firstSetPlayerB) {
                                displayMessage(message8);
                                matchFinished = 1;
                            }
                            else {
                                displayMessage(message6);
                                displaySet3ForPlayerA(0);
                                displaySet3ForPlayerB(0);
                            }
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            secondSetPlayerA=secondSetPlayerA+1;
                            currentSet=3;
                            tiebreak=0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet2ForPlayerA(secondSetPlayerA);
                            if(firstSetPlayerA>firstSetPlayerB) {
                                displayMessage(message8);
                                matchFinished = 1;
                            }
                            else {
                                displayMessage(message6);
                                displaySet3ForPlayerA(0);
                                displaySet3ForPlayerB(0);
                            }

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }
            }

        }
        else if(pointsPlayerA<6) {
            pointsPlayerA = pointsPlayerA + 1;
            displayPointsForPlayerA(pointsPlayerA);
            displayMessage(message2);
        }
        else if(pointsPlayerA>pointsPlayerB) {
            pointsPlayerA = pointsPlayerA+1;
            tiebreakSet2 = "Tiebreak Set2: "+pointsPlayerA+" - "+pointsPlayerB;
            pointsPlayerA=0;
            pointsPlayerB=0;
            secondSetPlayerA=7;
            tiebreak=0;
            displayTiebreakSet2(tiebreakSet2);
            displaySet2ForPlayerA(secondSetPlayerA);
            displayPointsForPlayerA(pointsPlayerA);
            displayPointsForPlayerB(pointsPlayerB);
            currentSet=3;
            if(firstSetPlayerA>firstSetPlayerB) {
                displayMessage(message8);
                matchFinished = 1;
            }
            else {
                displayMessage(message6);
                displaySet3ForPlayerA(0);
                displaySet3ForPlayerB(0);
            }

        }
        else {
            pointsPlayerA=pointsPlayerA+1;
            displayPointsForPlayerA(pointsPlayerA);
            displayMessage(message2);
        }
    }
    else     if(currentSet==3) {
            if(thirdSetPlayerA<5) {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            thirdSetPlayerA = thirdSetPlayerA + 1;
                            displaySet3ForPlayerA(thirdSetPlayerA);
                            displayMessage(message4);
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            thirdSetPlayerA=thirdSetPlayerA+1;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet3ForPlayerA(thirdSetPlayerA);
                            displayMessage(message4);

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }}
            else if(thirdSetPlayerA>thirdSetPlayerB) {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            thirdSetPlayerA = thirdSetPlayerA+1;
                            displaySet3ForPlayerA(thirdSetPlayerA);
                            displayMessage(message8);
                            matchFinished=1;
                            currentSet=4;
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            thirdSetPlayerA=thirdSetPlayerA+1;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet3ForPlayerA(thirdSetPlayerA);
                            displayMessage(message8);
                            matchFinished = 1;
                            currentSet=4;

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }
            }
            else {
                switch (pointsPlayerA) {
                    case 40:
                        if(pointsPlayerB<40) {
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            thirdSetPlayerA = thirdSetPlayerA+1;
                            displaySet3ForPlayerA(thirdSetPlayerA);
                            displayMessage(message4);
                        }
                        else if(advantage==0) {
                            advantage = 1;
                            displayMessage(message10);
                        }
                        else if(advantage==2) {
                            advantage = 0;
                            displayMessage(message12);
                        }
                        else {
                            advantage = 0;
                            pointsPlayerA = 0;
                            pointsPlayerB = 0;
                            thirdSetPlayerA=thirdSetPlayerA+1;
                            tiebreak=0;
                            displayPointsForPlayerA(pointsPlayerA);
                            displayPointsForPlayerB(pointsPlayerB);
                            displaySet3ForPlayerA(thirdSetPlayerA);
                            displayMessage(message4);

                        }
                        break;
                    case 0:
                        pointsPlayerA = 15;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 15:
                        pointsPlayerA = 30;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                    case 30:
                        pointsPlayerA = 40;
                        displayPointsForPlayerA(pointsPlayerA);
                        displayMessage(message2);
                        break;
                }
            }

    }
    }
    }

    /**
     * Point won by Player B.
     */
    public void addPointForPlayerB(View view) {
        if(matchFinished==0) {
            if(currentSet==1) {
                if(tiebreak==0) {
                    if(firstSetPlayerB<5 | (firstSetPlayerB==5 & firstSetPlayerA==5)) {
                        switch (pointsPlayerB) {
                            case 40:
                                if(pointsPlayerA<40) {
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    firstSetPlayerB = firstSetPlayerB + 1;
                                    displaySet1ForPlayerB(firstSetPlayerB);
                                    displayMessage(message5);
                                }
                                else if(advantage==0) {
                                    advantage = 2;
                                    displayMessage(message11);
                                }
                                else if(advantage==1) {
                                    advantage = 0;
                                    displayMessage(message12);
                                }
                                else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    firstSetPlayerB=firstSetPlayerB+1;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet1ForPlayerB(firstSetPlayerB);
                                    displayMessage(message5);

                                }
                                break;
                            case 0:
                                pointsPlayerB = 15;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 15:
                                pointsPlayerB = 30;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 30:
                                pointsPlayerB = 40;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                        }}
                    else if(firstSetPlayerA==6) {
                        switch (pointsPlayerB) {
                            case 40:
                                if(pointsPlayerA<40) {
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    firstSetPlayerB = firstSetPlayerB+1;
                                    tiebreak = 1;
                                    displaySet1ForPlayerB(firstSetPlayerB);
                                    displayMessage(message5);
                                }
                                else if(advantage==0) {
                                    advantage = 2;
                                    displayMessage(message11);
                                }
                                else if(advantage==1) {
                                    advantage = 0;
                                    displayMessage(message12);
                                }
                                else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    firstSetPlayerB=firstSetPlayerB+1;
                                    tiebreak = 1;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet1ForPlayerB(firstSetPlayerB);
                                    displayMessage(message5);

                                }
                                break;
                            case 0:
                                pointsPlayerB = 15;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 15:
                                pointsPlayerB = 30;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 30:
                                pointsPlayerB = 40;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                        }
                    }
                    else {
                        switch (pointsPlayerB) {
                            case 40:
                                if(pointsPlayerA<40) {
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    firstSetPlayerB = firstSetPlayerB+1;
                                    currentSet=2;
                                    displaySet2ForPlayerA(0);
                                    displaySet2ForPlayerB(0);
                                    tiebreak=0;
                                    displaySet1ForPlayerB(firstSetPlayerB);
                                    displayMessage(message7);
                                }
                                else if(advantage==0) {
                                    advantage = 2;
                                    displayMessage(message11);
                                }
                                else if(advantage==1) {
                                    advantage = 0;
                                    displayMessage(message12);
                                }
                                else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    firstSetPlayerB=firstSetPlayerB+1;
                                    currentSet=2;
                                    displaySet2ForPlayerA(0);
                                    displaySet2ForPlayerB(0);
                                    tiebreak=0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet1ForPlayerB(firstSetPlayerB);
                                    displayMessage(message7);

                                }
                                break;
                            case 0:
                                pointsPlayerB = 15;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 15:
                                pointsPlayerB = 30;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 30:
                                pointsPlayerB = 40;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                        }
                    }

                }
                else if(pointsPlayerB<6) {
                    pointsPlayerB = pointsPlayerB + 1;
                    displayPointsForPlayerB(pointsPlayerB);
                    displayMessage(message3);
                }
                else if(pointsPlayerB>pointsPlayerA) {
                    pointsPlayerB = pointsPlayerB+1;
                    tiebreakSet1 = "Tiebreak Set1: "+pointsPlayerA+" - "+pointsPlayerB;
                    pointsPlayerA=0;
                    pointsPlayerB=0;
                    firstSetPlayerB=7;
                    currentSet=2;
                    displaySet2ForPlayerA(0);
                    displaySet2ForPlayerB(0);
                    tiebreak=0;
                    displayPointsForPlayerA(pointsPlayerA);
                    displayPointsForPlayerB(pointsPlayerB);
                    displaySet1ForPlayerB(firstSetPlayerB);
                    displayMessage(message7);
                    displayTiebreakSet1(tiebreakSet1);
                }
                else {
                    pointsPlayerB=pointsPlayerB+1;
                    displayPointsForPlayerB(pointsPlayerB);
                    displayMessage(message3);
                }
            }
            else     if(currentSet==2) {
                if(tiebreak==0) {
                    if(secondSetPlayerB<5 | (secondSetPlayerB==5 & secondSetPlayerA==5)) {
                        switch (pointsPlayerB) {
                            case 40:
                                if(pointsPlayerA<40) {
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    secondSetPlayerB = secondSetPlayerB + 1;
                                    displaySet2ForPlayerB(secondSetPlayerB);
                                    displayMessage(message5);
                                }
                                else if(advantage==0) {
                                    advantage = 2;
                                    displayMessage(message11);
                                }
                                else if(advantage==1) {
                                    advantage = 0;
                                    displayMessage(message12);
                                }
                                else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    secondSetPlayerB=secondSetPlayerB+1;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet2ForPlayerB(secondSetPlayerB);
                                    displayMessage(message5);

                                }
                                break;
                            case 0:
                                pointsPlayerB = 15;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 15:
                                pointsPlayerB = 30;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 30:
                                pointsPlayerB = 40;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                        }}
                    else if(secondSetPlayerA==6) {
                        switch (pointsPlayerB) {
                            case 40:
                                if(pointsPlayerA<40) {
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    secondSetPlayerB = secondSetPlayerB+1;
                                    tiebreak = 1;
                                    displaySet2ForPlayerB(secondSetPlayerB);
                                    displayMessage(message5);
                                }
                                else if(advantage==0) {
                                    advantage = 2;
                                    displayMessage(message11);
                                }
                                else if(advantage==1) {
                                    advantage = 0;
                                    displayMessage(message12);
                                }
                                else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    secondSetPlayerB=secondSetPlayerB+1;
                                    tiebreak = 1;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet2ForPlayerB(secondSetPlayerB);
                                    displayMessage(message5);

                                }
                                break;
                            case 0:
                                pointsPlayerB = 15;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 15:
                                pointsPlayerB = 30;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 30:
                                pointsPlayerB = 40;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                        }
                    }
                    else {
                        switch (pointsPlayerB) {
                            case 40:
                                if(pointsPlayerA<40) {
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    secondSetPlayerB = secondSetPlayerB+1;
                                    currentSet=3;
                                    tiebreak=0;
                                    displaySet2ForPlayerB(secondSetPlayerB);
                                    if(firstSetPlayerB>firstSetPlayerA) {
                                        displayMessage(message9);
                                        matchFinished = 1;
                                    }
                                    else {
                                        displayMessage(message7);
                                        displaySet3ForPlayerA(0);
                                        displaySet3ForPlayerB(0);
                                    }
                                }
                                else if(advantage==0) {
                                    advantage = 2;
                                    displayMessage(message11);
                                }
                                else if(advantage==1) {
                                    advantage = 0;
                                    displayMessage(message12);
                                }
                                else {
                                    advantage = 0;
                                    pointsPlayerA = 0;
                                    pointsPlayerB = 0;
                                    secondSetPlayerB=secondSetPlayerB+1;
                                    currentSet=3;
                                    tiebreak=0;
                                    displayPointsForPlayerA(pointsPlayerA);
                                    displayPointsForPlayerB(pointsPlayerB);
                                    displaySet2ForPlayerB(secondSetPlayerB);
                                    if(firstSetPlayerB>firstSetPlayerA) {
                                        displayMessage(message9);
                                        matchFinished = 1;
                                    }
                                    else {
                                        displayMessage(message7);
                                        displaySet3ForPlayerA(0);
                                        displaySet3ForPlayerB(0);
                                    }

                                }
                                break;
                            case 0:
                                pointsPlayerB = 15;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 15:
                                pointsPlayerB = 30;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                            case 30:
                                pointsPlayerB = 40;
                                displayPointsForPlayerB(pointsPlayerB);
                                displayMessage(message3);
                                break;
                        }
                    }

                }
                else if(pointsPlayerB<6) {
                    pointsPlayerB = pointsPlayerB + 1;
                    displayPointsForPlayerB(pointsPlayerB);
                    displayMessage(message3);
                }
                else if(pointsPlayerB>pointsPlayerA) {
                    pointsPlayerB = pointsPlayerB+1;
                    tiebreakSet2 = "Tiebreak Set2: "+pointsPlayerA+" - "+pointsPlayerB;
                    pointsPlayerA=0;
                    pointsPlayerB=0;
                    secondSetPlayerB=7;
                    tiebreak=0;
                    displayTiebreakSet2(tiebreakSet2);
                    displaySet2ForPlayerB(secondSetPlayerB);
                    displayPointsForPlayerA(pointsPlayerA);
                    displayPointsForPlayerB(pointsPlayerB);
                    currentSet=3;
                    if(firstSetPlayerB>firstSetPlayerA) {
                        displayMessage(message9);
                        matchFinished = 1;
                    }
                    else {
                        displayMessage(message7);
                        displaySet3ForPlayerA(0);
                        displaySet3ForPlayerB(0);
                    }

                }
                else {
                    pointsPlayerB=pointsPlayerB+1;
                    displayPointsForPlayerB(pointsPlayerB);
                    displayMessage(message3);
                }
            }
            else     if(currentSet==3) {
                if(thirdSetPlayerB<5) {
                    switch (pointsPlayerB) {
                        case 40:
                            if(pointsPlayerA<40) {
                                pointsPlayerA = 0;
                                pointsPlayerB = 0;
                                displayPointsForPlayerA(pointsPlayerA);
                                displayPointsForPlayerB(pointsPlayerB);
                                thirdSetPlayerB = thirdSetPlayerB + 1;
                                displaySet3ForPlayerB(thirdSetPlayerB);
                                displayMessage(message5);
                            }
                            else if(advantage==0) {
                                advantage = 2;
                                displayMessage(message11);
                            }
                            else if(advantage==1) {
                                advantage = 0;
                                displayMessage(message12);
                            }
                            else {
                                advantage = 0;
                                pointsPlayerA = 0;
                                pointsPlayerB = 0;
                                thirdSetPlayerB=thirdSetPlayerB+1;
                                displayPointsForPlayerA(pointsPlayerA);
                                displayPointsForPlayerB(pointsPlayerB);
                                displaySet3ForPlayerB(thirdSetPlayerB);
                                displayMessage(message5);

                            }
                            break;
                        case 0:
                            pointsPlayerB = 15;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                        case 15:
                            pointsPlayerB = 30;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                        case 30:
                            pointsPlayerB = 40;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                    }}
                else if(thirdSetPlayerB>thirdSetPlayerA) {
                    switch (pointsPlayerB) {
                        case 40:
                            if(pointsPlayerA<40) {
                                pointsPlayerA = 0;
                                pointsPlayerB = 0;
                                displayPointsForPlayerA(pointsPlayerA);
                                displayPointsForPlayerB(pointsPlayerB);
                                thirdSetPlayerB = thirdSetPlayerB+1;
                                displaySet3ForPlayerB(thirdSetPlayerB);
                                displayMessage(message9);
                                matchFinished=1;
                                currentSet=4;
                            }
                            else if(advantage==0) {
                                advantage = 2;
                                displayMessage(message11);
                            }
                            else if(advantage==1) {
                                advantage = 0;
                                displayMessage(message12);
                            }
                            else {
                                advantage = 0;
                                pointsPlayerA = 0;
                                pointsPlayerB = 0;
                                thirdSetPlayerB=thirdSetPlayerB+1;
                                displayPointsForPlayerA(pointsPlayerA);
                                displayPointsForPlayerB(pointsPlayerB);
                                displaySet3ForPlayerB(thirdSetPlayerB);
                                displayMessage(message9);
                                matchFinished = 1;
                                currentSet=4;

                            }
                            break;
                        case 0:
                            pointsPlayerB = 15;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                        case 15:
                            pointsPlayerB = 30;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                        case 30:
                            pointsPlayerB = 40;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                    }
                }
                else {
                    switch (pointsPlayerB) {
                        case 40:
                            if(pointsPlayerA<40) {
                                pointsPlayerA = 0;
                                pointsPlayerB = 0;
                                displayPointsForPlayerA(pointsPlayerA);
                                displayPointsForPlayerB(pointsPlayerB);
                                thirdSetPlayerB = thirdSetPlayerB+1;
                                displaySet3ForPlayerB(thirdSetPlayerB);
                                displayMessage(message5);
                            }
                            else if(advantage==0) {
                                advantage = 2;
                                displayMessage(message11);
                            }
                            else if(advantage==1) {
                                advantage = 0;
                                displayMessage(message12);
                            }
                            else {
                                advantage = 0;
                                pointsPlayerA = 0;
                                pointsPlayerB = 0;
                                thirdSetPlayerB=thirdSetPlayerB+1;
                                tiebreak=0;
                                displayPointsForPlayerA(pointsPlayerA);
                                displayPointsForPlayerB(pointsPlayerB);
                                displaySet3ForPlayerB(thirdSetPlayerB);
                                displayMessage(message5);

                            }
                            break;
                        case 0:
                            pointsPlayerB = 15;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                        case 15:
                            pointsPlayerB = 30;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                        case 30:
                            pointsPlayerB = 40;
                            displayPointsForPlayerB(pointsPlayerB);
                            displayMessage(message3);
                            break;
                    }
                }

            }
        }
    }
    /**
     * Reset scores.
     */
    public void resetScores(View view) {
        pointsPlayerA = 0;
        pointsPlayerB = 0;
        firstSetPlayerA = 0;
        firstSetPlayerB = 0;
        secondSetPlayerA = 0;
        secondSetPlayerB = 0;
        thirdSetPlayerA = 0;
        thirdSetPlayerB = 0;
        matchFinished = 0;
        tiebreak = 0;
        currentSet = 1;
        advantage=0;
        tiebreakSet1="";
        tiebreakSet2="";
        displayPointsForPlayerA(pointsPlayerA);
        displayPointsForPlayerB(pointsPlayerB);
        displayTiebreakSet1(tiebreakSet1);
        displayTiebreakSet2(tiebreakSet2);
        displaySet1ForPlayerA(firstSetPlayerA);
        displaySet1ForPlayerB(firstSetPlayerB);
        displayMessageSet2A("");
        displayMessageSet3A("");
        displayMessageSet2B("");
        displayMessageSet3B("");
        displayMessage("Match started");
    }

    /**
     * This method displays the message during the play.
     */
    private void displayMessage(String message) {
        TextView playTextView = (TextView) findViewById(R.id.message_play);
        playTextView.setText(message);
    }

    /**
     * This method cleans Set2 for playerA after reset.
     */
    private void displayMessageSet2A(String message) {
        TextView playTextView = (TextView) findViewById(R.id.playerA_set2);
        playTextView.setText(message);
    }

    /**
     * This method cleans Set3 for playerA after reset.
     */
    private void displayMessageSet3A(String message) {
        TextView playTextView = (TextView) findViewById(R.id.playerA_set3);
        playTextView.setText(message);
    }

    /**
     * This method cleans Set2 for playerA after reset.
     */
    private void displayMessageSet2B(String message) {
        TextView playTextView = (TextView) findViewById(R.id.playerB_set2);
        playTextView.setText(message);
    }

    /**
     * This method cleans Set3 for playerA after reset.
     */
    private void displayMessageSet3B(String message) {
        TextView playTextView = (TextView) findViewById(R.id.playerB_set3);
        playTextView.setText(message);
    }

    /**
     * Displays the points for Player A.
     */
    public void displayPointsForPlayerA(int points) {
        TextView pointsView = (TextView) findViewById(R.id.playerA_current_game);
        pointsView.setText(String.valueOf(points));
    }

    /**
     * Displays the points for Player B.
     */   public void displayPointsForPlayerB(int points) {
        TextView pointsView = (TextView) findViewById(R.id.playerB_current_game);
        pointsView.setText(String.valueOf(points));

    }

    /**
     * This method displays the tiebreak in set1.
     */
    private void displayTiebreakSet1(String message) {
        TextView playTextView = (TextView) findViewById(R.id.message_tiebreak_set1);
        playTextView.setText(message);
    }

    /**
     * This method displays the tiebreak in set2.
     */
    private void displayTiebreakSet2(String message) {
        TextView playTextView = (TextView) findViewById(R.id.message_tiebreak_set2);
        playTextView.setText(message);
    }

        /**
         * Displays the nb of games in Set1 for Player A.
         */
        public void displaySet1ForPlayerA(int points) {
            TextView pointsView = (TextView) findViewById(R.id.playerA_set1);
            pointsView.setText(String.valueOf(points));
        }

        /**
         * Displays the nb of games in Set1 for Player B.
         */   public void displaySet1ForPlayerB(int points) {
            TextView pointsView = (TextView) findViewById(R.id.playerB_set1);
            pointsView.setText(String.valueOf(points));

        }
        /**
         * Displays the nb of games in Set2 for Player A.
         */
        public void displaySet2ForPlayerA(int points) {
            TextView pointsView = (TextView) findViewById(R.id.playerA_set2);
            pointsView.setText(String.valueOf(points));
        }

        /**
         * Displays the nb of games in Set2 for Player B.
         */   public void displaySet2ForPlayerB(int points) {
            TextView pointsView = (TextView) findViewById(R.id.playerB_set2);
            pointsView.setText(String.valueOf(points));

        }
        /**
         * Displays the nb of games in Set3 for Player A.
         */
        public void displaySet3ForPlayerA(int points) {
            TextView pointsView = (TextView) findViewById(R.id.playerA_set3);
            pointsView.setText(String.valueOf(points));
        }

        /**
         * Displays the nb of games in Set3 for Player B.
         */   public void displaySet3ForPlayerB(int points) {
            TextView pointsView = (TextView) findViewById(R.id.playerB_set3);
            pointsView.setText(String.valueOf(points));

        }
}
