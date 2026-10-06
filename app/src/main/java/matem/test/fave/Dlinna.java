package matem.test.fave;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import matem.test.fave.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Dlinna extends AppCompatActivity {
    private final static String FILE_NAME13 = "PrDlinna.txt";
    private final static String FILE_NAME14 = "NeDlinna.txt";
    private final static String FILE_NAME14a = "PropDlinna.txt";

    public void O() {
        TextView t10 = (TextView) findViewById(R.id.textView9);
        t10.setText("   ");
        TextView t11 = (TextView) findViewById(R.id.textView14);
        t11.setText("   ");
    }

    //Функция рандромных чисел и решение примеров
    public void Ran()

    //Получение рандромных чисел и их вывод в пример
    //Рандромное число минимум 1,макс 10
    {
        Random a = new Random();
        int odin = a.nextInt(10)+1;
        s1 = Integer.toString(odin);
        TextView t1 = (TextView) findViewById(R.id.textView1);
        t1.setText(s1);

        Random b = new Random();
        int tri = b.nextInt(10)+1;
        s3 = Integer.toString(tri);
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText(s3);

        //Получение первого числа
        tv1=Integer.parseInt(s1);
        //Первое число *10 для перевода в дм
        ch1=tv1*10;
        //Получение  третьего числа
        ch2=Integer.parseInt(s3);
        po=ch1+ch2;
        po1=Integer.toString(po);
    }

    String s1;
    String s3;
    int ch1;
    String ch11;
    int ch2;
    String ch22;
    int tv1;

    //Правельный ответ
    int po;
    String po1;
    //Правельный ответ
    int Po;

    Button b1;
    Button b2;
    Button b3;

    //Для букв(см,мм)
    TextView t2;
    TextView t4;
    TextView t6;

    //Неправильный ответ
    int nPo;

    //Получение числа из кнопки
    int polCh;

    //Вывод чисел и букв(см,мм) в ТехтВью1,2,3,4,6 и вычисление неправельных ответов
    //Вывод неправельных ответов на кнопки
    public void MDm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("м");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("дм");
        t6=(TextView)findViewById(R.id.textView6);
        t6.setText("дм");

        //Вставка правильного ответа в кнопку
        Po=Integer.parseInt(po1);
        b1=(Button)findViewById(R.id.button);
        b1.setText(po1);

        //Получение первого неправильного ответа
        nPo=Po+5;
//Вставка первого неправильного ответа в кнопку
        String vnPo1=Integer.toString(nPo);
        b2=(Button)findViewById(R.id.button2);
        b2.setText(vnPo1);
        //Получение второго неправильного ответа
        nPo=Po-3;
        //Вставка второго неправильного ответа в кнопку
        String vnPo2=Integer.toString(nPo);
        b3=(Button)findViewById(R.id.button3);
        b3.setText(vnPo2);
    }

    public void DmCm()
    {Ran();
        O();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("дм");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("см");
        t6=(TextView)findViewById(R.id.textView6);
        t6.setText("см");

        //Вставка правильного ответа в кнопку
        Po=Integer.parseInt(po1);
        b3=(Button)findViewById(R.id.button3);
        b3.setText(po1);

        //Получение первого неправильного ответа
        nPo=Po-5;
//Вставка первого неправильного ответа в кнопку
        String vnPo1=Integer.toString(nPo);
        b2=(Button)findViewById(R.id.button2);
        b2.setText(vnPo1);
        //Получение второго неправильного ответа
        nPo=Po-3;
        //Вставка второго неправильного ответа в кнопку
        String vnPo2=Integer.toString(nPo);
        b1=(Button)findViewById(R.id.button);
        b1.setText(vnPo2);
    }

    public void CmMm()
    {Ran();
        t2=(TextView)findViewById(R.id.textView2);
        t2.setText("cм");
        t4=(TextView)findViewById(R.id.textView4);
        t4.setText("мм");
        t6=(TextView)findViewById(R.id.textView6);
        t6.setText("мм");

        //Вставка правильного ответа в кнопку
        Po=Integer.parseInt(po1);
        b2=(Button)findViewById(R.id.button2);
        b2.setText(po1);
        //Получение первого неправильного ответа
        nPo=Po+3;
//Вставка первого неправильного ответа в кнопку
        String vnPo1=Integer.toString(nPo);
        b1=(Button)findViewById(R.id.button);
        b1.setText(vnPo1);

        //Получение второго неправильного ответа
        nPo=Po+6;
        //Вставка второго неправильного ответа в кнопку
        String vnPo2=Integer.toString(nPo);
        b3=(Button)findViewById(R.id.button3);
        b3.setText(vnPo2);}

    //Начальная переменная для функчии next()
    int x=0;
    //Чередование функций вывода чисел и знаков
    public void next()
    {
        x++;
        switch (x)
        { case 1:
            DmCm();
            break;
            case 2:
                CmMm();
                break;
            case 3:
                MDm();
                break;
        }
        if(x>2)
        {x=0;}

    }

    //Колличество правельных и неправельных ответов
    int kolPr=0;
    int kolNpr=0;
    String kolP;
    String kolNp;

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
        T14.setText("  Правильный ответ   "+po+"  "+t6.getText());
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
        TextView T17 = (TextView) findViewById(R.id.textView17);
        T17.setText( kolPpop);
    }

    int i=0;
    int j=0;
    int k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dlinna);
        //С этой функции начинается страница после запуска
        DmCm();
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button:
                i=1;
                //Получение числа из кнопки
                polCh = Integer.parseInt("" + b1.getText());
                if (polCh == Po) {
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
                //Получение числа из кнопки
                polCh = Integer.parseInt("" + b2.getText());

                if (polCh == Po) {
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
                //Получение числа из кнопки
                polCh = Integer.parseInt("" + b3.getText());

                if (polCh == Po) {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("  ПРАВИЛЬНО");
                    T9.setTextColor(Color.GREEN);
                    KolPr();
                    PO();
                    ZapNa();
                } else {
                    TextView T9 = (TextView) findViewById(R.id.textView9);
                    T9.setText("НЕПРАВИЛЬНО");
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
                break;}
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
            fin = openFileInput(FILE_NAME13);
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

            fin2 = openFileInput(FILE_NAME14);
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

            fin2a = openFileInput(FILE_NAME14a);
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
            fos = openFileOutput(FILE_NAME13, MODE_PRIVATE);
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
            fos2 = openFileOutput(FILE_NAME14, MODE_PRIVATE);
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
            fos2a = openFileOutput(FILE_NAME14a, MODE_PRIVATE);
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



