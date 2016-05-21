package com.example.jdb.hcs_spajam_rensyu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class China_cuisine_searchActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china_cuisine_search);

        final int RYORI_KAZU = 2;

        ImageButton[] arrayImgBtn=new ImageButton[RYORI_KAZU];
        arrayImgBtn[0]=(ImageButton)findViewById(R.id.buttonDac);
        arrayImgBtn[1]=(ImageButton)findViewById(R.id.buttonKani);

        for(int i=0; i<arrayImgBtn.length; i++){
            arrayImgBtn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.buttonDac:
                intent=new Intent(this,Soba_cuisine_detailedActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonKani:
                intent=new Intent(this,Soba_cuisine_detailedActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
