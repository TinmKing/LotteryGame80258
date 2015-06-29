package com.king_mac.lotterygame80258;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        Button btnLotteryResult = (Button)findViewById(R.id.btn_lottery_result);
        btnLotteryResult.setOnClickListener(this);

        Button btnTodayRecommendation = (Button)findViewById(R.id.btn_today_recommendation);
        btnTodayRecommendation.setOnClickListener(this);

        Button btnLotteryIntroduction = (Button)findViewById(R.id.btn_lottery_introduction);
        btnLotteryIntroduction.setOnClickListener(this);

        Button btnFixedNoService = (Button)findViewById(R.id.btn_fixed_no_service);
        btnFixedNoService.setOnClickListener(this);

        Button btnLotteryFund = (Button)findViewById(R.id.btn_lottery_fund);
        btnLotteryFund.setOnClickListener(this);

        Button btnAboutShop = (Button)findViewById(R.id.btn_about_shop);
        btnAboutShop.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_lottery_result:
                startNewActivity(LotteryResult.class);
                break;
            case R.id.btn_today_recommendation:
                startNewActivity(TodayRecommendation.class);
                break;
            case R.id.btn_lottery_introduction:
                startNewActivity(LotteryIntroduction.class);
                break;
            case R.id.btn_fixed_no_service:
                startNewActivity(FixedNoService.class);
                break;
            case R.id.btn_lottery_fund:
                startNewActivity(LotteryFund.class);
                break;
            case R.id.btn_about_shop:
                startNewActivity(AboutShop.class);
                break;
            default:
                break;
        }
    }

    private void startNewActivity(Class cls)
    {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}
