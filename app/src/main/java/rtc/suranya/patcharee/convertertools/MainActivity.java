package rtc.suranya.patcharee.convertertools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //Explicit ประกาศตัวแปร
    private ImageView lengthImageView, tempImageView, areaImageView,
            voulumeImageView, weigthImageView, timeImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        lengthImageView = (ImageView) findViewById(R.id.imageView3);
        tempImageView = (ImageView) findViewById(R.id.imageView4);
        areaImageView = (ImageView) findViewById(R.id.imageView5);
        voulumeImageView = (ImageView) findViewById(R.id.imageView6);
        weigthImageView = (ImageView) findViewById(R.id.imageView7);
        timeImageView = (ImageView) findViewById(R.id.imageView8);

        // image controller
        lengthImageView.setOnClickListener(this);
        tempImageView.setOnClickListener(this);
        areaImageView.setOnClickListener(this);
        voulumeImageView.setOnClickListener(this);
        weigthImageView.setOnClickListener(this);
        timeImageView.setOnClickListener(this);


    }   // Main Method

    @Override
    public void onClick(View v) {


        int index = 0;

        switch (v.getId()) {

            case R.id.imageView3:
                index = 0;
                break;
            case R.id.imageView4:
                index = 1;
                break;
            case R.id.imageView5:
                index = 2;
                break;
            case R.id.imageView6:
                index = 3;
                break;
            case R.id.imageView7:
                index = 4;
                break;
            case R.id.imageView8:
                index = 5;
                break;

        }//switch

        Intent intent = new Intent(MainActivity.this,Calculate.class);
        intent.putExtra("Index", index); //Sent Index
        startActivity(intent);

    }   // onclick
}   // Main Class
