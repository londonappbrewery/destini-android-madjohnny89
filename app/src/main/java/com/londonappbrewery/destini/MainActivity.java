package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
TextView StoryTextView ;
Button ButtonTop;
Button ButtonBottom;
int storyTextId [] = {R.string.T1_Story,R.string.T2_Story,R.string.T3_Story};
int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
StoryTextView = (TextView) findViewById(R.id.storyTextView);
ButtonTop =(Button) findViewById(R.id.buttonTop);
ButtonBottom = (Button) findViewById(R.id.buttonBottom);
StoryTextView.setText(storyTextId[0]);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
ButtonTop.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
if (mIndex==0) {
    StoryTextView.setText(storyTextId[2]);
    ButtonTop.setText(R.string.T3_Ans1);
    ButtonBottom.setText(R.string.T3_Ans2);
    mIndex=mIndex+1;
}

    else {

    t3story();



    }


    }



});



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
ButtonBottom.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (mIndex==0) {
            StoryTextView.setText(storyTextId[1]);
            ButtonTop.setText(R.string.T2_Ans1);
            ButtonBottom.setText(R.string.T2_Ans2);
            mIndex=mIndex+1;
        }
        else  {
            t2story();




        }






    }
});

    }

    public void t3story(){
        StoryTextView.setText(storyTextId[2]);
        ButtonTop.setText(R.string.T3_Ans1);
        ButtonBottom.setText(R.string.T3_Ans2);

        ButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StoryTextView.setText(R.string.T6_End);
                ButtonTop.setVisibility(View.INVISIBLE);
                ButtonBottom.setVisibility(View.INVISIBLE);

            }
        });
        ButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StoryTextView.setText(R.string.T5_End);
                ButtonTop.setVisibility(View.INVISIBLE);
                ButtonBottom.setVisibility(View.INVISIBLE);

            }
        });



    }

    public void t2story(){
        StoryTextView.setText(storyTextId[1]);
        ButtonTop.setText(R.string.T2_Ans1);
        ButtonBottom.setText(R.string.T2_Ans2);
        ButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                t3story();
            }
        });
        ButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StoryTextView.setText(R.string.T4_End);
                ButtonTop.setVisibility(View.INVISIBLE);
                ButtonBottom.setVisibility(View.INVISIBLE);

            }
        });




    }


}
