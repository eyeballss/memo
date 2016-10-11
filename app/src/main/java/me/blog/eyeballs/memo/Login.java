package me.blog.eyeballs.memo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import ru.katso.livebutton.LiveButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText idTxt = (EditText) findViewById(R.id.ID_editTxt);

        LiveButton idButton = (LiveButton) findViewById(R.id.ID_button);
        idButton.setPressedHeight(2);
        idButton.setNormalHeight(8);
        idButton.setCorners(12);
        idButton.setBackgroundColor(0xffF57F76);
        idButton.setShadowColor(0xffb16262);

        startActivity(new Intent(Login.this, MainActivity.class));



    }
}
