package com.example.niloofar.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>List1=new ArrayList<>();
    ArrayList<String>List2=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnAdd(View view){

        EditText inputObj=findViewById(R.id.txt_name);
        String input=inputObj.getText().toString();

        RadioButton RbList1Obj=findViewById(R.id.rb_list1);

        if(RbList1Obj.isChecked()){
            List1.add(input);
           FilltxvList(R.id.txv_list1,List1);
        }else{
            List2.add(input);
            FilltxvList(R.id.txv_list2,List2);
        }
        inputObj.setText("");

    }
    public void FilltxvList(int TxvId,ArrayList<String>tmp){

        TextView txvTempObj=findViewById(TxvId);
        String tmpst="";
        for (String e: tmp) {

            tmpst+=e+"\n";
        }
        txvTempObj.setText(tmpst);



    }

}
