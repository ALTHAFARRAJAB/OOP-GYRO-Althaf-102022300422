public class Main {
    public static void main(String[] args) {
        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        // To do: Panggillah Method Informasi dari class KomputerVIP
        // To do: Panggillah Method Login
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        KomputerVIP komputerVIP = new KomputerVIP(10, "Althaf", 5000, true);
        komputerVIP.Informasi();
        komputerVIP.Login("Althaf");
        komputerVIP.Bermain(2);
        komputerVIP.Bermain(1, 30);
        
                System.out.println();
        
        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        // To do: Panggillah Method Informasi dari class KomputerPremium
        // To do: Panggillah Method Pesan
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        KomputerPremium komputerPremium = new KomputerPremium(5, "ALthafNet", 10000, false);
        komputerPremium.Informasi();
        komputerPremium.Pesan(3);
        komputerPremium.TambahLayanan("Nasi Padang");
        komputerPremium.TambahLayanan("Indomie", "esteh");
        }
    }

        
    