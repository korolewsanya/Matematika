package matem.test.fave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gl extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glav);

        Button buttonPlay = (Button)findViewById(R.id.button4);

        // дадим кнопке способность «слушать» клик пользователя.
        buttonPlay.setOnClickListener( this);

        Button ravens = (Button)findViewById(R.id.button5);
        ravens.setOnClickListener( this);
    }

    // Метод обработки нажатия на кнопку
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent intent = new Intent(this, Primer.class);
                // запуск activity
                startActivity(intent);
                break;
            case R.id.button2:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent i = new Intent(this, Raven.class);
                // запуск activity
                startActivity(i);
                break;
            case R.id.button3:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent in = new Intent(this, Dlinna.class);
                // запуск activity
                startActivity(in);
                break;
            case R.id.button4:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent inp = new Intent(this, Vdlin.class);
                // запуск activity
                startActivity(inp);
                break;
            case R.id.button5:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent inc = new Intent(this, SravDlin.class);
                // запуск activity
                startActivity(inc);
                break;
            case R.id.button6:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent inca = new Intent(this, Vremya.class);
                // запуск activity
                startActivity(inca);
                break;
            case R.id.button7:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent incat = new Intent(this, Wes.class);
                // запуск activity
                startActivity(incat);
                break;
            case R.id.button8:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent incati = new Intent(this, Jid.class);
                // запуск activity
                startActivity(incati);
                break;
            case R.id.button9:
                // действия, совершаемые после нажатия на кнопку
                // Создаем объект Intent для вызова новой Activity
                Intent incatic = new Intent(this, Shab.class);
                // запуск activity
                startActivity(incatic);
                break;
        }
    }
}



