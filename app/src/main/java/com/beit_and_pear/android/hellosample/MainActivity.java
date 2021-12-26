package com.beit_and_pear.android.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 表示ボタンが押された時
        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);
        // クリアボタンが押された時
        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = v.getId();

            switch (id) {
                case R.id.btClick:
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "さん、こんにちは！");
                    break;
                case R.id.btClear:
                    output.setText("");
                    break;
            }

        }
    }
}