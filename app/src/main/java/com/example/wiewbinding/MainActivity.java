package com.example.wiewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wiewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
//    private TextView benimTextview;
//    private Button benimButton;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Log.e("Yaşam Döngüsü","onCreate");

//      benimButton=findViewById(R.id.benimButton);
//      benimTextview=findViewById(R.id.benimTextview);
        binding.benimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.benimTextview.setText("Merhaba Dünya");
                Log.e("Mesaj","Merhaba");
            }
        });
        /**
         * ViewBinding kullanmadan önce tek tek tanımladık ve tanımladıklarımız üzerinden ulaştık.
         * ViewBinding kullanarak activity üzerindeki btn,textlere direk ulaşmış olduk.
         */
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Yaşam Döngüsü","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Yaşam Döngüsü","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Yaşam Döngüsü","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Yaşam Döngüsü","onRestart");
    }
}