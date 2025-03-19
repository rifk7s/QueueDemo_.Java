# Queue Implementation Demo (Work In Progress)

> ⚠️ **Note**: Project ini masih dalam tahap pengembangan (Work In Progress). Beberapa fitur mungkin belum lengkap atau dapat berubah.

Implementasi struktur data Queue (Antrian) menggunakan Java. Project ini mencakup implementasi dasar Queue dengan operasi enqueue, dequeue, dan peek.

## 📝 Deskripsi

Project ini berisi implementasi dari:
- Queue (Antrian) menggunakan array
- Operasi dasar antrian (enqueue, dequeue, peek)
- Penanganan kondisi antrian penuh dan kosong

## 🚀 Instalasi

### Menggunakan Terminal

1. Clone repository ini:
   ```bash
   git clone https://github.com/rifk7s/QueueDemo_.Java.git
   cd QueueDemo_.Java
   ```

2. Compile project:
   ```bash
   javac src/*.java
   ```

3. Jalankan aplikasi:
   ```bash
   java -cp src QueueDemoC
   ```

### Menggunakan VS Code

1. Clone repository ini ke komputer Anda
2. Buka folder project di VS Code
3. Pastikan Extension Pack for Java sudah terinstall
4. Klik tombol Run (▶️) di file QueueDemo.java

## 📁 Struktur Folder

```
QueueDemo_.Java/
├── src/
│   ├── QueueDemo.java    # Implementasi Queue
│   └── *.java           # File Java lainnya
├── LICENSE              # BSD 3-Clause License
└── README.md           # Dokumentasi project
```

## 📚 Penggunaan

```java
// Membuat queue baru dengan kapasitas 10
QueueDemo queue = new QueueDemo(10);

// Menambah elemen
queue.enqueue(10);
queue.enqueue(20);

// Mengambil elemen
int value = queue.dequeue();

// Melihat elemen terdepan
int front = queue.peek();
```

## 📄 Lisensi

Project ini dilindungi oleh [BSD 3-Clause License](LICENSE).

## 👨‍💻 Author

- [rifk7s](https://github.com/rifk7s)
