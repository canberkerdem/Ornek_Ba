package com.bilgeadam.ornek;

public class HesapMakinesi {

    //method overloading
    //ayni isimli metod tanımlıyoruz, parametre sayısı ya da veri tipleri farklı
    public int topla(int sayi1,int sayi2)
    {
        System.out.println("int topla çalıştı");
        return sayi1 +sayi2;
    }
    public double topla(double sayi1,double sayi2)
    {
        System.out.println("double topla çalıştı");
        return sayi1 +sayi2;
    }
    public int carp(int sayi1,int sayi2)
    {
        return sayi1*sayi2;
    }
    public double bol(int sayi1,int sayi2)
    {
        return sayi1/(double)sayi2;
    }
    public int cıkar(int sayi1,int sayi2)
    {
        return sayi1-sayi2;
    }
    public static void main(String[] args) {
        HesapMakinesi hm =new HesapMakinesi();

        System.out.println(hm.topla(5,7));
        System.out.println(hm.bol(15,4));
        System.out.println(hm.carp(4,9));
        System.out.println(hm.cıkar(37,12));

        int sonuc = hm.topla(9,14);
        System.out.println("Sonuç:" + sonuc);

        System.out.println("---------------------------");
        System.out.println(hm.topla(7.1,5.6));

    }
}
