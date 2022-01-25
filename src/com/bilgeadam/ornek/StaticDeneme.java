package com.bilgeadam.ornek;

public class StaticDeneme {

    //İnstance variavle
    int sayi1;

    //class variable - değişken static ise class variabledır.
    static int sayi2;

    public static void main(String[] args) {

       //static olmayan değişkene, static metoddan erişilemez.
        //Erişmek istiyorsak , class'ın kendi objesini
        //oluşturarak erişeceğiz

        //Local varible'ı biz initialize etmek zorundayız.
        //Yani ilk değer vermek zorundayız.

        //int sayi3; dersen çalışmaz

        //değer verirsen aşağıdaki şekilde çalışır.
        int sayi3=0;

        StaticDeneme sd = new StaticDeneme();


        System.out.println("Sayı 1:" + sd.sayi1);
        System.out.println("Sayı 2:" + sayi2);
        System.out.println("Sayı 3:" + sayi3);
    }
}
