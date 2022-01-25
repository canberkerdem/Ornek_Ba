package com.bilgeadam.ornek;

public class VeriTipleri {

    public static void main(String[] args) {

        int yas =60;

        char cinsiyet = 'E';

        String sehir = "İstanbul";

        if (yas<35)
        {
            System.out.println("Genç");
        }
        else
        {
            System.out.println("Yaşlı");
        }

        //i++ ==> i= i+1
        for (int i=1; i<=10; i++)
        {
            System.out.println(i+"-Merhaba");
        }
        System.out.println("Şehir index : " + sehir.indexOf("İ"));

        if (sehir.indexOf("İ") >= 0)
        {
            System.out.println("İçinde İ harfi var!");
        }

        String deneme = " Canberk Erdem";

        System.out.println(deneme.substring(4));

    }
}
