package com.bilgeadam.ornek;

public class HesapMakinesi {

    public int topla(int sayi1,int sayi2)
    {
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
    }
}
