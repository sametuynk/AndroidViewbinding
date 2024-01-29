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
}