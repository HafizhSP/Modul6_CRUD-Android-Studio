package com.example.modul6;

public class Konfigurasi {
    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.1.105/modul6android/insert.php";
    public static final String URL_GET_ALL = "http://192.168.1.105/modul6android/read.php";;
    public static final String URL_GET_EMP = "http://192.168.1.105/modul6android/select.php";;
    public static final String URL_UPDATE_EMP = "http://192.168.1.105/modul6android/update.php";;
    public static final String URL_DELETE_EMP = "http://192.168.1.105/modul6android/delete.php";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_MHS_ID = "id";
    public static final String KEY_MHS_NAMA = "nama";
    public static final String KEY_MHS_POSISI = "jurusan"; //desg itu variabel untuk posisi
    public static final String KEY_MHS_GAJIH = "email"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_JURUSAN = "jurusan";
    public static final String TAG_EMAIL = "email";


    public static final String MHS_ID = "mhs_id";
}
