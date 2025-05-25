# 📘 ERP Finance - Minimum Viable Product (MVP) Specification

## 🎯 Tujuan
Membuat aplikasi ERP Finance versi awal yang cukup untuk digunakan dalam pencatatan dan manajemen keuangan secara internal dengan fitur utama yang sederhana namun efektif.

---

## ✅ Fitur MVP

### 1. 🧑‍💼 Manajemen Akun Pengguna
- [ ] Login / Logout
- [ ] Registrasi pengguna
- [ ] Hak akses: `Admin`, `Staff Keuangan`, `Auditor`

---

### 2. 📊 Dashboard Ringkasan Keuangan
- [ ] Tampilan total pemasukan, pengeluaran, dan saldo
- [ ] Grafik sederhana cashflow bulanan (opsional)

---

### 3. 💸 Manajemen Transaksi
- [ ] Tambah pemasukan
- [ ] Tambah pengeluaran
- [ ] Kategori transaksi (misal: Gaji, Operasional, Aset)
- [ ] Upload bukti transaksi (opsional)

---

### 4. 📅 Budgeting (Penganggaran)
- [ ] Buat anggaran per kategori
- [ ] Bandingkan realisasi dengan anggaran

---

### 5. 📑 Laporan Keuangan Sederhana
- [ ] Laporan pemasukan & pengeluaran
- [ ] Filter laporan berdasarkan tanggal & kategori
- [ ] Export laporan ke PDF / Excel (opsional)

---

### 6. 👥 Manajemen User & Role (Admin)
- [ ] CRUD data user
- [ ] Pengaturan hak akses berdasarkan role

---

### 7. 🔔 Notifikasi & Reminder (Opsional)
- [ ] Reminder jatuh tempo pembayaran
- [ ] Reminder anggaran melebihi limit

---

## 🛠 Teknologi yang Digunakan

| Komponen       | Teknologi                        |
|----------------|----------------------------------|
| Frontend       | Thymeleaf (atau React, opsional) |
| Backend        | Spring Boot                      |
| Database       | PostgreSQL                       |
| Autentikasi    | Spring Security (Basic/JWT)      |
| Containerisasi | Docker & Docker Compose          |
| File Upload    | Multipart (Spring Boot Support)  |
| CI/CD (opsional)| GitHub Actions / Jenkins        |

---

## 🔁 Urutan Pengembangan (Tahapan MVP)

1. Setup proyek & autentikasi dasar (login/logout)
2. CRUD transaksi keuangan (pemasukan/pengeluaran)
3. Buat tampilan dashboard ringkasan
4. Tambah fitur budgeting dan laporan
5. Tambahkan manajemen user dan role

---

## 🧱 Struktur Role & Hak Akses (Sederhana)

| Fitur                     | Admin | Staff Keuangan | Auditor |
|--------------------------|:-----:|:--------------:|:-------:|
| Login                    | ✅     | ✅              | ✅       |
| Tambah/Edit Transaksi    | ✅     | ✅              | ❌       |
| Lihat Laporan            | ✅     | ✅              | ✅       |
| Buat Anggaran            | ✅     | ✅              | ❌       |
| Manajemen User & Role    | ✅     | ❌              | ❌       |

---

## 📂 Folder Struktur Awal (Contoh)

