package tokokomputer;
import java.util.Scanner;

public class BeliJadi {
    
    private static int TotalHarga;
    private static int Bayar;
    
    public static void AcerPredatorOrion9000 (){
        System.out.println("  Merek PC    : Acer Predator Orion 9000");
        System.out.println("    Processor   : Core i9 Extreme Edition 18-core");
        System.out.println("    RAM         : 128 GB");
        System.out.println("    SSD         : 512 GB");
        System.out.println("    HDD         : 2 TB");
        System.out.println("    VGA         : 2-way Nvidia GeForce GTX 1080 Ti Dual SLI");
        System.out.println("    OS          : Windows 10 Home - 64bit");
        System.out.println("    Harga       : Rp 88499000");
        }
    public static void ASUSROGGT51CH (){
        System.out.println("  Merek PC    : Acer Predator Orion 9000");
        System.out.println("    Processor   : Intel® Core™ i7-6700K");
        System.out.println("    RAM         : 64 GB");
        System.out.println("    SSD         : 512 GB");
        System.out.println("    HDD         : 2 TB");
        System.out.println("    VGA         : 2-way Nvidia GeForce TITAN X Dual SLI");
        System.out.println("    OS          : Windows 10 Home - 64bit");
        System.out.println("    Harga       : Rp 33399000");
    }
    public static void MSIVortexG25VR8RD (){
        System.out.println("  Merek PC    : MSI Vortex G25VR-8RD");
        System.out.println("    Processor   : Intel Core i7-8700");
        System.out.println("    RAM         : 16 GB");
        System.out.println("    SSD         : 512 GB");
        System.out.println("    HDD         : 1 TB");
        System.out.println("    VGA         : Nvidia GeForce GTX 1060");
        System.out.println("    OS          : Windows 10 Home - 64bit");
        System.out.println("    Harga       : Rp 34999000");
    }
    public static void main(String[] arg){
        Menu();
    }
    public static void Menu(){
        Scanner in = new Scanner(System.in);
        System.out.print("\n1.");
        AcerPredatorOrion9000();
        System.out.print("\n2.");
        ASUSROGGT51CH();
        System.out.print("\n3.");
        MSIVortexG25VR8RD();
        System.out.print("\nMasukan Kode : ");
        int menu = in.nextInt();
        switch (menu){
            case 1:
                TotalHarga = TotalHarga + 88499000;
                System.out.print("\nBayar : Rp ");
                Bayar = in.nextInt();
                System.out.println("Kembalian : Rp "+(Bayar-TotalHarga));
                break;
            case 2:
                TotalHarga = TotalHarga + 33399000;
                System.out.print("\nBayar : Rp ");
                Bayar = in.nextInt();
                System.out.println("Kembalian : Rp "+(Bayar-TotalHarga));
                break;
            case 3:
                TotalHarga = TotalHarga + 34999000;
                System.out.print("\nBayar : Rp ");
                Bayar = in.nextInt();
                System.out.println("Kembalian : Rp "+(Bayar-TotalHarga));
                break;
        }
    }
 
}
