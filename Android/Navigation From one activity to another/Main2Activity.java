package gq.smktech.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=(TextView) findViewById(R.id.txt1);
        btn1=(Button) findViewById(R.id.btn1);
    }
    public void back(View v)
    {
        Intent i=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(i);
    }
}
