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

public class SravDlin extends AppCompatActivity {

    private final static String FILE_NAME15 = "PrSravDlin.txt";
    private final static String FILE_NAME16 = "NeSravDlin.txt";
    private final static String FILE_NAME16a = "PropSravDlin.txt";

    String s1;
    String s3;
    String s6;
    String s8;
    int ch1;
    int ch2;
    int ch6;
    int ch8;
    int tv1;
    int tv3;
    int tv6;
    int tv8;

    int ch3;
    int ch4;
    int tv2;

    //Первый Правельный ответ
    int po;
    String po1;

    //Второй правильный ответ
    int po2;
    String po22;

    int x=0;
    //Функция рандромных чисел и решение примеров
    public void Ran()

    //Получение рандромных чисел и их вывод в пример
    //Рандромное число минимум 1,макс 10
    {
        Random a = new Random();
        int odin = a.nextInt(9)+1;
        s1 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);

        Random b = new Random();
        int tri = b.nextInt(9)+1;
        s3 = Integer.toString(tri);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(s3);

        //Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *10 для перевода в дм
        ch1=tv1*10;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        //Получение правильного ответа
        po=ch1+tv3;
        //Перевод правильного ответа в строку
        po1=Integer.toString(po);

        Random c = new Random();
        int sh = c.nextInt(9)+1;
        s6 = Integer.toString(sh);
        TextView t6 = (TextView) findViewById(R.id.textView6);
        t6.setText(s6);

        Random d = new Random();
        int w = d.nextInt(9)+1;
        s8 = Integer.toString(w);
        TextView t8 = (TextView) findViewById(R.id.textView8);
        t8.setText(s8);

        //Получение шестого числа
        tv2=Integer.parseInt(s6);
        //Первое число *10 для перевода в дм
        ch3=tv2*10;
        //Получение  восьмого числа
        ch4=Integer.parseInt(s8);
        //Получение правильного ответа
        po2=ch3+ch4;
        //Перевод правильного ответа в строку
        po22=Integer.toString(po2);  }

    //Вывод знаков в кнопки
    public void Znaki() {
        Button b1 = (Button) findViewById(R.id.button);
        b1.setText(">");
        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText("<");
        Button b3 = (Button) findViewById(R.id.button3);
        b3.setText("=");
    }

    //Для букв(см,мм)
    TextView t2;
    TextView t4;
    TextView t7;
    TextView t9;
    TextView t12;
    TextView t13;

    public void MDm_MDm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("м");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("дм");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("м");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("дм");
        CO();
        Znaki();}

    public void MDm_DmCm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("м");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("дм");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("дм");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("см");
//Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *100 для перевода в см
        ch1=tv1*100;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        ch3=tv3*10;
        //Получение правильного ответа
        po=ch1+ch3;
        //Получение шестого числа
        tv6=Integer.parseInt(s6);
        //шестое число *10 для перевода в см
        ch6=tv6*10;
        //Получение  третьего числа
        tv8=Integer.parseInt(s8);
        ch8=tv8;
        //Получение правильного ответа
        po2=ch6+ch8;
        CO();
        Znaki();}

    public void MDm_CmMm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("м");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("дм");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("см");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("мм");
//Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *1000 для перевода в мм
        ch1=tv1*1000;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        ch3=tv3*100;
        //Получение правильного ответа
        po=ch1+ch3;
        //Получение шестого числа
        tv6=Integer.parseInt(s6);
        //шестое число *10 для перевода в мм
        ch6=tv6*10;
        //Получение  восьмого числа
        tv8=Integer.parseInt(s8);
        ch8=tv8;
        //Получение правильного ответа
        po2=ch6+ch8;
        CO();
        Znaki();
    }

    public void DmCm_MDm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("дм");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("см");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("м");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("дм");
//Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *10 для перевода в см
        ch1=tv1*10;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        ch3=tv3;
        //Получение правильного ответа
        po=ch1+ch3;
        //Получение шестого числа
        tv6=Integer.parseInt(s6);
        //шестое число *100 для перевода в см
        ch6=tv6*100;
        //Получение  восьмого числа
        tv8=Integer.parseInt(s8);
        ch8=tv8*10;
        //Получение правильного ответа
        po2=ch6+ch8;
        CO();
        Znaki();
    }

    public void DmCm_DmCm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("дм");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("см");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("дм");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("см");
        CO();
        Znaki();
    }

    public void DmCm_CmMm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("дм");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("см");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("см");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("мм");
//Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *100 для перевода в мм
        ch1=tv1*100;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        ch3=tv3*10;
        //Получение правильного ответа
        po=ch1+ch3;
        //Получение шестого числа
        tv6=Integer.parseInt(s6);
        //шестое число *10 для перевода в мм
        ch6=tv6*10;
        //Получение  восьмого числа
        tv8=Integer.parseInt(s8);
        ch8=tv8;
        //Получение правильного ответа
        po2=ch6+ch8;
        CO();
        Znaki();
    }

    public void CmMm_MDm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("см");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("мм");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("м");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("дм");
//Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *10 для перевода в мм
        ch1=tv1*10;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        ch3=tv3;
        //Получение правильного ответа
        po=ch1+ch3;
        //Получение шестого числа
        tv6=Integer.parseInt(s6);
        //шестое число *1000 для перевода в мм
        ch6=tv6*1000;
        //Получение  восьмого числа
        tv8=Integer.parseInt(s8);
        ch8=tv8*100;
        //Получение правильного ответа
        po2=ch6+ch8;
        CO();
        Znaki();
    }

    public void CmMm_DmCm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("см");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("мм");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("дм");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("см");
//Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *10 для перевода в мм
        ch1=tv1*10;
        //Получение  третьего числа
        tv3=Integer.parseInt(s3);
        ch3=tv3;
        //Получение правильного ответа
        po=ch1+ch3;
        //Получение шестого числа
        tv6=Integer.parseInt(s6);
        //шестое число *100 для перевода в см
        ch6=tv6*100;
        //Получение  восьмого числа
        tv8=Integer.parseInt(s8);
        ch8=tv8*10;
        //Получение правильного ответа
        po2=ch6+ch8;
        CO();
        Znaki();
    }

    public void CmMm_CmMm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("см");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("мм");
        t7=(TextView)findViewById(R.id.textView7);
        t7.setText("см");
        t9=(TextView)findViewById(R.id.textView9);
        t9.setText("мм");
        CO();
        Znaki();
    }

    //Присвоение техтВью правельного ответа
    public void PO() {
        t13 = (TextView) findViewById(R.id.textView13);
        t13.setText("  Правильный ответ");
        t13.setTextColor(Color.MAGENTA);
    }

    //Првавельный знак
    String prZn;
    //Сравнение ответов
    public void CO() {
        if ( po> po2) {
            prZn = ">";
        } else if (po < po2) {
            prZn = "<";
        } else {
            prZn = "=";
        }
    }

    //Колличество правельных и неправельных ответов
    int kolPr = 0;
    int kolNpr = 0;

    //Перевод правельных и неправельных ответов в строку
    String kolP;
    String kolNp;

    //Подсчет правельных ответов
    public void KolPr() {
        kolPr++;
        kolP = Integer.toString(kolPr);
        TextView T16 = (TextView) findViewById(R.id.textView16);
        T16.setText(kolP);
    }

    //Подсчет неправельных ответов
    public void KolNpr() {
        kolNpr++;
        kolNp = Integer.toString(kolNpr);
        TextView T17 = (TextView) findViewById(R.id.textView17);
        T17.setText(kolNp);
    }

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

    //Обработка кнопок при правельном ответе
    public void OKр() {
        t12 = (TextView) findViewById(R.id.textView12);
        t12.setText("  ПРАВИЛЬНО");
        t12.setTextColor(Color.GREEN);
        PO();
        KolPr();
        ZapNa();
        VprZn();
    }

    //Обработка кнопок при неправельном ответе
    public  void OKnp()
    {
        t12 = (TextView) findViewById(R.id.textView12);
        t12.setText("  НЕПРАВИЛЬНО");
        t12.setTextColor(Color.RED);
        PO();
        KolNpr();
        ZapNa();
        VprZn();;
    }

    //Чередование функций вывода чисел и знаков
    public void next() {
        x++;
        switch (x) {
            case 1:
                MDm_MDm();
                break;
            case 2:
                MDm_DmCm();
                break;
            case 3:
                MDm_CmMm();
                break;
            case 4:
                DmCm_MDm();
                break;
            case 5:
                DmCm_DmCm();
                break;
            case 6:
                DmCm_CmMm();
                break;
            case 7:
                CmMm_MDm();
                break;
            case 8:
                CmMm_DmCm();
                break;
            case 9:
                CmMm_CmMm();
                break;
        }
        if (x > 8) {
            x = 0;
        }
    }

    //Вывод правельного знака
    public void VprZn()
    {TextView T20=(TextView)findViewById(R.id.textView18);
        T20.setText(prZn);
        T20.setTextColor(Color.BLACK);}

    //Кол-во прощенных
    int kolProp=0;
    String kolPpop;

    //Подсчет пропущенных
    public void KolProp() {
        kolProp++;
        kolPpop = Integer.toString(kolProp);
        TextView T21 = (TextView) findViewById(R.id.textView21);
        T21.setText( kolPpop);
    }

    int i=0;
    int j=0;
    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.srav_dlin);

        //С этой функции начинается страница после запуска
        MDm_MDm();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                i=1;
                if (po > po2) {
                    OKр();
                }
                else {OKnp();}
                break;
            case R.id.button2:
                j=1;
                if (po < po2) {
                    OKр();
                } else {
                    OKnp();
                }
                break;
            case R.id.button3:
                k=1;
                if (po == po2) {
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
                TextView T12 = (TextView) findViewById(R.id.textView12);
                T12.setText("                     ");
                TextView T13 = (TextView) findViewById(R.id.textView13);
                T13.setText("");
                TextView T18 = (TextView) findViewById(R.id.textView18);
                T18.setText("");
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
            fin = openFileInput(FILE_NAME15);
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

            fin2 = openFileInput(FILE_NAME16);
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

            fin2a = openFileInput(FILE_NAME16a);
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
            fos = openFileOutput(FILE_NAME15, MODE_PRIVATE);
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
            fos2 = openFileOutput(FILE_NAME16, MODE_PRIVATE);
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
            fos2a = openFileOutput(FILE_NAME16a, MODE_PRIVATE);
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

