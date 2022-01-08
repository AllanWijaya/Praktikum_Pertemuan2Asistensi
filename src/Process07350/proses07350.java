package Process07350;
import java.util.ArrayList;
import Entity07350.*;
import java.util.Scanner;
public class proses07350 {
    private static Scanner input07350 = new Scanner(System.in);
    ArrayList<sepatu07350> shoes07350 = new ArrayList<sepatu07350>();
    public void tambahSepatu07350(sepatu07350 data){
        shoes07350.add(data);
    }
    public void tampil(){
        for(int i=0;i<shoes07350.size();i++){
            System.out.println("==============================================");
            System.out.println("Kode Barang : "+shoes07350.get(i).getKode07350());
            System.out.println("==============================================");
            System.out.println("Merek       : "+shoes07350.get(i).getMerek07350());
            System.out.println("Jenis       : "+shoes07350.get(i).getJenis07350());
            System.out.println("Warna       : "+shoes07350.get(i).getWarna07350());
            System.out.println("==============================================");
        }
    }
    public int cariKode(String kode07350){
        int loop07350=0;
        for(sepatu07350 prosess07350 : shoes07350){
            if(prosess07350.getKode07350().equals(kode07350)){
                break;
            }
            else{
                loop07350++;
            }
        }
        return loop07350;
    }
    public void delete07350(){
        System.out.print("Masukkan kode barang sepatu yang akan dihapus : ");
        String search = input07350.next();
        this.shoes07350.removeIf(shoes07350 -> shoes07350.getKode07350() == search);
    }
    public void tampil(String kode07350){
        int cari07350=cariKode(kode07350);
        System.out.println("==============================================");
        System.out.println("Kode Barang : "+shoes07350.get(cari07350).getKode07350());
        System.out.println("==============================================");
        System.out.println("Merek       : "+shoes07350.get(cari07350).getMerek07350());
        System.out.println("Jenis       : "+shoes07350.get(cari07350).getJenis07350());
        System.out.println("Warna       : "+shoes07350.get(cari07350).getWarna07350());
        System.out.println("==============================================");      
    }
}      