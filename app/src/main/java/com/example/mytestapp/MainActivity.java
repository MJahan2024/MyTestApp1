package com.example.mytestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

// this line is modified in github
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getArea(View view) {
        TextView txtdisplay= findViewById(R.id.txtDisplay);
        EditText dim1= findViewById(R.id.txtLength);
        EditText dim2= findViewById(R.id.txtWidth);
        RadioButton rdTri=findViewById(R.id.radioTri);
        RadioButton rdRect=findViewById(R.id.radioRect);
        if(rdTri.isChecked()){
            txtdisplay.setText("Triangle selected");
            Triangle t1 =new Triangle(Double.parseDouble(dim1.getText().toString()),Double.parseDouble(dim2.getText().toString()));
            txtdisplay.setText("The area for Triangle is "+t1.getArea());
        }
        else if(rdRect.isChecked()){
            txtdisplay.setText("Rectangle selected");
            Rectangle r1 =new Rectangle(Double.parseDouble(dim1.getText().toString()),Double.parseDouble(dim2.getText().toString()));
            txtdisplay.setText("The area for Rectangle is "+r1.getArea());

        }

    }
}
