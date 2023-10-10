## Quiz 1
### Nama : Andreagazy Iza Amerianto
### NIM : 2241720146
### Kelas : TI-2C/03

#### Class dan Objek
1. Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?<br>Class pada pemrograman berbasis objek adalah sebuah prototype atau blueprint dari sebuah objek yang didalamnya terdalat atribut dan method.

2.	Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java?<br>Pertama buat class terlebih dahulu misal class Mahasiswa yang memiliki beberapa atribut dan method. Kemudian pada main dilakukan pendefinisian dengan (class) (nama objek) = new (class)(parameter); Misal, Mahasiswa mhs1 = new Mahasiswa(). Jika class tidak berparameter maka parameter tidak perlu diisi, misal class Mahasiswa memiliki parameter nama dan nim sehingga dilakukan Mahasiswa mhs1 = new Mahasiswa(“Andreagazy”, “2241720146”).

3.	Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. Bagaimana Anda akan membuat objek "laptop" dari class tersebut?<br>Yaitu dengan instansiasi Barang laptop = new Barang();. Kemudian dapat dilakukan set atribut dan eksekusi method yang dimiliki.

#### Encapsulation
1.	Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang.<br>Enkapsulasi adalah mengkapsulkan atribut dan method dari sebuah class yang melibatkan penggunaan access modifier seperti  private, protected, public dan default. Enkapsulasi juga disebut Information Hidding yang dimana menyembunyikan informasi dan membatasi akses pada atribut dari sebuah objek. Hal ini diperlukan dalam pengembangan sistem informasi inventaris karena terdapat beberapa informasi yang aksesnya perlu dibatasi atau disembunyikan

2.	Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa.<br>Misal pada class “Barang” yang dimana terdapat atribut lokasiBarang yang sebaiknya di enkapsulasi dengan merubah access modifier menjadi private yang hanya method dalam tersebut saja yang dapat mengakses dan memodifikasi lokasi barang.

#### Relasi Kelas
1.	Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?<br>Relasi antara kelas adalah hubungan atau interaksi yang terjadi antara dua atau lebih kelas pada suatu program. Relasi ini menggambarkan kelas yang memiliki atribut berupa kelas lain.

2.	Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?<br>Relasi antara “Barang” dan “Kategori” pada sistem informasi inventaris dapat digambarkan dengan aggregasi yang dimana setiap “Barang” pasti memiliki “Kategori” sehingga class “Kategori” merupakan atribut dari class “Barang”. 

#### PBL
1. Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut (misalnya, class "Barang").<br><img src="Quiz 1.drawio.png">

2. Bagaimana Anda akan menggunakan encapsulation untuk melindungi atribut-atribut dalam class tersebut?<br>Untuk melindungi atribut-atribut dalam class "Pemasok" yaitu dengan mengatur akses ke atribut tersebut sebagai private dan menyediakan getter dan setter  untuk mengakses dan mengubah nilai atribut tersebut.

3. Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut.<br>Pada class dibawah class Mahasiswa dan class Peminjaman serta class Barang dan class Peminjaman memiliki relasi antar class berupa assosiate. Sedangkan class Peralatan merupakan inheritance dari class Barang<br> <img src ="Quiz 1 PBL.png">