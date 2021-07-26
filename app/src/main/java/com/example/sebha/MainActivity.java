package com.example.sebha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    Button b1 ;
    Button b2;
    int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = (TextView)findViewById(R.id.txcount);
        b1 = (Button)findViewById(R.id.buttonCount);
        b2 = (Button)findViewById(R.id.buttonReset);

        TextView textView =(TextView)findViewById(R.id.textView5);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.facebook.com/profile.php?id=100007907179047'> AhMed KhaLed</a>";
        textView.setText(Html.fromHtml(text));

    }

    public void btnCount(View view) {
        if(i>0){
            tx.setText(String.valueOf(i));
        }
        i+=1;
    }

    public void btnReset(View view) {
        i=0;
        tx.setText(String.valueOf(i));
    }
}
