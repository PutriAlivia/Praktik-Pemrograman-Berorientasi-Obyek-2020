# Laporan Latihan Jobsheet 11

# Percobaan 1

**Hasil Output**


![OutputHasilCumlaude](https://user-images.githubusercontent.com/70506138/98508589-48fc5c80-2292-11eb-8edc-f89d38376b02.PNG)



**Latihan**

1. 1) Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut.
Jelaskan penyebab terjadinya hal tersebut ?

![pertanyaanNo1](https://user-images.githubusercontent.com/70506138/98508097-7694d600-2291-11eb-919f-37ad0d8e1d2a.PNG)

Jawab : penyebabnya karena class interface ICumlaude yang berada pada satu package

2.Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut 
dihilangkan? Jelaskan menurut pemahaman anda.

Jawab=

3.Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

Jawab : Karena dari class mahasiswa belum melakukan implements ke class interface ICumlaude

4.Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class
Program? Mengapa demikian?

Jawab : terjadi error,karena bukan dalam bagian implementasi karena method kuliahDiKampus merupakan bagian dari class mahasiswa


5.Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method 
beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?

Jawab : 

6.Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi 
class Program menjadi seperti berikut ini:


![pertanyaanNo10](https://user-images.githubusercontent.com/70506138/98508232-b9ef4480-2291-11eb-8ac9-2521809bb9f4.PNG)


Jawab : Tinggal menambhan saja System.out.printlns pada class Sarjana dan PascaSarjana denngan value yang dinginkan di daerah method lulus


# Percobaan 2

![OutputBerprestasi](https://user-images.githubusercontent.com/70506138/98509754-5c102c00-2294-11eb-97ad-f7b4df2f7a8b.PNG)

**Pertanyaan Percobaan**

1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar
dibawah ini :

![percobaan1](https://user-images.githubusercontent.com/70506138/98509783-6e8a6580-2294-11eb-9a65-7f648ab1c1e6.PNG)

Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya)

2. Perhatikan script code dibawah ini :

![percobaan2](https://user-images.githubusercontent.com/70506138/98509820-819d3580-2294-11eb-951e-8353f3e48f3b.PNG)

Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? 

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat
mawapres pada objek sarjanaCumlaude.

![percobaan3](https://user-images.githubusercontent.com/70506138/98509866-98438c80-2294-11eb-83ad-fe984a8e667c.PNG)

