package com.ditobakhtiarrifai.tugas2.No_2;

public class Demo_Binatang {
    public static void main(String[] args) {

        // Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Hantu";
        burung.makan = "Daging-Dagingan";
        burung.tidur = "Burung Hantu tidur pada siang hari";
        burung.terbang = "Burung Hantu Terbang Menggunakan Sayap";

        // Memanggil Method Burung
        System.out.println("\t\t\t>>>BURUNG<<<");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Lele";
        ikan.makan = "Ikan Lele Makan Pelet";
        ikan.tidur = "Ikan Lele Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Lele Berenang Menggunakan Sirip";

        System.out.println();

        // Memanggil Method IKAN
        System.out.println("\t\t\t>>>IKAN<<<");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing jawa";
        kucing.makan = "Kucing jawa Makanan yang berbau amis";
        kucing.tidur = "Kucing jawa Pada Malam Hari";
        kucing.meong = "Kucing jawa Meong Saat birahi";

        // Memanggil Method Kucing
        System.out.println("\t\t\t>>>KUCING<<<");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }

}
