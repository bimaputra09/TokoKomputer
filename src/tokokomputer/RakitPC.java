package tokokomputer;
import java.util.Scanner;

public class RakitPC{

    private static int TotalHarga;
    private static String Motherboard;
    private static String Processor;
    private static String RandomAccessMemory;
    private static String GraphicCard;
    private static String CasingPC;
    private static int Bayar;
    
    
    public static void main(String[] arg){
        Menu();
    }
    public static void Menu(){
        Scanner in = new Scanner(System.in);
        
        //Motherboard
        System.out.println(" ");
        System.out.println("MotherBoard             : 1. AsRock Z270 Killer SLI/ac     -- Rp. 2830000   4. Asus RoG Maximus IX Hero -- Rp 4250000");
        System.out.println("                          2. Gigabyte Aorus Z270X-Gaming 9 -- Rp. 8890000   5. Asus Prime Z270-A        -- Rp 3100000");
        System.out.println("                          3. MSI Z270 SLI Plus             -- Rp. 2850000");
        System.out.print("Masukan Kode : ");
        int MotherBoard = in.nextInt();
        switch (MotherBoard) {
            case 1:
                Motherboard = "AsRock Z270 Killer SLI/ac";
                TotalHarga = TotalHarga + 2830000;
                break;
            case 2:
                Motherboard = "Gigabyte Aorus Z270X-Gaming 9";
                TotalHarga = TotalHarga + 8890000;
                break;
            case 3:
                Motherboard = "MSI Z270 SLI Plus";
                TotalHarga = TotalHarga + 2850000;
                break;
            case 4:
                Motherboard = "Asus RoG Maximus IX Hero";
                TotalHarga = TotalHarga + 4250000;
                break;
            case 5:
                Motherboard = "Asus Prime Z270-A";
                TotalHarga = TotalHarga + 3100000;
                break;
            default:
                break;
        }
        
        //Processor
        System.out.println(" ");
        System.out.println("Processor               : 1. Intel Core i9 7980xe 18 core   -- Rp. 29035000   3. Intel Core i3 7100   -- Rp. 1675000");
        System.out.println("                          2. Intel Core i7 8700k            -- Rp. 5825000");
        System.out.println("                          3. Intel Core i5 8400             -- Rp. 2830000");
        System.out.print("Masukan Kode : ");
        int Procesor = in.nextInt();
        switch (Procesor) {
            case 1:
                Processor = "Intel Core i9 7980xe 18 core";
                TotalHarga = TotalHarga + 29035000;
                break;
            case 2:
                Processor = "Intel Core i7 8700k";
                TotalHarga = TotalHarga + 5825000;
                break;
            case 3:
                Processor = "Intel Core i5 8400";
                TotalHarga = TotalHarga + 2830000;
                break;
            case 4:
                Processor = "Intel Core i3 7100";
                TotalHarga = TotalHarga + 1675000;
                break;
            default:
                break;
        }
        
        //RAM
        System.out.println(" ");
        System.out.println("Random Access Memory    : 1. GSKILL Aegis Series Memory PC 2 x 4GB DDR4         -- Rp. 1435000");
        System.out.println("                          2. KINGSTON Memory PC 2 x 8GB DDR4                    -- Rp. 2840000");
        System.out.println("                          3. GSKILL Ripjaws V Series Memory PC 2 x 16GB DDR4    -- Rp. 5858000");
        System.out.print("Masukan Kode : ");
        int RAM = in.nextInt();
        switch (RAM) {
            case 1:
                RandomAccessMemory = "KINGSTON Memory PC 2 x 8GB DDR4 PC";
                TotalHarga = TotalHarga + 1435000;
                break;
            case 2:
                RandomAccessMemory = "Gigabyte Aorus Z270X-Gaming 9";
                TotalHarga = TotalHarga + 2840000;
                break;
            case 3:
                RandomAccessMemory = "MSI Z270 SLI Plus";
                TotalHarga = TotalHarga + 5858000;
                break;
            default:
                break;
        }
        
        //Graphic Card
        System.out.println(" ");
        System.out.println("VGA                     : 1. NVIDIA TITAN Xp            -- Rp. 21758000   4. NVIDIA GeForce GTX 1060     -- Rp 6570000");
        System.out.println("                          2. NVIDIA GeForce GTX 1080 Ti -- Rp. 12750000   5. NVIDIA GeForce GTX 1050 Ti  -- Rp 2018000");
        System.out.println("                          3. NVIDIA GeForce GTX 1070    -- Rp. 7935000");
        System.out.print("Masukan Kode : ");
        int VGA = in.nextInt();
        switch (VGA) {
            case 1:
                GraphicCard = "NVIDIA TITAN Xp";
                TotalHarga = TotalHarga + 21758000;
                break;
            case 2:
                GraphicCard = "NVIDIA GeForce GTX 1080 Ti";
                TotalHarga = TotalHarga + 12750000;
                break;
            case 3:
                GraphicCard = "NVIDIA GeForce GTX 1070";
                TotalHarga = TotalHarga + 7935000;
                break;
            case 4:
                GraphicCard = "NVIDIA GeForce GTX 1060";
                TotalHarga = TotalHarga + 6570000;
                break;
            case 5:
                GraphicCard = "NVIDIA GeForce GTX 1050 Ti";
                TotalHarga = TotalHarga + 2018000;
                break;
            default:
                break;
        }
        
        //Casing PC
        System.out.println(" ");
        System.out.println("Casing PC               : 1. Armaggeddon M1X        -- Rp. 300000   4. Digital alliance N11   -- Rp 450000");
        System.out.println("                          2. Armaggeddon M1G        -- Rp. 325000   5. Infinity Magma ATX     -- Rp 460000");
        System.out.println("                          3. Gaming VenomRX Bravos  -- Rp. 33000");
        System.out.print("Masukan Kode : ");
        int casing = in.nextInt();
        switch (casing) {
            case 1:
                CasingPC = "Armaggeddon M1X";
                TotalHarga = TotalHarga + 300000;
                break;
            case 2:
                CasingPC = "Armaggeddon M1G";
                TotalHarga = TotalHarga + 325000;
                break;
            case 3:
                CasingPC = "Gaming VenomRX Bravos";
                TotalHarga = TotalHarga + 33000;
                break;
            case 4:
                CasingPC = "Digital alliance N11";
                TotalHarga = TotalHarga + 450000;
                break;
            case 5:
                CasingPC = "Infinity Magma ATX";
                TotalHarga = TotalHarga + 460000;
                break;
            default:
                break;
        }
        Tampilan_Data();
        System.out.print("\nBayar : Rp ");
        Bayar = in.nextInt();
        System.out.println("Kembalian : Rp "+(Bayar-TotalHarga));
        
    }
    
    public static void Tampilan_Data(){
        System.out.println("\n========================= DATA  PC ===========================");
        System.out.println("Motherboard             : "+Motherboard);
        System.out.println("Processor               : "+Processor);
        System.out.println("Random Access Memory    : "+RandomAccessMemory);
        System.out.println("VGA                     : "+GraphicCard);
        System.out.println("Casing PC               : "+CasingPC);
        System.out.println("Total                   : Rp "+TotalHarga);
    }
}