package com.company;

public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap (String kullaniciAdi, String parola, int bakiye) {
        this.setKullaniciAdi(kullaniciAdi);
        this.setParola(parola);
        this.setBakiye(bakiye);
    }

    public void paraYatir (int tutar) {
        bakiye = bakiye + tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);

    }

    public void paraCek (int tutar) {
        if (bakiye > tutar){
            System.out.println("Yetersiz bakiye. Bakiyeniz: " + bakiye);
        }
        if (bakiye > 1500) {
            System.out.println("Bir kerede 1500 tl'den fazla para çekemezsiniz.");
        }
        bakiye -= tutar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
