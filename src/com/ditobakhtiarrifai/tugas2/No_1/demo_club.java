package com.ditobakhtiarrifai.tugas2.No_1;

public class demo_club {
    public static void main(String[] args) {

        // Objek Club
        club club1 = new club();
        club club2 = new club("Liverpool");
        club club3 = new club("Liverpool",
                " Liverpool Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool.");
        club club4 = new club("Liverpool", 1892, "Anfield");
        club club5 = new club("Liverpool", 1892, "Anfield",
                6, "Liverpool Football Club adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool.");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
