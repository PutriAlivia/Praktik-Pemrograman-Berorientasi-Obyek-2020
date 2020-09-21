# Laporan Praktikum Jobsheet 4

Percobaan 1
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
