abstract class JenisMobil {
    private String merk;
    private String warna;

    public JenisMobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    // Method abstract untuk mendapatkan jenis mobil (hanya didefinisikan di kelas turunannya).
    public abstract String getJenisMobil();

    @Override
    public String toString() {
        return "| JENIS MOBIL |" +
                " MERK = '" + getMerk() + '\'' +
                "| WARNA = '" + getWarna() + '\'' +
                "| JENIS MOBIL: " + getJenisMobil() +
                '|';
    }
}

class Jeep extends JenisMobil {
    public Jeep(String merk, String warna) {
        super(merk, warna);
    }

    @Override
    public String getJenisMobil() {
        return "Jeep";
    }
}

class SUV extends JenisMobil {
    public SUV(String merk, String warna) {
        super(merk, warna);
    }

    @Override
    public String getJenisMobil() {
        return "SUV";
    }
}

class Sedan extends JenisMobil {
    public Sedan(String merk, String warna) {
        super(merk, warna);
    }

    @Override
    public String getJenisMobil() {
        return "Sedan";
    }
}
