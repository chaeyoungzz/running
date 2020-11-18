package com.example.myapplication.Prime_Activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class Prime_B2F_Activity extends AppCompatActivity {

    int flag = 0;
    TextView textview;
    ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_b2f);
        textview=findViewById(R.id.textView6);
        //우측
        moving_b201_1();
        moving_b202_1();
        moving_b203_1();
        moving_b204_1();
        moving_b205_1();
        moving_b206_1();
        moving_b207_1();
        moving_b208_1();

        moving_b201_2();
        moving_b202_2();
        moving_b205_2();
        moving_b207_2();

        moving_b211_2();
        moving_b213_2();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    // b201_1호에서 최단거리 이동
    private void moving_b201_1() {
        final Button b = (Button) findViewById(R.id.p_b201_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 830, 350); //x 좌표
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 510, 510); //y 좌표
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    // b202_1호에서 최단거리 이동
    private void moving_b202_1() {
        final Button b = (Button) findViewById(R.id.p_b202_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 710 , 350); //x 좌표
                        animation1.setDuration(1700);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  510, 510); //y 좌표
                        animation3.setDuration(1700);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    // b203_1호에서 최단거리 이동
    private void moving_b203_1() {
        final Button b = (Button) findViewById(R.id.p_b203_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  600, 350); //x 좌표
                        animation1.setDuration(1600);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  510, 510); //y 좌표
                        animation3.setDuration(1600);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b204_1호에서 최단거리 이동
    private void moving_b204_1() {
        final Button button = (Button) findViewById(R.id.p_b204_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX",  470, 350);
                        animation1.setDuration(1300);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  510, 510);
                        animation3.setDuration(1300);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b205_1호에서 최단거리 이동
    private void moving_b205_1() {
        final Button button = (Button) findViewById(R.id.p_b205_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 700, 1300, 1300, 1580);
                        animation1.setDuration(1900);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY",  430, 430, 350, 350);
                        animation3.setDuration(1900);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b206_1호에서 최단거리 이동
    private void moving_b206_1() {
        final Button button = (Button) findViewById(R.id.p_b206_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 350, 540, 540);
                        animation1.setDuration(1900);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 370, 370, 250);
                        animation3.setDuration(1900);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {

                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b207_1호에서 최단거리 이동
    private void moving_b207_1() {
        final Button button = (Button) findViewById(R.id.p_b207_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1300, 1300, 540);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 230, 230, 180);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b208_1호에서 최단거리 이동
    private void moving_b208_1() {
        final Button button = (Button) findViewById(R.id.p_b208_1);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 890, 1300, 1300, 1580);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 430, 430, 350, 350);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b201_2호에서 최단거리 이동
    private void moving_b201_2() {
        final Button button = (Button) findViewById(R.id.p_b201_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1500, 1300);
                        animation1.setDuration(1200);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 550);
                        animation3.setDuration(1200);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b202_2호에서 최단거리 이동
    private void moving_b202_2() {
        final Button button = (Button) findViewById(R.id.p_b202_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620, 1300);
                        animation1.setDuration(1300);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 550, 550);
                        animation3.setDuration(1300);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b205_2호에서 최단거리 이동
    private void moving_b205_2() {
        final Button button = (Button) findViewById(R.id.p_b205_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620, 1620, 1700);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490, 200, 200);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }

    //b207_2호에서 최단거리 이동
    private void moving_b207_2() {
        final Button button = (Button) findViewById(R.id.p_b207_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620, 1620, 1700 );
                        animation1.setDuration(1300);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 300, 200, 200);
                        animation3.setDuration(1300);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }



    //b211_2호에서 최단거리 이동
    private void moving_b211_2() {
        final Button button = (Button) findViewById(R.id.p_b211_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 1620, 1620, 1700);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 490, 200, 200);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }


    //b213_2호에서 최단거리 이동
    private void moving_b213_2() {
        final Button button = (Button) findViewById(R.id.p_b213_2);
        final ImageView iv = (ImageView) findViewById(R.id.imageView1);
        imageView1 = findViewById(R.id.imageView1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag == 0) {
                    {
                        imageView1.setVisibility(View.VISIBLE);
                        ObjectAnimator animation1 = ObjectAnimator.ofFloat(iv, "translationX", 890, 1300, 1300, 1580);
                        animation1.setDuration(1800);
                        animation1.start();

                        ObjectAnimator animation3 = ObjectAnimator.ofFloat(iv, "translationY", 430, 430, 350, 350);
                        animation3.setDuration(1800);
                        animation3.start();

                        animation1.setRepeatCount(ValueAnimator.REVERSE);
                        animation3.setRepeatCount(ValueAnimator.REVERSE);
                    }
                    flag = 1;
                } else {
                    {
                        imageView1.setVisibility(View.GONE);
                    }
                    flag = 0;
                }

            }
        });
    }
}