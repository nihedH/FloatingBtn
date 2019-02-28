package com.example.nihedhamed.flotbtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.nihedhamed.customflottingbutton.FloatingActionButton;
import com.example.nihedhamed.customflottingbutton.FloatingActionMenu;
import com.example.nihedhamed.customflottingbutton.SubActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton my_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_btn = findViewById(R.id.my_btn);
        my_btn.setImageBackground(getResources().getDrawable(R.drawable.round_btn));

        SubActionButton.Builder subButtons = new SubActionButton.Builder(this)
                .setLayoutParams(this.getResources().getDimensionPixelSize(R.dimen.sub_action_button_width)
                        ,this.getResources().getDimensionPixelSize(R.dimen.sub_action_button_width))
                .setTheme(2); //THEME_LIGHTER = 2

        CustomAmountView viewBtn1 = new CustomAmountView(this);
        viewBtn1.changeTextAmount1();
        CustomAmountView viewBtn2 = new CustomAmountView(this);
        viewBtn2.changeTextAmount3();
        CustomAmountView viewBtn3 = new CustomAmountView(this);
        viewBtn3.changeTextAmount5();
        CustomAmountView viewBtn4 = new CustomAmountView(this);
        viewBtn4.changeTextAmount10();

        SubActionButton btn10dt = subButtons.setContentView(viewBtn4).build();
        SubActionButton btn5dt = subButtons.setContentView(viewBtn3).build();
        SubActionButton btn3dt = subButtons.setContentView(viewBtn2).build();
        SubActionButton btn1dt = subButtons.setContentView(viewBtn1).build();

        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .setStartAngle(90) //angle in degrees
                .setEndAngle(270)
                .setRadius(200)  //Distance of menu items from action button
                .addSubActionView(btn10dt)
                .addSubActionView(btn5dt)
                .addSubActionView(btn3dt)
                .addSubActionView(btn1dt)
                .attachTo(my_btn)
                .build();
        btn1dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "1 dt", Toast.LENGTH_LONG).show();
            }
        });
        btn3dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "3 dt", Toast.LENGTH_LONG).show();
            }
        });
        btn5dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "5 dt", Toast.LENGTH_LONG).show();
            }
        });
        btn10dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "10 dt", Toast.LENGTH_LONG).show();
            }
        });
    }
}
