package com.example.hoduchieu.volleyloadimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    NetworkImageView imageView;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        imageView = (NetworkImageView) findViewById(R.id.imageview);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String url = editText.getText().toString();
                 ImageLoader imageLoader = CustomImageLoader.getInstance(getApplication()).getImageLoader();
                 imageLoader.get(url,ImageLoader.getImageListener(imageView,R.mipmap.ic_launcher,R.mipmap.ic_launcher));

                 imageView.setImageUrl(url,imageLoader);
             }
         });
        }
}
