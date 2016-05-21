package com.example.jdb.hcs_spajam_rensyu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * @author jDBTISK
 * 近藤が作ります
 */
public class France_cuisine_searchActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_france_cuisine_search);

        ImageButton[] arrayImgBtn=new ImageButton[1];
        arrayImgBtn[0]=(ImageButton)findViewById(R.id.buttonTerriene);
        //画像が増えたら配列に追加してく
        for(int i=0; i<arrayImgBtn.length; i++){
            arrayImgBtn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.buttonTerriene:
                intent=new Intent(this,Terriene_cuisine_detailedActivity.class);
                startActivity(intent);
                break;
            //TODO クリックされたボタンに応じたアクティビティへ遷移
            default:
                break;
        }
    }
}
