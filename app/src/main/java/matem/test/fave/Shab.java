package matem.test.fave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.IOException;

public class Shab extends AppCompatActivity {

    private final static String FILE_NAME = "PrWes.txt";
    private final static String FILE_NAME2 = "NeWes.txt";
    private final static String FILE_NAME2a = "PropWes.txt";
    private final static String FILE_NAME3 = "PrJid.txt";
    private final static String FILE_NAME4 = "NeJid.txt";
    private final static String FILE_NAME4a = "PropJid.txt";
    private final static String FILE_NAME5 = "PrVrem.txt";
    private final static String FILE_NAME6 = "NeVrem.txt";
    private final static String FILE_NAME6a = "PropVrem.txt";
    private final static String FILE_NAME7 = "PrVdlin.txt";
    private final static String FILE_NAME8 = "NeVdlin.txt";
    private final static String FILE_NAME8а = "PropVdlin.txt";
    private final static String FILE_NAME9 = "PrPrimer.txt";
    private final static String FILE_NAME10 = "NePrimer.txt";
    private final static String FILE_NAME10a = "PropPrimer.txt";
    private final static String FILE_NAME11 = "PrRaven.txt";
    private final static String FILE_NAME12 = "NeRaven.txt";
    private final static String FILE_NAME12a = "PropRaven.txt";
    private final static String FILE_NAME13 = "PrDlinna.txt";
    private final static String FILE_NAME14 = "NeDlinna.txt";
    private final static String FILE_NAME14a = "PropDlinna.txt";
    private final static String FILE_NAME15 = "PrSravDlin.txt";
    private final static String FILE_NAME16 = "NeSravDlin.txt";
    private final static String FILE_NAME16a = "PropSravDlin.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shab);

        //Запрет поворота экрана
        setRequestedOrientation(
                ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

// ВЕС открытие файла(правильные ответы)

        FileInputStream fin = null;
        TextView textView = (TextView) findViewById(R.id.textView28);
        try {
            fin = openFileInput(FILE_NAME);
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            String text = new String (bytes);
            textView.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin!=null)
                    fin.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        // ВЕС открытие файла(неправильные ответы)
        FileInputStream fin2 = null;
        TextView textView2 = (TextView) findViewById(R.id.textView30);
        try {
            fin2 = openFileInput(FILE_NAME2);
            byte[] bytes = new byte[fin2.available()];
            fin2.read(bytes);
            String text2 = new String (bytes);
            textView2.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin2!=null)
                    fin2.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ВЕС открытие файла(пропущено)
        FileInputStream fin2a = null;
        TextView textView2a = (TextView) findViewById(R.id.textView32);
        try {
            fin2a = openFileInput(FILE_NAME2a);
            byte[] bytes = new byte[fin2a.available()];
            fin2a.read(bytes);
            String text2a = new String (bytes);
            textView2a.setText("  Пропущено- "+text2a);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin2a!=null)
                    fin2a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        //  ЖИДКОСТЬ открытие файла(правильные ответы)
        FileInputStream fin3 = null;
        TextView textView29 = (TextView) findViewById(R.id.textView29);
        try {
            fin3 = openFileInput(FILE_NAME3);
            byte[] bytes = new byte[fin3.available()];
            fin3.read(bytes);
            String text = new String (bytes);
            textView29.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin3!=null)
                    fin3.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        // ЖИДКОСТЬ открытие файла(неправильные ответы)

        FileInputStream fin4 = null;
        TextView textView31 = (TextView) findViewById(R.id.textView31);
        try {
            fin4 = openFileInput(FILE_NAME4);
            byte[] bytes = new byte[fin4.available()];
            fin4.read(bytes);
            String text2 = new String (bytes);
            textView31.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin4!=null)
                    fin4.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ЖИДКОСТЬ открытие файла(Пропущено)
        FileInputStream fin4a = null;
        TextView textView33 = (TextView) findViewById(R.id.textView33);
        try {
            fin4a = openFileInput(FILE_NAME4a);
            byte[] bytes = new byte[fin4a.available()];
            fin4a.read(bytes);
            String text2 = new String (bytes);
            textView33.setText("  Пропущено- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin4a!=null)
                    fin4a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        //  ВРЕМЯ открытие файла(правильные ответы)
        FileInputStream fin5 = null;
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        try {
            fin5 = openFileInput(FILE_NAME5);
            byte[] bytes = new byte[fin5.available()];
            fin5.read(bytes);
            String text = new String (bytes);
            textView21.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin5!=null)
                    fin5.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        // ВРЕМЯ открытие файла(неправильные ответы)
        FileInputStream fin6 = null;
        TextView textView23 = (TextView) findViewById(R.id.textView23);
        try {
            fin6 = openFileInput(FILE_NAME6);
            byte[] bytes = new byte[fin6.available()];
            fin6.read(bytes);
            String text2 = new String (bytes);
            textView23.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin6!=null)
                    fin6.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ВРЕМЯ открытие файла(Пропущено)
        FileInputStream fin6a = null;
        TextView textView25 = (TextView) findViewById(R.id.textView25);
        try {
            fin6a = openFileInput(FILE_NAME6a);
            byte[] bytes = new byte[fin6a.available()];
            fin6a.read(bytes);
            String text2 = new String (bytes);
            textView25.setText("  Пропущено- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin6a!=null)
                    fin6a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ВЫЧИСЛЕНИЕ ДЛИННЫ открытие файла(правильные ответы)
        FileInputStream fin7 = null;
        TextView textView13 = (TextView) findViewById(R.id.textView13);
        try {
            fin7 = openFileInput(FILE_NAME7);
            byte[] bytes = new byte[fin7.available()];
            fin7.read(bytes);
            String text = new String (bytes);
            textView13.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin7!=null)
                    fin7.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        // ВЫЧИСЛЕНИЕ ДЛЛИНЫ открытие файла(неправильные ответы)
        FileInputStream fin8 = null;
        TextView textView15 = (TextView) findViewById(R.id.textView15);
        try {
            fin8 = openFileInput(FILE_NAME8);
            byte[] bytes = new byte[fin8.available()];
            fin8.read(bytes);
            String text2 = new String (bytes);
            textView15.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin8!=null)
                    fin8.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// ВЫЧИСЛЕНИЕ ДЛИННЫ открытие файла(Пропущено)
        FileInputStream fin8a = null;
        TextView textView17 = (TextView) findViewById(R.id.textView17);
        try {
            fin8a = openFileInput(FILE_NAME8а);
            byte[] bytes = new byte[fin8a.available()];
            fin8a.read(bytes);
            String text2 = new String (bytes);
            textView17.setText("  Пропущено- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin8a!=null)
                    fin8a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ПРИМЕРЫ открытие файла(правильные ответы)
        FileInputStream fin9 = null;
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        try {
            fin9 = openFileInput(FILE_NAME9);
            byte[] bytes = new byte[fin9.available()];
            fin9.read(bytes);
            String text = new String (bytes);
            textView4.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin9!=null)
                    fin9.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ПРИМЕРЫ открытие файла(неправильные ответы)
        FileInputStream fin10 = null;
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        try {
            fin10 = openFileInput(FILE_NAME10);
            byte[] bytes = new byte[fin10.available()];
            fin10.read(bytes);
            String text2 = new String (bytes);
            textView6.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin10!=null)
                    fin10.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// ПРИМЕРЫ открытие файла(Пропущено)
        FileInputStream fin10a = null;
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        try {
            fin10a = openFileInput(FILE_NAME10a);
            byte[] bytes = new byte[fin10a.available()];
            fin10a.read(bytes);
            String text2 = new String (bytes);
            textView8.setText("  Пропущено- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin10a!=null)
                    fin10a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// СРАВНЕНИЕ ВЫРАЖЕНИЙ открытие файла(правильные ответы)
        FileInputStream fin11 = null;
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        try {
            fin11 = openFileInput(FILE_NAME11);
            byte[] bytes = new byte[fin11.available()];
            fin11.read(bytes);
            String text = new String (bytes);
            textView5.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin11!=null)
                    fin11.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ПРИМЕРЫ открытие файла(неправильные ответы)
        FileInputStream fin12 = null;
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        try {
            fin12 = openFileInput(FILE_NAME12);
            byte[] bytes = new byte[fin12.available()];
            fin12.read(bytes);
            String text2 = new String (bytes);
            textView7.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin12!=null)
                    fin12.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// СРАВНЕНИЕ ВЫРАЖЕНИЙ открытие файла(Пропущено)
        FileInputStream fin12a = null;
        TextView textView9 = (TextView) findViewById(R.id.textView9);
        try {
            fin12a = openFileInput(FILE_NAME12a);
            byte[] bytes = new byte[fin12a.available()];
            fin12a.read(bytes);
            String text2 = new String (bytes);
            textView9.setText("  Пропущено- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin12a!=null)
                    fin12a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// ДЛИННА открытие файла(правильные ответы)
        FileInputStream fin13 = null;
        TextView textView12 = (TextView) findViewById(R.id.textView12);
        try {
            fin13 = openFileInput(FILE_NAME13);
            byte[] bytes = new byte[fin13.available()];
            fin13.read(bytes);
            String text = new String (bytes);
            textView12.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin13!=null)
                    fin13.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ДЛИННА открытие файла(неправильные ответы)
        FileInputStream fin14 = null;
        TextView textView14 = (TextView) findViewById(R.id.textView14);
        try {
            fin14 = openFileInput(FILE_NAME14);
            byte[] bytes = new byte[fin14.available()];
            fin14.read(bytes);
            String text2 = new String (bytes);
            textView14.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin14!=null)
                    fin14.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ДЛИННА открытие файла(пропущено)
        FileInputStream fin14a = null;
        TextView textView16 = (TextView) findViewById(R.id.textView16);
        try {
            fin14a = openFileInput(FILE_NAME14a);
            byte[] bytes = new byte[fin14a.available()];
            fin14a.read(bytes);
            String text2a = new String (bytes);
            textView16.setText("  Пропущено- "+text2a);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin14a!=null)
                    fin14a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

// СРАВНЕНИЕ ДЛИННЫ открытие файла(правильные ответы)
        FileInputStream fin15 = null;
        TextView textView20 = (TextView) findViewById(R.id.textView20);
        try {
            fin15 = openFileInput(FILE_NAME15);
            byte[] bytes = new byte[fin15.available()];
            fin15.read(bytes);
            String text = new String (bytes);
            textView20.setText("  Правильно- "+text);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin15!=null)
                    fin15.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ВЕС открытие файла(неправильные ответы)
        FileInputStream fin16 = null;
        TextView textView22 = (TextView) findViewById(R.id.textView22);
        try {
            fin16 = openFileInput(FILE_NAME16);
            byte[] bytes = new byte[fin16.available()];
            fin16.read(bytes);
            String text2 = new String (bytes);
            textView22.setText("  Неправильно- "+text2);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin16!=null)
                    fin16.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }

        // ВЕС открытие файла(пропущено)
        FileInputStream fin16a = null;
        TextView textView24 = (TextView) findViewById(R.id.textView24);
        try {
            fin16a = openFileInput(FILE_NAME16a);
            byte[] bytes = new byte[fin16a.available()];
            fin16a.read(bytes);
            String text2a = new String (bytes);
            textView24.setText("  Пропущено- "+text2a);
        }
        catch(IOException ex) {

        }
        finally{

            try{
                if(fin16a!=null)
                    fin16a.close();
            }
            catch(IOException ex){

                Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}

