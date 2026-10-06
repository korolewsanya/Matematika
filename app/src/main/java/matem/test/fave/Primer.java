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

public class Primer extends AppCompatActivity {

    private final static String FILE_NAME9 = "PrPrimer.txt";
    private final static String FILE_NAME10 = "NePrimer.txt";
    private final static String FILE_NAME10a = "PropPrimer.txt";

    public void O() {
        TextView t10 = (TextView) findViewById(R.id.textView9);
        t10.setText("   ");
        TextView t11 = (TextView) findViewById(R.id.textView14);
        t11.setText("   ");
    }

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

//Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s3);
        int ch5 = Integer.parseInt(s5);

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
    }

    //Переменные для RanD1 и RanD2
    int r1;
    int r2;
    int r3;
    int a;
    int b;
    int c;
    int z;


    //Рандромная функция для деления в конце
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
        sum33 = Integer.toString(sum3);
    }

    //Рандромная функция для деления вначале
    public void RanD2(){

        Random od = new Random();
        r1 = od.nextInt(90)+10;
        Random dv = new Random();
        r2 = dv.nextInt(10)+1;
        Random tr = new Random();
        r3 = tr.nextInt(10)+1;
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

    //Функция рандромных чисел и решение примеров со скобкой\минус впереди
    public void RanM()

    //Получение рандромных чисел и их вывод в пример
    {
        Random a = new Random();
        int odin = a.nextInt(90)+2;
        String s1 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);

        Random b = new Random();
        int tri = b.nextInt(10);
        String s3 = Integer.toString(tri);
        TextView t3 = (TextView) findViewById(R.id.textView4);
        t3.setText(s3);

        Random c = new Random();
        int pat = c.nextInt(10);
        String s5 = Integer.toString(pat);
        TextView t5 = (TextView) findViewById(R.id.textView6);
        t5.setText(s5);

//Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s3);
        int ch5 = Integer.parseInt(s5);

// Решение примеров и преобразование ответов в строку
        int sum1 = ch1 -(ch3 + ch5);
        sum11 = Integer.toString(sum1);
    }

    //Функция рандромных чисел и решение примеров со скобкой\* впереди
    public void RanU()

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
        TextView t3 = (TextView) findViewById(R.id.textView4);
        t3.setText(s3);

        Random c = new Random();
        int pat = c.nextInt(10);
        String s5 = Integer.toString(pat);
        TextView t5 = (TextView) findViewById(R.id.textView6);
        t5.setText(s5);

//Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s3);
        int ch5 = Integer.parseInt(s5);

// Решение примеров и преобразование ответов в строку
        int sum1 = ch1*(ch3 - ch5);
        sum11 = Integer.toString(sum1);
        int sum2 = ch1*(ch3 + ch5);
        sum22 = Integer.toString(sum2);
    }

    //Функция рандромных чисел и решение примеров со скобкой\ впереди
    public void RanR()
    //Получение рандромных чисел и их вывод в пример
    {
        Random od = new Random();
        r1 = od.nextInt(100);
        Random dv = new Random();
        r2 = dv.nextInt(10)+1;
        Random tr = new Random();
        r3 = tr.nextInt(10);

        z=r2-r3;
        if (z==0){RanR();}
        c=r1%z;
        if (c>0){RanR();}
        String s1=Integer.toString(r1);
        String s2=Integer.toString(r2);
        String s3=Integer.toString(r3);

        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);
        TextView t3 = (TextView) findViewById(R.id.textView4);
        t3.setText(s2);
        TextView t5 = (TextView) findViewById(R.id.textView6);
        t5.setText(s3);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s2);
        int ch5 = Integer.parseInt(s3);

        // Решение примеров и преобразование ответов в строку
        int sum1 = ch1/(ch3 - ch5);
        sum11 = Integer.toString(sum1);
    }

    //Функция рандромных чисел и решение примеров со скобкой\ впереди
    public void RanR2()

    //Получение рандромных чисел и их вывод в пример
    {
        Random od = new Random();
        r1 = od.nextInt(100);
        Random dv = new Random();
        r2 = dv.nextInt(10)+1;
        Random tr = new Random();
        r3 = tr.nextInt(10);

        z=r2+r3;
        c=r1%z;
        if (c>0){RanR2();}
        String s1=Integer.toString(r1);
        String s2=Integer.toString(r2);
        String s3=Integer.toString(r3);

        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);
        TextView t3 = (TextView) findViewById(R.id.textView4);
        t3.setText(s2);
        TextView t5 = (TextView) findViewById(R.id.textView6);
        t5.setText(s3);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s2);
        int ch5 = Integer.parseInt(s3);

        // Решение примеров и преобразование ответов в строку
        int sum2 = ch1/(ch3 + ch5);
        sum22 = Integer.toString(sum2);
    }

    //Функция рандромных чисел и решение примеров со скобкой
    public void RanRz()

    //Получение рандромных чисел и их вывод в пример
    {
        Random od = new Random();
        r1 = od.nextInt(100);
        Random dv = new Random();
        r2 = dv.nextInt(10);
        Random tr = new Random();
        r3 = tr.nextInt(10)+1;

        z=r1-r2;
        c=z%r3;
        if (c>0){RanRz();}
        String s1=Integer.toString(r1);
        String s2=Integer.toString(r2);
        String s3=Integer.toString(r3);

        TextView t1 = (TextView) findViewById(R.id.textView2);
        t1.setText(s1);
        TextView t3 = (TextView) findViewById(R.id.textView4);
        t3.setText(s2);
        TextView t5 = (TextView) findViewById(R.id.textView15);
        t5.setText(s3);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s2);
        int ch5 = Integer.parseInt(s3);

        // Решение примеров и преобразование ответов в строку
        int sum1 = (ch1-ch3)/ch5;
        sum11 = Integer.toString(sum1);
    }

    //Функция рандромных чисел и решение примеров со скобкой
    public void RanRz2()

    //Получение рандромных чисел и их вывод в пример
    {
        Random od = new Random();
        r1 = od.nextInt(100);
        Random dv = new Random();
        r2 = dv.nextInt(10);
        Random tr = new Random();
        r3 = tr.nextInt(10)+1;

        z=r1+r2;
        c=z%r3;
        if (c>0){RanRz2();}
        String s1=Integer.toString(r1);
        String s2=Integer.toString(r2);
        String s3=Integer.toString(r3);

        TextView t1 = (TextView) findViewById(R.id.textView2);
        t1.setText(s1);
        TextView t3 = (TextView) findViewById(R.id.textView4);
        t3.setText(s2);
        TextView t5 = (TextView) findViewById(R.id.textView15);
        t5.setText(s3);

        //Преобразования строковых чисел из примера в обычные числа
        int ch1 = Integer.parseInt(s1);
        int ch3 = Integer.parseInt(s2);
        int ch5 = Integer.parseInt(s3);

        // Решение примеров и преобразование ответов в строку
        int sum2 = (ch1+ch3)/ch5;
        sum22 = Integer.toString(sum2);
    }

    //Переменные для Правельных и неправильных ответов
    int prOtv;
    int nepOtv;
    //Полученное число из любой кнопки
    int polCh;
    //Начальная переменная для функчии next()
    int x=0;
    //Колличество правельных и неправельных ответов
    int kolPr=0;
    int kolNpr=0;
    //Перевод правельных и неправельных ответов в строку
    String kolP;
    String kolNp;
    //  преобразование ответов в строку
    String sum11;
    String sum22;
    String sum33;
    String sum44;
    String sum55;
    String sum66;
    String sum77;
    String sum88;

    Button b1;
    Button b2;
    Button b3;

    //Для знаков(+,-)
    TextView tv2;
    TextView tv4;
    TextView tv3;
    TextView tv15;
    TextView tv5;
    TextView tv1;

    //Удаление текста из 6 и 15тв
    public void Ud()
    {TextView t1 = (TextView) findViewById(R.id.textView6);
        t1.setText("");
        TextView t3 = (TextView) findViewById(R.id.textView15);
        t3.setText("=");}

    //Вывод чисел и знаков в ТехтВью1,2,3,4,5 и вычисление неправельных ответов
    //Вывод неправельных ответов на кнопки

    public void M()
    {RanM();

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv5 = (TextView) findViewById(R.id.textView5);
        tv5.setText("+");
        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("(");
        tv15 = (TextView) findViewById(R.id.textView15);
        tv15.setText(")");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv + 5;
        String st1 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 +10;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0)
        {M();}}

    public void U()
    {RanU();

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv5 = (TextView) findViewById(R.id.textView5);
        tv5.setText("-");
        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("(");
        tv15 = (TextView) findViewById(R.id.textView15);
        tv15.setText(")");
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv - 2;
        String st1 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 -4;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0)
        {U();}}

    public void U1()
    {RanU();

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv5 = (TextView) findViewById(R.id.textView5);
        tv5.setText("+");
        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("(");
        tv15 = (TextView) findViewById(R.id.textView15);
        tv15.setText(")");
        int sm11 = Integer.parseInt(sum22);
        nepOtv = sm11 -4;
        String st11 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st11);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(sum22);
        prOtv = Integer.parseInt(sum22);
        nepOtv = prOtv + 2;
        String st1 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st1);

        if(prOtv<0|nepOtv<0)
        {U1();}}

    public void R()
    {RanR();

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv5 = (TextView) findViewById(R.id.textView5);
        tv5.setText("-");
        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("(");
        tv15 = (TextView) findViewById(R.id.textView15);
        tv15.setText(")");
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv + 15;
        String st1 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 +10;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0)
        {R();}}

    public void R1()
    {RanR2();

        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv5 = (TextView) findViewById(R.id.textView5);
        tv5.setText("+");
        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("(");
        tv15 = (TextView) findViewById(R.id.textView15);
        tv15.setText(")");
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(sum22);
        prOtv = Integer.parseInt(sum22);
        nepOtv = prOtv -1;
        String st1 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st1);
        int sm11 = Integer.parseInt(sum22);
        nepOtv = sm11 +10;
        String st11 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st11);
        if(prOtv<0|nepOtv<0)
        {R1();}}

    public void Rz()
    {RanRz();

        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("-");
        tv5 = (TextView) findViewById(R.id.textView6);
        tv5.setText(":");
        tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText("(");
        tv15 = (TextView) findViewById(R.id.textView5);
        tv15.setText(")");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv - 2;
        String st1 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 -4;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0)
        {Rz();}}

    public void Rz1()
    {RanRz2();

        tv3 = (TextView) findViewById(R.id.textView3);
        tv3.setText("+");
        tv5 = (TextView) findViewById(R.id.textView6);
        tv5.setText(":");
        tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText("(");
        tv15 = (TextView) findViewById(R.id.textView5);
        tv15.setText(")");
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum22);
        prOtv = Integer.parseInt(sum22);
        nepOtv = prOtv - 2;
        String st1 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st1);
        int sm11 = Integer.parseInt(sum22);
        nepOtv = sm11 -4;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0)
        {Rz1();}}

    public void UR()
    {RanD1();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(":");
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv + 5;
        String st1 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 - 3;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0|prOtv>100)
        {UR();}}

    public void UP()
    {
        Ran();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv + 5;
        String st1 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 - 3;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0)
        {UP();}}

    public void UM()
    {Ran();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("*");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        Ran();
        b1 = (Button) findViewById(R.id.button);
        int sm22 = Integer.parseInt(sum22);
        nepOtv = sm22 - 1;
        String st22 = Integer.toString(nepOtv);
        b1.setText(st22);
        prOtv = Integer.parseInt(sum22);
        nepOtv = prOtv + 5;
        String st2 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(sum22);
        if(prOtv<0|nepOtv<0)
        {UM();}  }

    public void PU()
    {Ran();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("*");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum33);
        prOtv = Integer.parseInt(sum33);
        nepOtv = prOtv - 4;
        String st3 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st3);
        int sm33 = Integer.parseInt(sum33);
        nepOtv = sm33 - 2;
        String st33 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st33);
        if(prOtv<0|nepOtv<0)
        {PU();}  }

    public void PR()
    {RanD1();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(":");
        b1 = (Button) findViewById(R.id.button);
        int sm22 = Integer.parseInt(sum22);
        nepOtv = sm22 - 1;
        String st22 = Integer.toString(nepOtv);
        b1.setText(st22);
        prOtv = Integer.parseInt(sum22);
        nepOtv = prOtv + 5;
        String st2 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(sum22);
        if(prOtv<0|nepOtv<0)
        {PR();}  }

    public void PP()
    {Ran();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        prOtv = Integer.parseInt(sum44);
        nepOtv = prOtv + 3;
        String st4 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st4);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum44);
        int sm44 = Integer.parseInt(sum44);
        nepOtv = sm44 -2;
        String st44 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st44);
        if(prOtv<0|nepOtv<0)
        {PP();} }

    public void PM()
    {Ran();
        O();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("+");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        prOtv = Integer.parseInt(sum55);
        nepOtv = prOtv + 6;
        String st5 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st5);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum55);
        int sm55 = Integer.parseInt(sum55);
        nepOtv = sm55 +3;
        String st55 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st55);
        if(prOtv<0|nepOtv<0)
        {PM();} }

    public void MU()
    {Ran();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("*");
        int sm66 = Integer.parseInt(sum66);
        nepOtv = sm66 +7;
        String st66 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st66);
        prOtv = Integer.parseInt(sum66);
        nepOtv = prOtv + 5;
        String st6 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st6);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(sum66);
        if(prOtv<0|nepOtv<0)
        {MU();}  }

    public void MR()
    {RanD1();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText(":");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum33);
        prOtv = Integer.parseInt(sum33);
        nepOtv = prOtv + 4;
        String st3 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st3);
        int sm33 = Integer.parseInt(sum33);
        nepOtv = sm33 + 2;
        String st33 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st33);
        if(prOtv<0|nepOtv<0)
        {MR();}  }

    public void MP()
    {Ran();
        Ud();
        tv2= (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum77);
        prOtv = Integer.parseInt(sum77);
        nepOtv = prOtv + 4;
        String st7 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st7);
        int sm77 = Integer.parseInt(sum77);
        nepOtv = sm77 +1;
        String st77 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st77);
        if(prOtv<0|nepOtv<0)
        {MP();} }

    public void MM()
    {Ran();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText("-");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        prOtv = Integer.parseInt(sum88);
        nepOtv = prOtv + 5;
        String st8 = Integer.toString(nepOtv);
        b1 = (Button) findViewById(R.id.button);
        b1.setText(st8);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(sum88);
        int sm88 = Integer.parseInt(sum88);
        nepOtv = sm88+ 8;
        String st88 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st88);
        if(prOtv<0|nepOtv<0)
        {MM();}
    }

    public void RU()
    {RanD2();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("*");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum11);
        prOtv = Integer.parseInt(sum11);
        nepOtv = prOtv + 5;
        String st1 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st1);
        int sm11 = Integer.parseInt(sum11);
        nepOtv = sm11 - 3;
        String st11 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st11);
        if(prOtv<0|nepOtv<0|prOtv>80)
        {RU();}}

    public void RP()
    {RanD2();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("+");
        b1 = (Button) findViewById(R.id.button);
        int sm22 = Integer.parseInt(sum22);
        nepOtv = sm22 - 1;
        String st22 = Integer.toString(nepOtv);
        b1.setText(st22);
        prOtv = Integer.parseInt(sum22);
        nepOtv = prOtv + 5;
        String st2 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st2);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(sum22);
        if(prOtv<0|nepOtv<0)
        {RP();}  }

    public void RM()
    {RanD2();
        Ud();
        tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(":");
        tv4 = (TextView) findViewById(R.id.textView4);
        tv4.setText("-");
        b1 = (Button) findViewById(R.id.button);
        b1.setText(sum33);
        prOtv = Integer.parseInt(sum33);
        nepOtv = prOtv - 4;
        String st3 = Integer.toString(nepOtv);
        b2 = (Button) findViewById(R.id.button2);
        b2.setText(st3);
        int sm33 = Integer.parseInt(sum33);
        nepOtv = sm33 - 2;
        String st33 = Integer.toString(nepOtv);
        b3 = (Button) findViewById(R.id.button3);
        b3.setText(st33);
        if(prOtv<0|nepOtv<0)
        {RM();}  }

    //Чередование функций вывода чисел и знаков
    public void next()
    {
        x++;
        switch (x)
        { case 1:
            UP();
            break;
            case 2:
                UM();
                break;
            case 3:
                PU();
                break;
            case 4:
                RU();
                break;
            case 5:
                PM();
                break;
            case 6:
                MU();
                break;
            case 7:
                RP();
                break;
            case 8:
                MM();
                break;
            case 9:
                UR();
                break;
            case 10:
                PR();
                break;
            case 11:
                MR();
                break;
            case 12:
                PP();
                break;
            case 13:
                MP();
                break;
            case 14:
                RM();
                break;
            case 15:
                M();
                break;
            case 16:
                R();
                break;
            case 17:
                R1();
                break;
            case 18:
                U();
                break;
            case 19:
                U1();
                break;
            case 20:
                Rz();
                break;
            case 21:
                Rz1();
                break;
        }
        if(x>20)
        {x=0;}
    }

    //Подсчет правельных ответов
    public void KolPr()
    { kolPr++;
        kolP=Integer.toString(kolPr);
        TextView T12 = (TextView) findViewById(R.id.textView12);
        T12.setText(kolP);}

    //Подсчет неправельных ответов
    public void  KolNpr()
    {kolNpr++;
        kolNp=Integer.toString(kolNpr);
        TextView T13 = (TextView) findViewById(R.id.textView13);
        T13.setText(kolNp);}

    //Присвоение техтВью правельного ответа
    public void PO()
    {TextView T14=(TextView) findViewById(R.id.textView14);
        T14.setText("  Правильный ответ   "+prOtv);
        T14.setTextColor(Color.MAGENTA);}

    //Запрет нажатия кнопок
    public void ZapNa()
    {Button b=(Button)findViewById(R.id.button);
        b.setClickable(false);
        Button b2=(Button)findViewById(R.id.button2);
        b2.setClickable(false);
        Button b3=(Button)findViewById(R.id.button3);
        b3.setClickable(false);}

    //Разрешение нажатия кнопок
    public void RazNa()
    {Button b=(Button)findViewById(R.id.button);
        b.setClickable(true);
        Button b2=(Button)findViewById(R.id.button2);
        b2.setClickable(true);
        Button b3=(Button)findViewById(R.id.button3);
        b3.setClickable(true);}

    //Кол-во прощенных
    int kolProp=0;
    String kolPpop;

    //Подсчет пропущенных
    public void KolProp() {
        kolProp++;
        kolPpop = Integer.toString(kolProp);
        TextView T18 = (TextView) findViewById(R.id.textView18);
        T18.setText( kolPpop);
    }

    int i=0;
    int j=0;
    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primer);
//С этой функции начинается приложение после запуска
        PM();
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                i=1;
                //Получение числа из кнопки
                polCh = Integer.parseInt("" + b1.getText());
                if (polCh == prOtv) {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    PO();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  НЕПРАВИЛЬНО");
                    T9.setTextColor(Color.RED);
                    KolNpr();
                    PO();
                    ZapNa();
                }
                break;

            case R.id.button2:
                j=1;
                polCh = Integer.parseInt("" + b2.getText());
                if (polCh == prOtv) {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    PO();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  НЕПРАВИЛЬНО");
                    T9.setTextColor(Color.RED);
                    KolNpr();
                    PO();
                    ZapNa();
                }
                break;

            case R.id.button3:
                k=1;
                polCh = Integer.parseInt("" + b3.getText());
                if (polCh == prOtv) {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    PO();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  НЕПРАВИЛЬНО");
                    T9.setTextColor(Color.RED);
                    KolNpr();
                    PO();
                    ZapNa();
                }
                break;

            case R.id.button4:
                if(i!=1&j!=1&k!=1){KolProp();}
                i=0;
                j=0;
                k=0;
                next();
                TextView T9 = (TextView) findViewById(R.id.textView9);
                T9.setText("                     ");
                TextView T14 = (TextView) findViewById(R.id.textView14);
                T14.setText("");
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
            fin = openFileInput(FILE_NAME9);
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

            fin2 = openFileInput(FILE_NAME10);
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

            fin2a = openFileInput(FILE_NAME10a);
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
            fos = openFileOutput(FILE_NAME9, MODE_PRIVATE);
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
            fos2 = openFileOutput(FILE_NAME10, MODE_PRIVATE);
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
            fos2a = openFileOutput(FILE_NAME10a, MODE_PRIVATE);
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


