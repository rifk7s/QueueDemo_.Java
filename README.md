# 📊 Implementasi Struktur Data Java

> 🎓 Proyek praktikum struktur data dengan implementasi Queue, Hash Table, dan Binary Tree menggunakan Java.

## 🌟 Fitur Utama

Proyek ini berisi implementasi dari tiga struktur data penting:

### 🔄 Queue (Antrian)
- Implementasi menggunakan array circular buffer
- Operasi enqueue, dequeue, peek
- Penanganan kondisi antrian penuh dan kosong dengan tepat

### 🔍 Hash Table (Tabel Hash)
- Implementasi dengan teknik chaining untuk penanganan tabrakan (collision)
- Operasi insert dan search
- Penanganan nilai kunci yang sama menggunakan linked list

### 🌳 Binary Tree (Pohon Biner)
- Implementasi Binary Search Tree (BST)
- Traversal in-order, pre-order, dan post-order
- Penyisipan nilai dengan aturan BST

## 🚀 Cara Menggunakan

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

3. Jalankan demo:
   ```bash
   java -cp src DataStructuresDemo
   ```

### Menggunakan VS Code

1. Clone repository ini ke komputer Anda
2. Buka folder project di VS Code
3. Pastikan Extension Pack for Java sudah terinstall
4. Klik tombol Run (▶️) di file DataStructuresDemo.java

## 📁 Struktur Folder

```
QueueDemo_.Java/
├── src/
│   ├── Queue.java              # Implementasi Antrian
│   ├── HashTable.java          # Implementasi Tabel Hash
│   ├── BinaryTree.java         # Implementasi Pohon Biner
│   └── DataStructuresDemo.java # Kelas demo utama
├── LICENSE                     # BSD 3-Clause License
└── README.md                   # Dokumentasi project
```

## 📚 Contoh Penggunaan

### Contoh Queue
```java
// Membuat antrian baru dengan kapasitas 10
Queue queue = new Queue(10);

// Menambah elemen
queue.enqueue(10);
queue.enqueue(20);

// Mengambil elemen
int value = queue.dequeue();

// Melihat elemen terdepan
int front = queue.peek();
```

### Contoh Hash Table
```java
// Membuat hash table dengan kapasitas 5
HashTable table = new HashTable(5);

// Menyimpan pasangan kunci-nilai
table.insert(1, "Tugas Pertama");
table.insert(6, "Tugas Keenam");

// Mencari berdasarkan kunci
String hasil = table.search(6);  // Mengembalikan "Tugas Keenam"
```

### Contoh Binary Tree
```java
// Membuat binary tree baru
BinaryTree tree = new BinaryTree();

// Menambahkan nilai
tree.insert(50);
tree.insert(30);
tree.insert(70);

// Melakukan traversal
tree.inOrderTraversal(tree.root);   // Output: 30 50 70
```

## 📝 Konsep Utama

### Prinsip FIFO di Queue
Queue mengimplementasikan prinsip FIFO (First-In-First-Out) dimana elemen yang pertama masuk akan pertama keluar, seperti antrian di dunia nyata.

### Chaining di Hash Table
Teknik chaining digunakan untuk menangani tabrakan (collision) ketika dua kunci berbeda menghasilkan indeks yang sama pada array.

### Traversal pada Binary Tree
- **In-order**: Kunjungi child kiri, node saat ini, lalu child kanan (menghasilkan output terurut untuk BST)
- **Pre-order**: Kunjungi node saat ini, child kiri, lalu child kanan
- **Post-order**: Kunjungi child kiri, child kanan, lalu node saat ini

## 📄 Lisensi

Proyek ini dilindungi oleh [BSD 3-Clause License](LICENSE).

## 👨‍💻 Author

- [rifk7s](https://github.com/rifk7s)
