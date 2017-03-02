package com.myselectdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public MainActivity context;
    Toast toast;
    private String[] otherLables = new String[]{"test1","test2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        (findViewById(R.id.show_dialog)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                show();//显示Dialog

            }
        });
    }

    private void show() {
        NormalActionSheet as = new NormalActionSheet(this);
        as.builder().setTitle("title").setItems(Arrays.asList(otherLables)).
                setListener(new NormalActionSheet.OnNormalItemClickListener() {
                    @Override
                    public void onClick(String value) {
                            toast.setText(value);
                            toast.show();
                    }
                }).show();
    }
}
