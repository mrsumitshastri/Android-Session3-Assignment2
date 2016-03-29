package helloworld.iconikindia.com.android_session3_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRedClicked(View v)
    {
        Toast.makeText(this, "Red Color", Toast.LENGTH_SHORT).show();
    }

    public void btnOrangeClicked(View v)
    {
        Toast.makeText(this,"Orange Color",Toast.LENGTH_SHORT).show();
    }

    public void btnYellowClicked(View v)
    {
        Toast.makeText(this,"Yellow Color",Toast.LENGTH_SHORT).show();
    }

    public void btnGreenClicked(View v)
    {
        Toast.makeText(this,"Green Color",Toast.LENGTH_SHORT).show();
    }

    public void btnBlueClicked(View v)
    {
        Toast.makeText(this,"Blue Color",Toast.LENGTH_SHORT).show();
    }

    public void btnIngigoClicked(View v)
    {
        Toast.makeText(this,"Ingigo Color",Toast.LENGTH_SHORT).show();
    }

    public void btnVioletClicked(View v)
    {
        Toast.makeText(this,"Violet Color",Toast.LENGTH_SHORT).show();
    }
}
