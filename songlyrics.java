package konten;

public class songlyrics {

    public static void main(String[] args) {
        String[] lyric = {
            "Penjaga hati by Nadhif ",
            "Karna bersamamu semua terasa indah",
            "Gundah gulana hatiku pun hancur sirna",
            "Janji ku tak kan ku lepas wahai kau bidadariku dari surga",
            "Tuk selamanya...",
        };
        
        //menampilkan lirik secara bergantian
        for (String baris : lyric) {
            System.out.println(baris);
            
            try {
                Thread.sleep(3880); 
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
