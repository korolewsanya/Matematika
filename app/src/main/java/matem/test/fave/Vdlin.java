package matem.test.fave;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Vdlin extends AppCompatActivity {

    private final static String FILE_NAME7 = "PrVdlin.txt";
    private final static String FILE_NAME8 = "NeVdlin.txt";
    private final static String FILE_NAME8а = "PropVdlin.txt";

    //Для Преобразования часов в строку для последующего присвоения кнопке
    String chac;
    String chac2;

    //Для Преобразование минут в строку для последующего присвоения кнопке
    String miin;
    String miin2;

    //Для Решение примера/правильный ответ
    int sumMin;
    int sumMin2;

    String s3;
    String s6;

    int tri;
    int sh;

    //Рандромные числа для минут часа
    public  void B()
    {Random a = new Random();
        int odin = a.nextInt(9);
        s3 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView3);
        t1.setText(s3);}

    //Рандромные числа для прибавляемых грамм
    public void C() {
        Random a = new Random();
        int dva = a.nextInt(10);
        s6 = Integer.toString(dva);
        TextView t6 = (TextView) findViewById(R.id.textView6);
        t6.setText(s6);
    }

    //Функция рандромных чисел и решение примеров
    public void Ran() {
        Random a = new Random();
        int odin = a.nextInt(10) + 1;
        String s1 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);

        B();
        C();

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s3);
        int ch5 = Integer.parseInt(s6);

        //Перевод метров в дм,дм в см,см в мм
        int ch1a = ch1 * 10;

        //Решение примера/правильный ответ
        sumMin = ch1a + ch3 + ch5;
        sumMin2 = ch1a + ch3 - ch5;

        //Перевод минут в часы/правильный ответ
        int chas = sumMin / 10;
        int chas2 = sumMin2 / 10;

        //Получение остатка минут после перевода в часы/правильный ответ
        int min = sumMin % 10;
        int min2 = sumMin2 % 10;

        //Преобразование часов в строку для последующего присвоения кнопке/прав. отв.
        chac = Integer.toString(chas);
        chac2 = Integer.toString(chas2);

        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min);
        miin2 = Integer.toString(min2);
    }

    int w=0;

    public  void nextRan1() {
        w++;
        switch (w) {
            case 1:
                tri = 10;
                break;
            case 2:
                tri = 90;
                break;
            case 3:
                tri = 30;
                break;
            case 4:
                tri = 20;
                break;
            case 5:
                tri = 80;
                break;
            case 6:
                tri = 50;
                break;
            case 7:
                tri = 40;
                break;
            case 8:
                tri = 70;
                break;
            case 9:
                tri = 10;
                break;
            case 10:
                tri = 30;
                break;
            case 11:
                tri = 60;
        }
        if (w > 10) {
            w = 0;
        }
    }
    int l=0;

    public  void nextRan2()
    {l++;
        switch (l)
        { case 1:
            sh=30;
            break;
            case 2:
                sh=20;
                break;
            case 3:
                sh=50;
                break;
            case 4:
                sh=40;
                break;
            case 5:
                sh=90;
                break;
            case 6:
                sh=70;
                break;
            case 7:
                sh=60;
                break;
            case 8:
                sh=40;
                break;
            case 9:
                sh=10;
                break;
            case 10:
                sh=70;
                break;
            case 11:
                sh=60;
                break;
            case 12:
                sh=30;
                break;
            case 13:
                sh=40;
                break;
            case 14:
                sh=10;
                break;
            case 15:
                sh=50;
                break;
        }
        if (l > 14) {
            l = 0;
        }
    }

    //Рандромные числа для м и см
    public void B2() {
        s3 = Integer.toString(sh);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(s3);
    }

    //Рандромные числа для прибавляемых минут
    public void C2() {
        s6 = Integer.toString(tri);
        TextView t6 = (TextView) findViewById(R.id.textView6);
        t6.setText(s6);
    }

    //Функция рандромных чисел и решение примеров для метров и см
    public void RanMcm() {
        Random a = new Random();
        int odin = a.nextInt(10) + 1;
        String s1 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);

        B2();
        C2();

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s3);
        int ch5 = Integer.parseInt(s6);

        //Перевод метров в  см
        int ch1a = ch1 * 100;

        //Решение примера/правильный ответ
        sumMin = ch1a + ch3 + ch5;
        sumMin2 = ch1a + ch3 - ch5;

        //Перевод минут в часы/правильный ответ
        int chas = sumMin / 100;
        int chas2 = sumMin2 / 100;

        //Получение остатка минут после перевода в часы/правильный ответ
        int min = sumMin % 100;
        int min2 = sumMin2 % 100;

        //Преобразование часов в строку для последующего присвоения кнопке/прав. отв.
        chac = Integer.toString(chas);
        chac2 = Integer.toString(chas2);

        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min);
        miin2 = Integer.toString(min2);
    }

    //Правильный ответ
    int prOtv;

    //Правильая строка
    CharSequence PrStr;

    //Полученная строка
    CharSequence PolStr;

    //Неправильный ответ
    int nprOt;

    //Неправильная строка
    String NprStr;

    Button b;
    Button b2;
    Button b3;

    //Очистка начальных ПРАВИЛЬНО/Правильный ответ
    public void O() {
        TextView t10 = (TextView) findViewById(R.id.textView10);
        t10.setText("   ");
        TextView t11 = (TextView) findViewById(R.id.textView11);
        t11.setText("   ");
    }

    //Сложение времени 1 вариант
    public void Plus() {
        O();
        Ran();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("м");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("дм");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("+");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("дм");
        b = (Button) findViewById(R.id.button);
        b.setText(chac + "м" + "  " + miin +" "+ "дм");
        PrStr = b.getText();

        prOtv = sumMin;
        nprOt = prOtv + 1;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac + "м" + "  " + miin +" "+ "дм");

        prOtv = sumMin;
        nprOt = prOtv - 5;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac + "м" + "  " + miin +" "+ "дм");

        if(prOtv<0|nprOt<0){Plus();}
    }

    //Сложение времени 2 вариант
    public void Plus2() {
        Ran();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("дм");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("см");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("+");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("см");
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac + "дм" + "  " + miin +" "+ "см");
        PrStr = b2.getText();

        prOtv = sumMin;
        nprOt = prOtv + 2;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min);
        b = (Button) findViewById(R.id.button);
        b.setText(chac + "дм" + "  " + miin +" "+ "см");

        prOtv = sumMin;
        nprOt = prOtv + 3;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac + "дм" + "  " + miin +" "+ "см");

        if(prOtv<0|nprOt<0){Plus2();}
    }

    //Сложение времени 3 вариант
    public void Plus3() {
        Ran();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("см");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("мм");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("+");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("мм");
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac + "см" + "  " + miin +" "+ "мм");
        PrStr = b3.getText();

        prOtv = sumMin;
        nprOt = prOtv + 4;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac + "см" + "  " + miin +" "+ "мм");

        prOtv = sumMin;
        nprOt = prOtv - 1;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min2);
        b = (Button) findViewById(R.id.button);
        b.setText(chac + "см" + "  " + miin +" "+ "мм");

        if(prOtv<0|nprOt<0){Plus3();}
    }

    public void PlusA() {
        O();
        RanMcm();
        nextRan1();
        nextRan2();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("м");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("cм");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("+");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("cм");
        b = (Button) findViewById(R.id.button);
        b.setText(chac + "м" + "  " + miin +" "+ "cм");
        PrStr = b.getText();

        prOtv = sumMin;
        nprOt = prOtv + 30;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 100;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 100;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac + "м" + "  " + miin +" "+ "cм");

        prOtv = sumMin;
        nprOt = prOtv - 10;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 100;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 100;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin = Integer.toString(min2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac + "м" + "  " + miin +" "+ "cм");

        if(prOtv<0|nprOt<0){PlusA();}
    }

    //Вычитание времени 1 вариант
    public void Minus() {
        Ran();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("м");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("дм");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("-");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("дм");
        b = (Button) findViewById(R.id.button);
        b.setText(chac2 + "м" + "  " + miin2 +" "+ "дм");
        PrStr = b.getText();

        prOtv = sumMin2;
        nprOt = prOtv - 2;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac2 + "м" + "  " + miin2 +" "+ "дм");

        prOtv = sumMin2;
        nprOt = prOtv - 5;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac2 + "м" + "  " + miin2 +" "+ "дм");

        if(prOtv<0|nprOt<0){Minus();}
    }

    public void Minus2() {
        Ran();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("дм");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("см");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("-");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("см");
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac2 + "дм" + "  " + miin2 +" "+ "см");
        PrStr = b3.getText();

        prOtv = sumMin2;
        nprOt = prOtv + 6;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac2 + "дм" + "  " + miin2 +" "+ "см");

        prOtv = sumMin2;
        nprOt = prOtv + 2;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min2);
        b = (Button) findViewById(R.id.button);
        b.setText(chac2 + "дм" + "  " + miin2 +" "+ "см");

        if(prOtv<0|nprOt<0){Minus2();}
    }

    public void Minus3() {
        Ran();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("см");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("мм");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("-");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("мм");
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac2 + "см" + "  " + miin2 +" "+ "мм");
        PrStr = b2.getText();

        prOtv = sumMin2;
        nprOt = prOtv + 7;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac2 + "см" + "  " + miin2 +" "+ "мм");

        prOtv = sumMin2;
        nprOt = prOtv - 1;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 10;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 10;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min2);
        b = (Button) findViewById(R.id.button);
        b.setText(chac2 + "см" + "  " + miin2 +" "+ "мм");

        if(prOtv<0|nprOt<0){Minus3();}
    }

    public void MinusA() {
        O();
        nextRan1();
        nextRan2();
        RanMcm();
        TextView t2 = (TextView) findViewById(R.id.textView2);
        t2.setText("м");
        TextView t4 = (TextView) findViewById(R.id.textView4);
        t4.setText("cм");
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText("-");
        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText("cм");
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(chac2 + "м" + "  " + miin2 +" "+ "cм");
        PrStr = b3.getText();

        prOtv = sumMin2;
        nprOt = prOtv + 2;
        //Перевод минут в часы/неправильный ответ
        int chas = nprOt / 100;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min = nprOt % 100;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(chac2 + "м" + "  " + miin2 +" "+ "cм");

        prOtv = sumMin2;
        nprOt = prOtv + 3;
        //Перевод минут в часы/неправильный ответ
        int chas2 = nprOt / 100;
        //Получение остатка минут после перевода в часы/неправильный ответ
        int min2 = nprOt % 100;
        //Преобразование часов в строку для последующего присвоения кнопке/неправ. отв.
        chac2 = Integer.toString(chas2);
        //Преобразование минут в строку для последующего присвоения кнопке/прав. отв.
        miin2 = Integer.toString(min2);
        b = (Button) findViewById(R.id.button);
        b.setText(chac2 + "м" + "  " + miin2 +" "+ "cм");

        if(prOtv<0|nprOt<0){MinusA();}
    }

    //Начальная переменная для функчии next()
    int x = 0;

    //Чередование функций вывода чисел и знаков
    public void next() {
        x++;
        switch (x) {
            case 1:
                Plus();
                break;
            case 2:
                Minus();
                break;
            case 3:
                Plus2();
                break;
            case 4:
                Minus2();
                break;
            case 5:
                Plus3();
                break;
            case 6:
                Minus3();
                break;
            case 7:
                PlusA();
                break;
            case 8:
                MinusA();
                break;
        }
        if (x > 7) {
            x = 0;
        }

    }

    //Присвоение техтВью правельного ответа
    public void PO() {
        TextView T11 = (TextView) findViewById(R.id.textView11);
        T11.setText("  Правильный ответ   " + PrStr);
        T11.setTextColor(Color.MAGENTA);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vdlin);

        Plus();
    }

    //Запрет нажатия кнопок
    public void ZapNa() {
        Button b = (Button) findViewById(R.id.button);
        b.setClickable(false);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setClickable(false);
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setClickable(false);
    }

    //Разрешение нажатия кнопок
    public void RazNa() {
        Button b = (Button) findViewById(R.id.button);
        b.setClickable(true);
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setClickable(true);
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setClickable(true);
    }

    //Колличество правельных и неправельных ответов
    int kolPr = 0;
    int kolNpr = 0;
    String kolP;
    String kolNp;

    //Подсчет правельных ответов
    public void KolPr() {
        kolPr++;
        kolP = Integer.toString(kolPr);
        TextView T12 = (TextView) findViewById(R.id.textView12);
        T12.setText("  Правильных ответов- " + kolP);
    }

    //Подсчет неправельных ответов
    public void KolNpr() {
        kolNpr++;
        kolNp = Integer.toString(kolNpr);
        TextView T13 = (TextView) findViewById(R.id.textView13);
        T13.setText("  Неправильных ответов- " + kolNp);
    }

    //Кол-во прощенных
    int kolProp=0;
    String kolPpop;

    //Подсчет пропущенных
    public void KolProp() {
        kolProp++;
        kolPpop = Integer.toString(kolProp);
        TextView T15 = (TextView) findViewById(R.id.textView15);
        T15.setText("  Пропущено- " + kolPpop);
    }

    int i=0;
    int j=0;
    int k=0;

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                //Получение числа из кнопки
                PolStr = b.getText();
                i=1;
                if (PolStr == PrStr) {
                    TextView T10 = (TextView) findViewById(R.id.textView10);
                    T10.setText("  ПРАВИЛЬНО");
                    T10.setTextColor(Color.GREEN);
                    ZapNa();
                    PO();
                    KolPr();
                } else {
                    TextView T10 = (TextView) findViewById(R.id.textView10);
                    T10.setText("  НЕПРАВИЛЬНО");
                    T10.setTextColor(Color.RED);
                    ZapNa();
                    PO();
                    KolNpr();
                }
                break;

            case R.id.button2:
                //Получение числа из кнопки
                PolStr = b2.getText();
                j=1;
                if (PolStr == PrStr) {
                    TextView T10 = (TextView) findViewById(R.id.textView10);
                    T10.setText("  ПРАВИЛЬНО");
                    T10.setTextColor(Color.GREEN);
                    ZapNa();
                    PO();
                    KolPr();
                } else {
                    TextView T10 = (TextView) findViewById(R.id.textView10);
                    T10.setText("  НЕПРАВИЛЬНО");
                    T10.setTextColor(Color.RED);
                    ZapNa();
                    PO();
                    KolNpr();
                }
                break;

            case R.id.button3:
                //Получение числа из кнопки
                PolStr = b3.getText();
                k=1;
                if (PolStr == PrStr) {
                    TextView T10 = (TextView) findViewById(R.id.textView10);
                    T10.setText("  ПРАВИЛЬНО");
                    T10.setTextColor(Color.GREEN);
                    ZapNa();
                    PO();
                    KolPr();
                } else {
                    TextView T10 = (TextView) findViewById(R.id.textView10);
                    T10.setText("  НЕПРАВИЛЬНО");
                    T10.setTextColor(Color.RED);
                    ZapNa();
                    PO();
                    KolNpr();
                }
                break;

            case R.id.button4:
                if(i!=1&j!=1&k!=1){KolProp();}
                i=0;
                j=0;
                k=0;
                next();
                TextView T10 = (TextView) findViewById(R.id.textView10);
                T10.setText("                     ");
                TextView T11 = (TextView) findViewById(R.id.textView11);
                T11.setText("");
                RazNa();
                break;
        }
    }
    String sss;
    String text;
    String sss2;
    String text2;
    String sss2a;
    String text2a;

    int aaa;
    int bbb;
    int ccc;
    int aaa2;
    int bbb2;
    int ccc2;
    int aaa2a;
    int bbb2a;
    int ccc2a;

    @Override
    public void onDestroy() {

        // открытие файла(для правильных ответов и неправильных ответов)
        FileInputStream fin2 = null;
        FileInputStream fin = null;
        FileInputStream fin2a = null;
        try{
            fin = openFileInput(FILE_NAME7);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            text =new String(bytes);
            aaa=Integer.parseInt(text);
            if(kolP==null){sss=text+"0";}
            else
            {sss=text+kolP;}
            if(text==null){aaa=0;}
            else
            {aaa=Integer.parseInt(text);}
            if(kolP==null){bbb=0;}
            else
            {bbb=Integer.parseInt(kolP);}
            ccc=aaa+bbb;
            sss=Integer.toString(ccc);

            fin2 = openFileInput(FILE_NAME8);
            byte[] bytes2 = new byte[fin2.available()];
            fin2.read(bytes2);
            text2 = new String (bytes2);
            if(kolNp==null){sss2=text2+"0";}
            else
            {sss2=text2+kolNp;}
            if(text2==null){aaa2=0;}
            else
            {aaa2=Integer.parseInt(text2);}
            if(kolNp==null){bbb2=0;}
            else
            {bbb2=Integer.parseInt(kolNp);}
            ccc2=aaa2+bbb2;
            sss2=Integer.toString(ccc2);

            fin2a = openFileInput(FILE_NAME8а);
            byte[] bytes2a = new byte[fin2a.available()];
            fin2a.read(bytes2a);
            text2a = new String (bytes2a);
            if(kolPpop==null){sss2a=text2a+"0";}
            else
            {sss2a=text2a+kolNp;}
            if(text2a==null){aaa2a=0;}
            else
            {aaa2a=Integer.parseInt(text2a);}
            if(kolPpop==null){bbb2a=0;}
            else
            {bbb2a=Integer.parseInt(kolPpop);}
            ccc2a=aaa2a+bbb2a;
            sss2a=Integer.toString(ccc2a);}

        catch(IOException ex) {

            aaa=0;
            if(kolP==null){bbb=0;}
            else
            {bbb=Integer.parseInt(kolP);}
            ccc=aaa+bbb;
            sss=Integer.toString(ccc);

            aaa2=0;
            if(kolNp==null){bbb2=0;}
            else
            {bbb2=Integer.parseInt(kolNp);}
            ccc2=aaa2+bbb2;
            sss2=Integer.toString(ccc2);

            aaa2a=0;
            if(kolPpop==null){bbb2a=0;}
            else
            {bbb2a=Integer.parseInt(kolPpop);}
            ccc2a=aaa2a+bbb2a;
            sss2a=Integer.toString(ccc2a);
        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
                if(fin2!=null)
                    fin2.close();
                if(fin2a!=null)
                    fin2a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// сохранение файла()для правильных ответов
        FileOutputStream fos = null;
        try {
            fos = openFileOutput(FILE_NAME7, MODE_PRIVATE);
            fos.write(sss.getBytes());
            Toast.makeText(this, "Результат сохранен", Toast.LENGTH_SHORT).show();
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos!=null)
                    fos.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// сохранение файла(для неправильных ответов)
        FileOutputStream fos2 = null;
        try {
            fos2 = openFileOutput(FILE_NAME8, MODE_PRIVATE);
            fos2.write(sss2.getBytes());
        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finally{
            try{
                if(fos2!=null)
                    fos2.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
// сохранение файла(для пропущенных)
        FileOutputStream fos2a = null;
        try {
            fos2a = openFileOutput(FILE_NAME8а, MODE_PRIVATE);
            fos2a.write(sss2a.getBytes());

        }
        catch(IOException ex) {

            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();

        }
        finally{
            try{
                if(fos2a!=null)
                    fos2a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        super.onDestroy();
    }
}
