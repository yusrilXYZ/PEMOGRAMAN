# Nama File   : polymorphism_example.py
# Deskripsi   : Contoh program yang menerapkan konsep Polymorphism di Python
# Pembuat     : [Nama Kamu]
# Tanggal     : 14 November 2025

# Kelas induk Hewan
class Hewan:
    def suara(self):
        print("Hewan mengeluarkan suara")

# Kelas turunan Kucing
class Kucing(Hewan):
    def suara(self):
        print("Meong!")

# Kelas turunan Anjing
class Anjing(Hewan):
    def suara(self):
        print("Guk guk!")

# Fungsi utama
def main():
    print("=== DEMO POLYMORPHISM ===\n")

    # Membuat objek dari berbagai kelas
    h1 = Kucing()   # Objek Kucing
    h2 = Anjing()   # Objek Anjing
    h3 = Hewan()    # Objek Hewan

    # Menampilkan suara tiap hewan
    print("Suara h1 (Kucing) :", end=" ")
    h1.suara()

    print("Suara h2 (Anjing) :", end=" ")
    h2.suara()

    print("Suara h3 (Hewan)  :", end=" ")
    h3.suara()

    print("\n=== PROGRAM SELESAI ===")

# Eksekusi program
if __name__ == "__main__":
    main()
