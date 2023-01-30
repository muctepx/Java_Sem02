// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class HW02 {

    public static void main(String args[]) throws Exception {  
BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
String str;
ArrayList<String> list = new ArrayList<String>();
while((str = reader.readLine()) != null ){
    if(!str.isEmpty()){
    list.add(str);
}}
String[] stringArr = list.toArray(new String[0]);
System.out.println(Arrays.toString(stringArr));
reader.close();

String a1 = stringArr[0];
char[] charArray1 = a1.toCharArray();

String b1 = stringArr[1];
char[] charArray2 = b1.toCharArray();

double a = (double) charArray1[2];
double b = (double) charArray2[2];

double result = Math.pow(a, b);

File file = new File("output.txt");
try {
PrintWriter printWriter = new PrintWriter(file);
if (a == 0 | b == 0)
printWriter.println("не оперделено");
else
printWriter.println(result);
printWriter.close();
} catch (FileNotFoundException ex) {
System.out.println(result);
}
}}
