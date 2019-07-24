package ir.roojano.sematec.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTag","OnCreate");

    }

    @Override
    protected void onStart() {
        Log.d("MyTag","OnStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("MyTag","OnResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("MyTag","OnPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("MyTag","OnStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("MyTag","Destroy");
        super.onDestroy();

    }

    @Override
    protected void onRestart() {
        Log.d("MyTag","OnRestart");
        super.onRestart();
        }
}

