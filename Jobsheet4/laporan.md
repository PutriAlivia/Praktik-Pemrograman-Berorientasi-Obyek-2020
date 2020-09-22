# Laporan Praktikum Jobsheet 4


**Percobaan 1**

Output

![Output jbs4 laptop](https://user-images.githubusercontent.com/70506138/93744937-d4eff180-fc1c-11ea-8845-53c6affcd921.PNG)

Pertanyaan
Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait:
1.	Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
: memiliki fungsi untuk mengakses data dan mengisi nya kedalam  suatu objek 

2.	Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?
: Konstruktor default tidak memiliki argumen atau parameter apa pun. Di sisi lain konstruktor yang diparameterisasi harus memiliki beberapa argumen atau parameter.

3.	Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?
: merk 

4.	Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop
memiliki relasi dengan class Processor ?
: 
public void setproc(Processor proc){
        this.proc = proc;
    }
    public String getmerk(){
        return merk;
    }
    public Processor getproc(){
        return proc;
    }
    
5.	Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?
: untuk bisa mengakses class Processor jika sintaks proc. Info di hilangkan maka output  akan menjadi

![hilang proc](https://user-images.githubusercontent.com/70506138/93745007-f6e97400-fc1c-11ea-93cb-8d8d0cbe09af.PNG)

6.	Pada class MainPercobaan1, terdapat baris kode: Laptop l = new Laptop("Thinkpad", p);. Apakah p tersebut ?
Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?


![image](https://user-images.githubusercontent.com/70506138/93745281-78d99d00-fc1d-11ea-8009-d454d58719b4.png)



**Percobaan 2**

Output


![Output jbs4 mobil](https://user-images.githubusercontent.com/70506138/93745432-be966580-fc1d-11ea-9162-0d8525fa89ed.PNG)

Pertanyaan

1.Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class 
Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?
: public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    public Pelanggan(){
    }
    public String getnama(){
        return nama;
    }
    public Mobil getmobil(){
        return mobil;
    }
    public Sopir getsopir(){
        return sopir;
    }
    public int gethari(){
        return hari;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setmobil(Mobil mobil){
        this.mobil=mobil;
    }
    public void setsopir(Sopir sopir){
        this.sopir=sopir;
    }
    
2.	Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ?
: Karena pada dasarnya program ini sama seperti program penyewaan atau rental mobil

3.	Perhatikan kode dari class Pelanggan. Untuk apakah perintah
mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?
: untuk mengihitung biaya keseluruhan penyewaan mobil beserta supirnya

4.	Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan
p.setSopir(s) ?
:

5.	Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal()
tersebut ?
: untuk mengihitung biaya keseluruhan

6.	Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run!
System.out.println(p.getMobil().getMerk());
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut?
: menampilkan merk mobil beserta harga total nya 


**Percobaan 3**

Output

![Output jbs4 kai](https://user-images.githubusercontent.com/70506138/93745639-0ddc9600-fc1e-11ea-9796-2c5eb854a73f.PNG)

Pertanyaan

1.	Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan
this.asisten.info() digunakan untuk apa ?
 
2.	Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() !

Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);

System.out.println(keretaApi.info());

:![Output jbs4 kai](https://user-images.githubusercontent.com/70506138/93745639-0ddc9600-fc1e-11ea-9796-2c5eb854a73f.PNG)
3.	Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?
4.	Perbaiki class KeretaApi sehingga program dapat berjalan !

**Percobaan 4**

Output 

![Output jbs4 gerbong](https://user-images.githubusercontent.com/70506138/93745822-5a27d600-fc1e-11ea-8b80-d3d5cff096c7.PNG)

Pertanyaan

1.	Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?
2.	Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut ?

...
if (this.penumpang != null) {
info += "Penumpang: " + penumpang.info() + "\n";
}
...

3.	Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ?
4.	Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang
 
terjadi ?
5.	Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain !
