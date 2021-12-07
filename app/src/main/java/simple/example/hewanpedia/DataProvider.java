package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Buah;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Makanan;
import simple.example.hewanpedia.model.Sayuran;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Buah> initDataKucing(Context ctx) {
        List<Buah> buahs = new ArrayList<>();
        buahs.add(new Buah("Buah Naga", "",
                "Kualitas sayuran daun yang baik memiliki ciri-ciri bagian daun utuh, tidak membusuk dan tidak berlubang bekas gigitan hama", R.drawable.buahnaga));
        buahs.add(new Buah("Mangga", "",
                "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya", R.drawable.mangga));
        buahs.add(new Buah("Melon", "",
                "Melon merupakan nama buah sekaligus tanaman yang menghasilkannya yang termasuk dalam suku labu-labuan atau Cucurbitaceae", R.drawable.melon));
        buahs.add(new Buah("Rambutan", "",
                "Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah kepulauan di Asia Tenggara", R.drawable.rambutan));
        buahs.add(new Buah("Salak", "",
                "Salak adalah sejenis palma dengan buah yang biasa dimakan. Ia dikenal juga sebagai sala", R.drawable.salak));
        buahs.add(new Buah("Semangka", "",
                "Semangka adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan ", R.drawable.cat_siberian));
        return buahs;
    }

    private static List<Sayuran> initDataAnjing(Context ctx) {
        List<Sayuran> sayurans = new ArrayList<>();
        sayurans.add(new Sayuran("Sayuran Daun", "",
                "Kualitas sayuran daun yang baik memiliki ciri-ciri bagian daun utuh, tidak membusuk dan tidak berlubang bekas gigitan hama", R.drawable.daun));
        sayurans.add(new Sayuran("Sayuran Batang", " ",
                "Sayuran batang merupakan bagian dari tumbuhan yang terdiri dari buku dan ruas", R.drawable.batang));
        sayurans.add(new Sayuran("Sayuran Buah", "",
                "Kualitas sayuran buah yang baik memiliki ciri-ciri :Tingkat umur cukup (tidak terlalu muda dan tidak terlalu dewasa).", R.drawable.buah));
        sayurans.add(new Sayuran("Sayuran Jamur", "",
                "Kualitas sayuran jamur yang baik memiliki ciri-ciri :Sayuran jamur masih muda hingga cukup umur.", R.drawable.jamur));
        sayurans.add(new  Sayuran("Sayuran Umbi", "",
                "Kualitas sayuran umbi lapis yang baik memiliki ciri-ciri :Umbi lapis sudah cukup umur", R.drawable.umbi));
        sayurans.add(new Sayuran("Sayuran Polong", "",
                "Kualitas sayuran polong yang baik memiliki ciri-ciri : Sayuran tidak tua, kulit buah masih lurus dan benjolan biji belum tampak ", R.drawable.polong));
        return sayurans;
    }

    private static List<Makanan>initDataBuaya(Context ctx) {
        List<Makanan> makanans = new ArrayList<>();
        makanans.add(new Makanan("Rendang", "",
                " Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau", R.drawable.rendang));
        makanans.add(new Makanan("Nasi Goreng", "",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega", R.drawable.nasigoreng));
        makanans.add(new Makanan("Mie Ayam", "",
                "Mi ayam, mie ayam atau bakmi ayam adalah hidangan Indonesia yang terbuat dari mie gandum kuning yang dibumbui dengan daging ayam yang biasanya dipotong dadu", R.drawable.mieayam));
        makanans.add(new Makanan("Angkringan", "",
                " Angkringan adalah sebuah gerobak dorong untuk menjual berbagai macam makanan dan minuman di pinggir jalan di Jawa Tengah, Yogyakarta, dan Jawa Timur", R.drawable.angkringan));
        makanans.add(new Makanan("Sate", "",
                " Sate atau satai adalah makanan yang terbuat dari daging yang dipotong kecil-kecil dan ditusuk sedemikian rupa dengan tusukan lidi tulang daun kelapa atau bambu, kemudian dipanggang menggunakan bara arang kayu", R.drawable.sate));
        makanans.add(new Makanan("Bakso", "",
                "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia", R.drawable.bakso));
        return makanans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
