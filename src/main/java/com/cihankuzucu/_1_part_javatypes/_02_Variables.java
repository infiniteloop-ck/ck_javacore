package com.cihankuzucu._1_part_javatypes;

public class _02_Variables {

    public static void main(String[] args) {
        // Veri değişken isimlerini yazarken;

/*
            veri isimlendirmeleri


            6) değişken isimleri camelCase kuralına göre yazılır.
*/
        // veri isimlendirmeleri
        // 1) isim, veya sıfat, zamir kullanmamız lazım.
        int schoolNumber = 25;
        System.out.println(schoolNumber);
        schoolNumber=44;
        System.out.println(schoolNumber);
        // 2) _ veya $ ile başlanabilir.
        int _schoolNumber=55;
        System.out.println(_schoolNumber);

        int $schoolNumber=99;
        System.out.println($schoolNumber);

        // 3) sayı ile bitebilir.
        int schoolNumber123=105;
        System.out.println(schoolNumber123);

        // yazamazsınız

        // int schoolNumber=11 // aynı isimde yazılmaz.

        // 4) sayıl ile başlamaz.
        // int 44schoolNumber=11 // sayıyla başlanmaz.

        // 5) _ veya $ dışında özel simgelerle başlamaz.
        // int ~schoolNumber=11 // özel simgeyle başlanmaz.
        // int ``schoolNumber=11 // özel simgeyle başlanmaz.

    }
}
