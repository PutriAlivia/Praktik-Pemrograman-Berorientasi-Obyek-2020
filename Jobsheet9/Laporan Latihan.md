# Laporan Praktikum Jobsheet 6


**Percobaan 1**

Output

![OutputPercobaan1](https://user-images.githubusercontent.com/70506138/95050716-3d0eff00-0716-11eb-95c9-3134741fdac6.PNG)

. PERTANYAAN

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga
program tersebut bisa dijalankan dan tidak error!

![ExtendsPercobaan1](https://user-images.githubusercontent.com/70506138/95050840-70518e00-0716-11eb-99d8-a0abaf6cebe4.PNG)


2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!


Tidak adanya kata kunci extends jadi akses ClassB kepada ClassA tidak bisa diakses

**Percobaan 2**

Output


![OutputPercobaan1](https://user-images.githubusercontent.com/70506138/95050716-3d0eff00-0716-11eb-95c9-3134741fdac6.PNG)

. PERTANYAAN

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga
program tersebut bisa dijalankan dan tidak error!

menambahkan fungsi Extends pada ClassB seperti berikut
"ClassB extends ClassA"

2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error!

Tidak adanya kata kunci extends jadi akses ClassB kepada ClassA tidak bisa diakses

**Percobaan 3**

Output

![OutputPercobaan3](https://user-images.githubusercontent.com/70506138/95051337-392fac80-0717-11eb-8a6c-6bc7a71f1ec0.PNG)

. PERTANYAAN

1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!

Merujuk/mengakses atribut dari parent class /superclass

2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!

Super untuk memanggil/mengakses atribut pada parent class, sedangkan This untuk merujuk atribut pada class yang dimana function berada

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class
tersebut dapat mengakses atribut tersebut!

Karena adanya fungsi entends yang merujuk ke ClassA maka ClassB tidak perlu mendeklaraski ulang atribut phi dan r

**Percobaan 4**

Output

![OutputPercobaan4](https://user-images.githubusercontent.com/70506138/95051812-1356d780-0718-11eb-8557-e8588862edac.PNG)

PERTANYAAN
1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian
jelaskan alasannya!

2. Ubahlah isi konstruktor default ClassC seperti berikut:
Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan
kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!

3. Ublah isi konstruktor default ClassC seperti berikut:
Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada
error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya
akan hilang.

Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output
seperti berikut pada saat instansiasi objek test dari class ClassC
Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat!

4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!
