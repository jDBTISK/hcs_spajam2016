package com.example.jdb.hcs_spajam_rensyu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Japan_cuisine_searchActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine_search);
        final int RYORI_KAZU = 4;

        ImageButton[] arrayImgBtn=new ImageButton[RYORI_KAZU];
        arrayImgBtn[0]=(ImageButton)findViewById(R.id.buttonSoba);
        arrayImgBtn[1]=(ImageButton)findViewById(R.id.buttonSushi);
        arrayImgBtn[2]=(ImageButton)findViewById(R.id.buttonNato);
        arrayImgBtn[3]=(ImageButton)findViewById(R.id.buttonNudle);

        for(int i=0; i<arrayImgBtn.length; i++){
            arrayImgBtn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.buttonSoba:
                intent=new Intent(this,Japan_cuisine_searchActivity.class);
                startActivity(intent);
                break;
            //TODO クリックされたボタンに応じたアクティビティへ遷移
            default:
                break;
        }
    }
}
