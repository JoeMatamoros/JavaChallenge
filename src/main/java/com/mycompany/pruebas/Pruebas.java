package com.mycompany.pruebas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author josea
 */
public class Pruebas {
     /*Invertir un texto seteado de manera interativa*/    
    private void miInvertString(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }
    /*Comparar si un numero se lee igual al reverso*/
    private void isCapicua(int number){
       String numberText = String.valueOf(number);
       String reverseNumber = new StringBuilder(numberText).reverse().toString();
       
       if(numberText.equals(reverseNumber)){
           System.out.println("Es Capicua");     
       }else{
           System.out.println("No es capicua");
       }
       
    }
    /*Cantidad de elemento segun caracteres que se obtienen*/
    private void countCharacterTimes(String text){
        int i, lenght, counter[] = new int[256];
        lenght = text.length();
        for(i = 0; i<lenght; i++){
            counter[text.charAt(i)]++;
        }
        
        for(i = 0; i<256; i++){
            if(counter[i] != 0 ){
                System.out.println((char)i+":"+counter[i]);
            }
        }
    }
    /*Contar la cantidad de caracteres repetidos*/
    private void repeatedCharacters(String text){
     int i, lenght, counter[] = new int[256];
        lenght = text.length();
        for(i = 0; i<lenght; i++){
            counter[text.charAt(i)]++;
        }
        
        for(i = 0; i<256; i++){
            if(counter[i] > 1 ){
                System.out.println((char)i+":"+counter[i]);
            }
        }
    
    }
    /*Ver los multiplos de 2*/
    private void Multiplode2(int number){
        if(number %2 == 0   ){
            System.out.println("Es multiplo de 2");
        }else{
            System.out.println("No es multtiplo");
        }
    }
    
    private void esBiciesto(int year){
        boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isLeapYear);
    }
    
    private void desordenarString (String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
    
    public void getOnlyNoDuplicate(String texto){
    
    
    }
    
    /*Contar caracteres repetidos*/
    public static void main(String[] args) {
        Pruebas app = new Pruebas(); 
        //app.miInvertString("Palindromo");
        //app.isCapicua(56);
        //app.countCharacterTimes("Hola Mundo");
        // app.repeatedCharacters("Arrinconado");
        //app.Multiplode2(10);
        //app.esBiciesto(2024);
        app.desordenarString("Callado");
    }
}
