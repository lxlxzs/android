package com.example.demo;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.RadioButton;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myBtn_one = (Button) findViewById(R.id.regist);
        myBtn_one.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        final TextView tv = (TextView) findViewById(R.id.info);//创建一个tv，将信息转到info所在的TextView里面
        final TextView tv1 = (TextView) findViewById(R.id.num);
        final EditText tv2 = (EditText) findViewById(R.id.username_regist);
        final TextView tv3 = (TextView) findViewById(R.id.code);
        final EditText tv4 = (EditText) findViewById(R.id.password_regist);
        final RadioGroup sex=(RadioGroup) findViewById(R.id.radio);
        final CheckBox cb1=(CheckBox)findViewById(R.id.cb_1);
        final CheckBox cb2=(CheckBox)findViewById(R.id.cb_2);
        final CheckBox cb3=(CheckBox)findViewById(R.id.cb_3);
        String Tex1 = tv1.getText().toString();//存文本信息
        String Tex2 = tv2.getText().toString();
        String Tex3 = tv3.getText().toString();
        String Tex4 = tv4.getText().toString();
        String Red = "";//存单选按钮组信息
        String Com = "";//存复选按钮信息
        String Whe = "";//存下拉菜单信息
        //通过for循环遍历单选按钮组
        for (int i = 0; i < sex.getChildCount(); i++) {//组中的子数
            RadioButton RB = (RadioButton) sex.getChildAt(i);//返回指定位置的视图
            if (RB.isChecked()) {
                Red = RB.getText().toString();
                break;
            }
        }
        if (cb1.isChecked())
            Com += cb1.getText().toString() + " ";
        if (cb2.isChecked())
            Com += cb2.getText().toString() + " ";
        if (cb3.isChecked())
            Com += cb3.getText().toString() + " ";
        Spinner sp = (Spinner) findViewById(R.id.downtable);
        Whe = sp.getSelectedItem().toString();
        tv.setText("信息如下：" + "\n" + Tex1 + Tex2 + "\n" + Tex3 + Tex4 + "\n" + "性别：" + Red + " 爱好：" + Com + "地点：" + Whe);
    }
}
