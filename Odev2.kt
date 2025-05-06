fun main() {
    // Test etmek için buraya örnek çağrılar ekledim.

    println("1- Dereceyi Fahrenheit'a Çevirme: ${dereceToFahrenheit(25.0)}") // 77.0
    println("2- Dikdörtgen Çevresi: ${dikdortgenCevresi(5, 10)}") // 30
    println("3- Faktöriyel Hesabı: ${faktoriyel(5)}") // 120
    println("4- Kelimedeki 'a' harfi sayısı: ${aHarfiniSay("Ankara")}") // 3
    println("5- Çokgen İç Açıları Toplamı: ${icAciToplami(5)}") // 540
    println("6- Maaş Hesaplama: ${maasHesapla(22)}") // Normal ve mesaili hesap
    println("7- Kota Ücreti Hesabı: ${kotaUcreti(55)}") // 120
}

// 1. Dereceyi Fahrenheit'a Çeviren Metot
fun dereceToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgenin Çevresini Hesaplayan Metot
fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}

// 3. Faktöriyel Hesaplayan Metot
fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

// 4. Kelimedeki 'a' Harfi Sayısını Bulan Metot
fun aHarfiniSay(kelime: String): Int {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            sayac++
        }
    }
    return sayac
}

// 5. Çokgenin İç Açılar Toplamını Hesaplayan Metot
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

// 6. Gün Sayısına Göre Maaş Hesaplayan Metot
fun maasHesapla(gunSayisi: Int): Int {
    val saatlikUcret = 10
    val mesaiUcret = 20
    val toplamSaat = gunSayisi * 8

    return if (toplamSaat <= 160) {
        toplamSaat * saatlikUcret
    } else {
        val normalSaat = 160
        val mesaiSaat = toplamSaat - 160
        (normalSaat * saatlikUcret) + (mesaiSaat * mesaiUcret)
    }
}

// 7. Kota Miktarına Göre Ücret Hesaplayan Metot
fun kotaUcreti(kota: Int): Int {
    val sabitUcret = 100
    val sabitKota = 50
    val fazlaUcret = 4

    return if (kota <= sabitKota) {
        sabitUcret
    } else {
        sabitUcret + (kota - sabitKota) * fazlaUcret
    }
}
