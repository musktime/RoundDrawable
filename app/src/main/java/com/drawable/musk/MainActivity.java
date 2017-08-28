package com.drawable.musk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.mydrawable.musk.CircleDrawable;
import com.mydrawable.musk.RoundDrawable;

public class MainActivity extends AppCompatActivity {

    private ImageView mCircleImv, mRoundImv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //测试图片
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.fengjing);

        //找到控件
        mCircleImv = (ImageView) findViewById(R.id.circle_imv);
        mRoundImv = (ImageView) findViewById(R.id.round_imv);

        //圆形
        mCircleImv.setImageDrawable(new CircleDrawable(bitmap));

        //圆角矩形
        mRoundImv.setImageDrawable(new RoundDrawable(bitmap));

    }
}