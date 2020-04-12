package com.company;

import java.util.Scanner;

public class ATM {
    public void calis (Hesap hesap){
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz...");

        int girisHakki = 3;

        System.out.println("Bilgilerinizi giriniz: ");

        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş başarılı.");
                break;
            }
            else {
                girisHakki = girisHakki - 1;
                System.out.println("Hatalı giriş yaptınız. Kalan giriş hakkınız: " + girisHakki);
            }

            if (girisHakki == 0){
                System.out.println("Giriş hakkınız kalmadı.");
                return;
            }
        }

        String islemler = "1. Bakiye Goruntuleme\n" +
                "2. Para Yatirma\n" +
                "3.Para Cekme\n" +
                "Cikis icin q'ya basiniz.";
        System.out.println(islemler);
        while (true) {
            System.out.println("Islemi seciniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }
            else if (islem.equals("2")) {
                System.out.println("Yatirmak istediginiz tutari giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                System.out.println("Gunluk max para cekme tutarı 1500 TL'dir. Cekmek istediginiz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Gecersiz islem...");
            }
        }




    }
}
