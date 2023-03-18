package com.mycompany.pruebas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    /*Verificar si el año ingresado es biciesto*/
    private void esBiciesto(int year){
        boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isLeapYear);
    }
    /*Desordenar*/
    private void desordenarString (String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
    /*Traer no duplicados de una lista*/
    public void getOnlyNoDuplicate(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }
    
    /*Retornar boolean si hay vocal en una cadena de texto*/
    public void validaSiExisteVocal(String text){
       /* String[] array = text.split("");
        boolean isPresent = false;
        for(String s: array){
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                isPresent = true;
                break;
            }
        
        }
        System.out.println(isPresent);*/
       
       boolean result = text.matches(".*[aeiou].*"); 
       System.out.println(result);
    }
    
    /*Validar si es palindromo*/
    public boolean esPalindromo(String text){
        boolean result = true;
        int length = text.length();
        
        for(int i = 0; i<length/2; i++){
            if(text.charAt(i) != text.charAt(length - i - 1)){
                result = false;
                break;
            }
        }
        return result;
    }
    
    /*Contar caracteres repetidos*/
    public static void main(String[] args) {
        Pruebas app = new Pruebas();
        Scanner scan = new Scanner();
        //app.miInvertString("Palindromo");
        //app.isCapicua(56);
        //app.countCharacterTimes("Hola Mundo");
        //app.repeatedCharacters("Arrinconado");
        //app.Multiplode2(10);
        //app.esBiciesto(2024);
        //app.desordenarString("Callado");
        //app.getOnlyNoDuplicate(Arrays.asList(1,25,2,3,555,2,3,2,5,4,12));
        //app.validaSiExisteVocal("Moca");
        System.out.println(app.esPalindromo("oro"));   
    }
}
