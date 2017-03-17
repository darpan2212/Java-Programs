package org.regex;

import java.util.regex.*;  
public class RegexExample{  
public static void main(String args[]){  
//1st way  
/*Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("vs");  
boolean b = m.matches();  */
  
//2nd way  
boolean b2=Pattern.compile("<<name>>").matcher("<<name>>").matches();  
  
//3rd way  
/*boolean b3 = Pattern.matches("[0-9]+", "123");*/
  
System.out.println(" "+b2+" ");  
}}  