package com.example.jdb.hcs_spajam_rensyu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton[] arrayImgBtn=new ImageButton[12];
        arrayImgBtn[0]=(ImageButton)findViewById(R.id.japanImg);
        //arrayImgBtn[1]=(ImageButton)findViewById(R.id.usaImg);
        //arrayImgBtn[2]=(ImageButton)findViewById(R.id.franceImg);
        //arrayImgBtn[3]=(ImageButton)findViewById(R.id.chinaImg);
        //arrayImgBtn[4]=(ImageButton)findViewById(R.id.spainImg);
        //arrayImgBtn[5]=(ImageButton)findViewById(R.id.italyImg);
        //arrayImgBtn[6]=(ImageButton)findViewById(R.id.turkeyImg);
        //arrayImgBtn[7]=(ImageButton)findViewById(R.id.germanyImg);
        //arrayImgBtn[8]=(ImageButton)findViewById(R.id.russiaImg);
        //arrayImgBtn[9]=(ImageButton)findViewById(R.id.mexicoImg);
        //arrayImgBtn[10]=(ImageButton)findViewById(R.id.hongkongImg);
        //arrayImgBtn[11]=(ImageButton)findViewById(R.id.malaysiaImg);
        for(int i=0; i<arrayImgBtn.length; i++){
            arrayImgBtn[i].setOnClickListener(this);
            if(i==0)break;
        }
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.japanImg:
                intent=new Intent(this,Japan_cuisine_searchActivity.class);
                startActivity(intent);
                break;
            case R.id.francebutton:
                intent=new Intent(this,France_cuisine_searchActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonChina:
                intent=new Intent(this,China_cuisine_searchActivity.class);
                startActivity(intent);
                break;
            //case R.id.usaImg:
            //TODO クリックされたボタンに応じたアクティビティへ遷移
            default:
                //何もなし
                break;
        }
    }
}
