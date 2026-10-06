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

public class Raven extends AppCompatActivity {

    private final static String FILE_NAME11 = "PrRaven.txt";
    private final static String FILE_NAME12 = "NeRaven.txt";
    private final static String FILE_NAME12a = "PropRaven.txt";

    //Очистка начальных ПРАВИЛЬНО/Правильный ответ
    public void O()
    { TextView t10 = (TextView) findViewById(R.id.textView19);
        t10.setText("   ");
        TextView t11 = (TextView) findViewById(R.id.textView14);
        t11.setText("   ");
        TextView t20 = (TextView) findViewById(R.id.textView20);
        t20.setText("   ");
        TextView t21 = (TextView) findViewById(R.id.textView21);
        t21.setText("   "); }

    //Функция рандромных чисел и решение примеров
    public void Ran()

    //Получение рандромных чисел и их вывод в пример
    {
        Random a = new Random();
        int odin = a.nextInt(10);
        String s1 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);

        Random b = new Random();
        int tri = b.nextInt(10);
        String s3 = Integer.toString(tri);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(s3);

        Random c = new Random();
        int pat = c.nextInt(10);
        String s5 = Integer.toString(pat);
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText(s5);

        Random aA = new Random();
        int odinA = aA.nextInt(10);
        String s1A = Integer.toString(odinA);
        TextView t1A = (TextView) findViewById(R.id.textView7);
        t1A.setText(s1A);

        Random bA = new Random();
        int triA = bA.nextInt(10);
        String s3A = Integer.toString(triA);
        TextView t3A = (TextView) findViewById(R.id.textView9);
        t3A.setText(s3A);

        Random cA = new Random();
        int patA = cA.nextInt(10);
        String s5A = Integer.toString(patA);
        TextView t5A = (TextView) findViewById(R.id.textView11);
        t5A.setText(s5A);

//Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s3);
        int ch5 = Integer.parseInt(s5);

        int ch1A = Integer.parseInt(s1A);
        int ch3A = Integer.parseInt(s3A);
        int ch5A = Integer.parseInt(s5A);

// Решение примеров и преобразование ответов в строку

        int sum1 = ch1 * ch3 + ch5;
        sum11 = Integer.toString(sum1);
        int sum2 = ch1 * ch3 - ch5;
        sum22 = Integer.toString(sum2);
        int sum3 = ch1 + ch3 * ch5;
        sum33 = Integer.toString(sum3);
        int sum4 = ch1 + ch3 + ch5;
        sum44 = Integer.toString(sum4);
        int sum5 = ch1 + ch3 - ch5;
        sum55 = Integer.toString(sum5);
        int sum6 = ch1 - ch3 * ch5;
        sum66 = Integer.toString(sum6);
        int sum7 = ch1 - ch3 + ch5;
        sum77 = Integer.toString(sum7);
        int sum8 = ch1 - ch3 - ch5;
        sum88 = Integer.toString(sum8);

        int sum1A = ch1A * ch3A + ch5A;
        sum11A = Integer.toString(sum1A);
        int sum2A = ch1A * ch3A - ch5A;
        sum22A = Integer.toString(sum2A);
        int sum3A = ch1A + ch3A * ch5A;
        sum33A = Integer.toString(sum3A);
        int sum4A = ch1A + ch3A + ch5A;
        sum44A = Integer.toString(sum4A);
        int sum5A = ch1A + ch3A - ch5A;
        sum55A = Integer.toString(sum5A);
        int sum6A = ch1A - ch3A * ch5A;
        sum66A = Integer.toString(sum6A);
        int sum7A = ch1A - ch3A + ch5A;
        sum77A = Integer.toString(sum7A);
        int sum8A = ch1A - ch3A - ch5A;
        sum88A = Integer.toString(sum8A);
    }

    //Переменные для RanD1 и RanD2
    int r1;
    int r2;
    int r3;
    int r1a;
    int r2a;
    int r3a;
    int a;
    int b;
    int c;
    int a1;
    int b1;
    int c1;

    public void RanD1(){

        Random od = new Random();
        r1 = od.nextInt(10);
        Random dv = new Random();
        r2 = dv.nextInt(91)+10;
        Random tr = new Random();
        r3 = tr.nextInt(10)+1;
        a=r2;
        b=r3;
        c=a%b;
        if (c>0){RanD1();}
        String s1=Integer.toString(r1);
        String s2=Integer.toString(r2);
        String s3=Integer.toString(r3);

        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(s2);
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText(s3);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s2);
        int ch5 = Integer.parseInt(s3);

        // Решение примеров и преобразование ответов в строку
        int sum1 = ch1 * ch3 / ch5;
        sum11 = Integer.toString(sum1);
        int sum2 = ch1 + ch3 / ch5;
        sum22 = Integer.toString(sum2);
        int sum3 = ch1 - ch3 / ch5;
        sum33 = Integer.toString(sum3);}


    public void RanD1A()
    {Random od1 = new Random();
        r1a = od1.nextInt(10);
        Random dv1 = new Random();
        r2a = dv1.nextInt(91)+10;
        Random tr1 = new Random();
        r3a = tr1.nextInt(10)+1;
        a1=r2a;
        b1=r3a;
        c1=a1%b1;
        if (c1>0){RanD1A();}
        String s1a=Integer.toString(r1a);
        String s2a=Integer.toString(r2a);
        String s3a=Integer.toString(r3a);

        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText(s1a);
        TextView t9 = (TextView) findViewById(R.id.textView9);
        t9.setText(s2a);
        TextView t11 = (TextView) findViewById(R.id.textView11);
        t11.setText(s3a);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1A = Integer.parseInt(s1a);
        int ch3A = Integer.parseInt(s2a);
        int ch5A= Integer.parseInt(s3a);

        // Решение примеров и преобразование ответов в строку
        int sum1A = ch1A * ch3A / ch5A;
        sum11A = Integer.toString(sum1A);
        int sum2A = ch1A + ch3A / ch5A;
        sum22A = Integer.toString(sum2A);
        int sum3A = ch1A - ch3A / ch5A;
        sum33A = Integer.toString(sum3A);
    }

    public void RanD2(){

        Random od = new Random();
        r1 = od.nextInt(91)+10;
        Random dv = new Random();
        r2 = dv.nextInt(10)+1;
        Random tr = new Random();
        r3 = tr.nextInt(10);
        a=r1;
        b=r2;
        c=a%b;
        if (c>0){RanD2();}
        String s1=Integer.toString(r1);
        String s2=Integer.toString(r2);
        String s3=Integer.toString(r3);

        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(s2);
        TextView t5 = (TextView) findViewById(R.id.textView5);
        t5.setText(s3);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s2);
        int ch5 = Integer.parseInt(s3);

        // Решение примеров и преобразование ответов в строку
        int sum1 = ch1 / ch3 * ch5;
        sum11 = Integer.toString(sum1);
        int sum2 = ch1 / ch3 + ch5;
        sum22 = Integer.toString(sum2);
        int sum3 = ch1 / ch3 - ch5;
        sum33 = Integer.toString(sum3);

    }

    public void RanD2A()
    {Random od1 = new Random();
        r1a = od1.nextInt(91)+10;
        Random dv1 = new Random();
        r2a = dv1.nextInt(10)+1;
        Random tr1 = new Random();
        r3a = tr1.nextInt(10);
        a1=r1a;
        b1=r2a;
        c1=a1%b1;
        if (c1>0){RanD2A();}
        String s1a=Integer.toString(r1a);
        String s2a=Integer.toString(r2a);
        String s3a=Integer.toString(r3a);

        TextView t7 = (TextView) findViewById(R.id.textView7);
        t7.setText(s1a);
        TextView t9 = (TextView) findViewById(R.id.textView9);
        t9.setText(s2a);
        TextView t11 = (TextView) findViewById(R.id.textView11);
        t11.setText(s3a);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1A = Integer.parseInt(s1a);
        int ch3A = Integer.parseInt(s2a);
        int ch5A= Integer.parseInt(s3a);

        // Решение примеров и преобразование ответов в строку
        int sum1A = ch1A / ch3A * ch5A;
        sum11A = Integer.toString(sum1A);
        int sum2A = ch1A / ch3A + ch5A;
        sum22A = Integer.toString(sum2A);
        int sum3A = ch1A / ch3A - ch5A;
        sum33A = Integer.toString(sum3A);
    }

    //Переменные для Правельных и неправильных ответов
    int prOtv;
    int prOtv1;

    //Строковые переменные для Правельных и неправильных ответов
    String prOtvA;
    String prOtvB;

    //Начальная переменная для функчии next()
    int x = 0;

    //Колличество правельных и неправельных ответов
    int kolPr = 0;
    int kolNpr = 0;

    //Перевод правельных и неправельных ответов в строку
    String kolP;
    String kolNp;

    //Првавельный знак
    String prZn;

    //  преобразование ответов в строку
    String sum11;
    String sum22;
    String sum33;
    String sum44;
    String sum55;
    String sum66;
    String sum77;
    String sum88;

    String sum11A;
    String sum22A;
    String sum33A;
    String sum44A;
    String sum55A;
    String sum66A;
    String sum77A;
    String sum88A;

    //Для знаков(+,-)
    TextView tv2;
    TextView tv4;
    TextView tv8;
    TextView tv10;

    TextView T14;
    TextView T19;

    //Вывод чисел и знаков в ТехтВью1,2,3,4,5 и вычисление неправельных ответов
    //Вывод неправельных ответов на кнопки

    public void UR() {
        RanD1();
        RanD1A();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(":");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("*");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText(":");
        prOtv = Integer.parseInt(sum11);
        prOtv1 = Integer.parseInt(sum11A);
        prOtvA=sum11;
        prOtvB=sum11A;

        CO();
        if (prOtv < 0 | prOtv1 < 0|prOtv>100|prOtv1>100) {
            UR();}
        Znaki();
    }

    public void UP() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("*");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("+");
        prOtv = Integer.parseInt(sum11);
        prOtv1 = Integer.parseInt(sum11A);
        prOtvA=sum11;
        prOtvB=sum11A;

        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            UP();}
        Znaki();
    }

    public void UM() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("*");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("-");
        prOtv = Integer.parseInt(sum22);
        prOtv1 = Integer.parseInt(sum22A);
        prOtvA=sum22;
        prOtvB=sum22A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            UM();}
        Znaki();
    }

    public void PU() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("*");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("+");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("*");
        prOtv = Integer.parseInt(sum33);
        prOtv1 = Integer.parseInt(sum33A);
        prOtvA=sum33;
        prOtvB=sum33A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            PU();}
        Znaki();
    }

    public void PR() {
        RanD1();
        RanD1A();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(":");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("+");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText(":");
        prOtv = Integer.parseInt(sum22);
        prOtv1 = Integer.parseInt(sum22A);
        prOtvA=sum22;
        prOtvB=sum22A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            PR();}
        Znaki();
    }

    public void PP() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("+");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("+");
        prOtv = Integer.parseInt(sum44);
        prOtv1 = Integer.parseInt(sum44A);
        prOtvA=sum44;
        prOtvB=sum44A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            PP();}
        Znaki();
    }

    public void PM() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("+");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("-");
        prOtv = Integer.parseInt(sum55);
        prOtv1 = Integer.parseInt(sum55A);
        prOtvA=sum55;
        prOtvB=sum55A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            PM();}
        Znaki();
    }

    public void MU() {
        Ran();
        O();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("*");
        prOtv = Integer.parseInt(sum66);
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("-");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("*");
        prOtv1 = Integer.parseInt(sum66A);
        prOtvA=sum66;
        prOtvB=sum66A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            MU();}
        Znaki();
    }

    public void MR() {
        RanD1();
        RanD1A();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(":");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("-");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText(":");
        prOtv = Integer.parseInt(sum33);
        prOtv1 = Integer.parseInt(sum33A);
        prOtvA=sum33;
        prOtvB=sum33A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            MR();}
        Znaki();
    }

    public void MP() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("-");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("+");
        prOtv = Integer.parseInt(sum77);
        prOtv1 = Integer.parseInt(sum77A);
        prOtvA=sum77;
        prOtvB=sum77A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            MP();}
        Znaki();
    }

    public void MM() {
        Ran();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText("-");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("-");
        prOtv = Integer.parseInt(sum88);
        prOtv1 = Integer.parseInt(sum88A);
        prOtvA=sum88;
        prOtvB=sum88A;
        CO();
        if (prOtv < 0 | prOtv1 < 0) {
            MM();}
        Znaki();
    }

    public void RU() {
        RanD2();
        RanD2A();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("*");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText(":");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("*");
        prOtv = Integer.parseInt(sum11);
        prOtv1 = Integer.parseInt(sum11A);
        prOtvA=sum11;
        prOtvB=sum11A;

        CO();
        if (prOtv < 0 | prOtv1 < 0|prOtv>100|prOtv1>100) {
            RU();}
        Znaki();
    }

    public void RP() {
        RanD2();
        RanD2A();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText(":");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("+");
        prOtv = Integer.parseInt(sum22);
        prOtv1 = Integer.parseInt(sum22A);
        prOtvA=sum22;
        prOtvB=sum22A;
        CO();
        if (prOtv < 0 | prOtv1 < 0|prOtv>100|prOtv1>100) {
            RP();}
        Znaki();
    }

    public void RM() {
        RanD2();
        RanD2A();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        tv8 = (TextView) findViewById(R.id.textView8);
        tv8.setText(":");
        tv10 = (TextView) findViewById(R.id.textView10);
        tv10.setText("-");
        prOtv = Integer.parseInt(sum33);
        prOtv1 = Integer.parseInt(sum33A);
        prOtvA=sum33;
        prOtvB=sum33A;
        CO();
        if (prOtv < 0 | prOtv1 < 0|prOtv>100|prOtv1>100) {
            RM();}
        Znaki();
    }

    //Чередование функций вывода чисел и знаков
    public void next() {
        x++;
        switch (x) {
            case 1:
                UP();
                break;
            case 2:
                UM();
                break;
            case 3:
                PU();
                break;
            case 4:
                PP();
                break;
            case 5:
                UR();
                break;
            case 6:
                PR();
                break;
            case 7:
                PM();
                break;
            case 8:
                MU();
                break;
            case 9:
                MR();
                break;
            case 10:
                MP();
                break;
            case 11:
                RU();
                break;
            case 12:
                MM();
                break;
            case 13:
                RP();
                break;
            case 14:
                RM();
                break;
        }
        if (x > 13) {
            x = 0;
        }
    }

    //Подсчет правельных ответов
    public void KolPr() {
        kolPr++;
        kolP = Integer.toString(kolPr);
        TextView T17 = (TextView) findViewById(R.id.textView17);
        T17.setText(kolP);
    }

    //Подсчет неправельных ответов
    public void KolNpr() {
        kolNpr++;
        kolNp = Integer.toString(kolNpr);
        TextView T18 = (TextView) findViewById(R.id.textView18);
        T18.setText(kolNp);
    }

    //Вывод знаков в кнопки
    public void Znaki() {
        Button b1 = (Button) findViewById(R.id.button);
        b1.setText(">");
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText("<");
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setText("=");
    }

    //Присвоение техтВью правельного ответа
    public void PO() {
        T19 = (TextView) findViewById(R.id.textView19);
        T19.setText("  Правильный ответ");
        T19.setTextColor(Color.MAGENTA);
    }

    //Сравнение ответов
    public void CO() {
        if (prOtv > prOtv1) {
            prZn = ">";
        } else if (prOtv < prOtv1) {
            prZn = "<";
        } else {
            prZn = "=";
        }
    }

    //Обработка кнопок при правельном ответе
    public void OKр() {
        T14 = (TextView) findViewById(R.id.textView14);
        T14.setText("  ПРАВИЛЬНО");
        T14.setTextColor(Color.GREEN);
        PO();
        KolPr();
        ZapNa();
        VprZn();
        PrPrOt();
    }

    //Обработка кнопок при неправельном ответе
    public  void OKnp()
    {
        T14 = (TextView) findViewById(R.id.textView14);
        T14.setText("  НЕПРАВИЛЬНО");
        T14.setTextColor(Color.RED);
        PO();
        KolNpr();
        ZapNa();
        VprZn();
        PrPrOt();
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
    public void RazNa()
    {Button b=(Button)findViewById(R.id.button);
        b.setClickable(true);
        Button b2=(Button)findViewById(R.id.button2);
        b2.setClickable(true);
        Button b3=(Button)findViewById(R.id.button3);
        b3.setClickable(true);}

    //Вывод правельного знака
    public void VprZn()
    {TextView T20=(TextView)findViewById(R.id.textView20);
        T20.setText(prZn);
        T20.setTextColor(Color.BLACK);}

    //Пример правильного ответа
    public void PrPrOt()
    {TextView T21=(TextView)findViewById(R.id.textView21);
        T21.setText("("+" "+prOtvA+" "+prZn+" "+prOtvB+" "+")");
        T21.setTextColor(Color.MAGENTA);}

    //Кол-во прощенных
    int kolProp=0;
    String kolPpop;

    //Подсчет пропущенных
    public void KolProp() {
        kolProp++;
        kolPpop = Integer.toString(kolProp);
        TextView T15 = (TextView) findViewById(R.id.textView24);
        T15.setText(kolPpop);
    }

    int i=0;
    int j=0;
    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raven);

        //С этой функции начинается приложение после запуска
        MU();
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:
                i=1;
                if (prOtv > prOtv1) {
                    OKр();
                }
                else {OKnp();}
                break;
            case R.id.button2:
                j=1;
                if (prOtv < prOtv1) {
                    OKр();
                } else {
                    OKnp();
                }
                break;

            case R.id.button3:
                k=1;
                if (prOtv == prOtv1) {
                    OKр();
                } else {
                    OKnp();
                }
                break;

            case R.id.button4:
                if(i!=1&j!=1&k!=1){KolProp();}
                i=0;
                j=0;
                k=0;
                next();
                TextView T19 = (TextView) findViewById(R.id.textView19);
                T19.setText("                     ");
                TextView T14 = (TextView) findViewById(R.id.textView14);
                T14.setText("");
                TextView T20 = (TextView) findViewById(R.id.textView20);
                T20.setText("");
                TextView T21 = (TextView) findViewById(R.id.textView21);
                T21.setText("");
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
            fin = openFileInput(FILE_NAME11);
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

            fin2 = openFileInput(FILE_NAME12);
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

            fin2a = openFileInput(FILE_NAME12a);
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
            fos = openFileOutput(FILE_NAME11, MODE_PRIVATE);
            fos.write(sss.getBytes());
            Toast.makeText(this, "Результат сохранен",Toast.LENGTH_SHORT).show();
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
            fos2 = openFileOutput(FILE_NAME12, MODE_PRIVATE);
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
            fos2a = openFileOutput(FILE_NAME12a, MODE_PRIVATE);
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




