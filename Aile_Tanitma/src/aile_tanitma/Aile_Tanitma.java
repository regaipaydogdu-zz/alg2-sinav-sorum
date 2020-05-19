/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aile_tanitma;

/**
 *
 * @author Regaip Aydoğdu
 */
public class Aile_Tanitma {

    /**
     * @param args the command line arguments
     */
    
        public static class Dede{
        public String isim_soyisim;
        public String cinsiyet;
        public int yas;
        public int boy;
        public int kilo;
        public String meslek;
        public String akrabalik_duzeyi;
        public String es;
        public String hayati_durum;
    
    }
    public static class Ebeveynler extends Dede
    {
        private String cocuklari;
        private String hobi;
        private String dizi;
        public String giyim_tarzi;
        public String oyunlar;
    }
    
    public static class Cocuklar extends Ebeveynler
    {
        public void Dede_Tanit(String isim, String hayati_durum, int boy, int kilo, String akrabalik_duzey, String es)
        {
            System.out.println("-----------------------------------------\n" + "DEDEM\n" + "-----------------------------------------");
            System.out.println("Adi Soyadi-->" + isim + "\nHayati Durumu-->" + hayati_durum + "\nBoyu-->" + boy + "\nKilosu-->" + kilo + "\nAkrabalik Derecesi-->" + akrabalik_duzey + "\nEsi-->" + es);
        }
        public void Baba_Tanit(String isim, int yas, int boy, int kilo, String meslek, String es, String cocukla, String hobi)
        {
            System.out.println("-----------------------------------------\n" + "BABAM\n" + "-----------------------------------------");
            System.out.println("Adi Soyadi-->" + isim + "\nYasi-->" + yas + "\nBoyu-->" + boy + "\nKilosu-->" + kilo + "\nMeslegi-->" + meslek + "\nEsi-->" + es + "\nCocuklarinin Isimleri-->" + cocukla + "\nHobileri-->" + hobi);
        }
        public void Anne_Tanit(String isim, int yas, int boy, int kilo, String meslek, String dizi)
        {
            System.out.println("-----------------------------------------\n" + "ANNEM\n" + "-----------------------------------------");
            System.out.println("Adi Soyadi-->" + isim + "\nYasi-->" + yas + "\nBoyu-->" + boy + "\nKilosu-->" + kilo + "\nMeslegi-->" + meslek + "\nIzledigi Dizi-->" + dizi);
        }
        public void Kendimi_Tanit(String isim, int yas, int boy, int kilo, String meslek, String giyim_tarzi)
        {
            System.out.println("-----------------------------------------\n" + "KENDIM\n" + "-----------------------------------------");
            System.out.println("Adi Soyadi-->" + isim + "\nYasi-->" + yas + "\nBoyu-->" + boy + "\nKilosu-->" + kilo + "\nMeslegi-->" + meslek + "\nGiyim Tarzi-->" + giyim_tarzi);
        }
        public void Kardes_Tanit(String isim, int yas, int boy, int kilo, String meslek, String oyunlar)
        {
            System.out.println("-----------------------------------------\n" + "KARDESIM\n" + "-----------------------------------------");
            System.out.println("Adi Soyadi-->" + isim + "\nYasi-->" + yas + "\nBoyu-->" + boy + "\nKilosu-->" + kilo + "\nMeslegi-->" + meslek + "\nSevdigi Oyunlar-->" + oyunlar);
        }
    }
    public static void main(String[] args) {
        
            Dede dede = new Dede();
            Ebeveynler baba = new Ebeveynler();
            Ebeveynler anne = new Ebeveynler();
            Cocuklar kendim = new Cocuklar();
            Cocuklar kardes = new Cocuklar();

            kendim.Dede_Tanit(dede.isim_soyisim = "Ahmet Aydın", dede.hayati_durum= "Hayatta Degil", dede.boy=172,dede.kilo=75, dede.akrabalik_duzeyi="Dedem",dede.es="Emine");
            kendim.Baba_Tanit(baba.isim_soyisim = "Murat Aydın", baba.yas=54,baba.boy=180,baba.kilo=78,baba.meslek="Emekli",baba.es="Ayşe",baba.cocuklari="Cem Aydın, Ece Aydın",baba.hobi="Çiftlik Isleri Ile Ugrasmak");
            kendim.Anne_Tanit(anne.isim_soyisim = "Ayşe Aydın", anne.yas = 54, anne.boy = 160, anne.kilo = 80, anne.meslek = "Ev Hanimi", anne.dizi = "Yaprak Dökümü");
            kendim.Kendimi_Tanit(kendim.isim_soyisim = "Cem Aydın", kendim.yas = 21, kendim.boy = 179, kendim.kilo = 64, kendim.meslek = "Ogrenci", kendim.giyim_tarzi = "Spor Tarz");
            kendim.Kardes_Tanit(kardes.isim_soyisim="Ece Aydın",kardes.yas=14,kardes.boy=155,kardes.kilo=54,kardes.meslek="Ogrenci",kardes.oyunlar="Saklambac");
    }
    
}
