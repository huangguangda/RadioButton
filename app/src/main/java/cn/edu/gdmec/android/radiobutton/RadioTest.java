package cn.edu.gdmec.android.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioTest extends AppCompatActivity {
    TextView textview;
    RadioGroup radiogroup;
    RadioButton radio1,radio2,radio3,radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_radio_test );
        textview=(TextView)findViewById ( R.id.textview1 );
        radiogroup=(RadioGroup)findViewById ( R.id.radiogroup1 );
        radio1=(RadioButton)findViewById ( R.id.radiobutton2 );
        radio2=(RadioButton)findViewById ( R.id.radiobutton3 );
        radio3=(RadioButton)findViewById ( R.id.radiobutton4 );

        radiogroup.setOnCheckedChangeListener ( new RadioGroup.OnCheckedChangeListener (){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId==radio2.getId ())
                {
                    DisplayToast("正确答案："+radio2.getText()+"，恭喜你，回答正确！");
                }else {
                    DisplayToast("请注意，回答错误！");
                }
            }
        } );
    }
    public void DisplayToast(String str)
    {
        Toast toast=Toast.makeText(this, str, Toast.LENGTH_LONG);
        toast.setGravity ( Gravity.TOP,0,220 );
        toast.show ();
    }
}
