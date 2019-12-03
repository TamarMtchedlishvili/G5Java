package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
public class Testclass {
    public static void main(String[] args) {
        TestArray testarray =  new Testarray();
        TestArray New = new TestArray();
        Random random = new Random();

        for (int i = 0; i<12; i++)
        {
            New.add(random.nextInt(10 - 5 + 1) + 5);
            TestArray.add(random.nextInt(100));
        }
        Even(TestArray);
        _3multiple(New,random);

    }
    public static void  TestFunctiin(TestArray newtest){
        TestArray New1test = newtest;
        System.out.println("Test Function");
        System.out.println(newtest);
        for (int b=0; b < New1test.size();){
            New1test.remove(b);
            b++;

        }
        Collections.sort(New1test);
        System.out.println(New1test);
        System.out.println("");

    }
    public static void TestFunction2(TestArray New, Random random){
        TestArray Newone = new TestArray();
        Newone = New;
        System.out.println("Test function 2");
        System.out.println(New);

        for (int b=0; b < 12;b++){
            b++;
            b++;
            b++;
            Newone.add(i,random.nextInt(25 - 20 + 1) + 20);

        }

        System.out.println(Newone);

    }
}