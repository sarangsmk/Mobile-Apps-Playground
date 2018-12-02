package gq.smktech.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(TextView) findViewById(R.id.txt1);
        btn1=(Button) findViewById(R.id.btn1);
    }
    public void next(View v)
    {
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }
}
