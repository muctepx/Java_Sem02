// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
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
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        String[] stringArr = list.toArray(new String[0]);
        //System.out.println(Arrays.toString(stringArr));
        reader.close();
        
        //System.out.println(stringArr[0]);
        //System.out.println(stringArr[1]);

        String a1 = stringArr[0];
        double x = Character.getNumericValue(a1.charAt(2));

        String b1 = stringArr[1];
        double y = Character.getNumericValue(b1.charAt(2));

        System.out.println("Число а = " + x);
        System.out.println("Число b = " + y);

        double result = Math.pow(x, y);
        System.out.println("a в степени b = " + result);;

        File file = new File("output.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            if (x == 0 | y == 0)
                printWriter.println("не оперделено");
            else
                printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            
        }
    }
}
