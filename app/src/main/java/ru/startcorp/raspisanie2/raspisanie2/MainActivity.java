package ru.startcorp.raspisanie2.raspisanie2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Reklama
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
//btn1a
        Button btn1a = (Button) findViewById(R.id.btn1a);
        View.OnClickListener oclbtn1a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/1%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn1b
        Button btn1b = (Button) findViewById(R.id.btn1b);
        View.OnClickListener oclbtn1b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/1%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn1v
        Button btn1v = (Button) findViewById(R.id.btn1v);
        View.OnClickListener oclbtn1v = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/1%D0%B2.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn2a
        Button btn2a = (Button) findViewById(R.id.btn2a);
        View.OnClickListener oclbtn2a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/2%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn2b
        Button btn2b = (Button) findViewById(R.id.btn2b);
        View.OnClickListener oclbtn2b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/2%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn2v
        Button btn2v = (Button) findViewById(R.id.btn2v);
        View.OnClickListener oclbtn2v = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/2%D0%B2.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn3a
        Button btn3a = (Button) findViewById(R.id.btn3a);
        View.OnClickListener oclbtn3a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/3%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn3b
        Button btn3b = (Button) findViewById(R.id.btn3b);
        View.OnClickListener oclbtn3b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/3%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn4a
        Button btn4a = (Button) findViewById(R.id.btn4a);
        View.OnClickListener oclbtn4a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/4%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn4b
        Button btn4b = (Button) findViewById(R.id.btn4b);
        View.OnClickListener oclbtn4b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/4%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn4v
        Button btn4v = (Button) findViewById(R.id.btn4v);
        View.OnClickListener oclbtn4v = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/4%D0%B2.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn5a
        Button btn5a = (Button) findViewById(R.id.btn5a);
        View.OnClickListener oclbtn5a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/5%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn5b
        Button btn5b = (Button) findViewById(R.id.btn5b);
        View.OnClickListener oclbtn5b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/5%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn5v
        Button btn5v = (Button) findViewById(R.id.btn5v);
        View.OnClickListener oclbtn5v = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/5%D0%B2.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn6a
        Button btn6a = (Button) findViewById(R.id.btn6a);
        View.OnClickListener oclbtn6a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/6%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn6b
        Button btn6b = (Button) findViewById(R.id.btn6b);
        View.OnClickListener oclbtn6b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/6%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn7a
        Button btn7a = (Button) findViewById(R.id.btn7a);
        View.OnClickListener oclbtn7a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/7%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn7b
        Button btn7b = (Button) findViewById(R.id.btn7b);
        View.OnClickListener oclbtn7b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/7%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn8a
        Button btn8a = (Button) findViewById(R.id.btn8a);
        View.OnClickListener oclbtn8a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/8%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn8b
        Button btn8b = (Button) findViewById(R.id.btn8b);
        View.OnClickListener oclbtn8b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/8%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn9a
        Button btn9a = (Button) findViewById(R.id.btn9a);
        View.OnClickListener oclbtn9a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/9%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn9b
        Button btn9b = (Button) findViewById(R.id.btn9b);
        View.OnClickListener oclbtn9b = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/9%D0%B1.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn10a
        Button btn10a = (Button) findViewById(R.id.btn10a);
        View.OnClickListener oclbtn10a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/10%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };
//btn11a
        Button btn11a = (Button) findViewById(R.id.btn11a);
        View.OnClickListener oclbtn11a = new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                String page = "http://miramirov.ru/raspisanie/11%D0%B0.html";
                i.putExtra("page", page);
                startActivity(i);
            }
        };


        btn1a.setOnClickListener(oclbtn1a);
        btn1b.setOnClickListener(oclbtn1b);
        btn1v.setOnClickListener(oclbtn1v);
        btn2a.setOnClickListener(oclbtn2a);
        btn2b.setOnClickListener(oclbtn2b);
        btn2v.setOnClickListener(oclbtn2v);
        btn3a.setOnClickListener(oclbtn3a);
        btn3b.setOnClickListener(oclbtn3b);
        btn4a.setOnClickListener(oclbtn4a);
        btn4b.setOnClickListener(oclbtn4b);
        btn4v.setOnClickListener(oclbtn4v);
//High school
        btn5a.setOnClickListener(oclbtn5a);
        btn5b.setOnClickListener(oclbtn5b);
        btn5v.setOnClickListener(oclbtn5v);
        btn6a.setOnClickListener(oclbtn6a);
        btn6b.setOnClickListener(oclbtn6b);
        btn7a.setOnClickListener(oclbtn7a);
        btn7b.setOnClickListener(oclbtn7b);
        btn8a.setOnClickListener(oclbtn8a);
        btn8b.setOnClickListener(oclbtn8b);
        btn9a.setOnClickListener(oclbtn9a);
        btn9b.setOnClickListener(oclbtn9b);
        btn10a.setOnClickListener(oclbtn10a);
        btn11a.setOnClickListener(oclbtn11a);
    }
}