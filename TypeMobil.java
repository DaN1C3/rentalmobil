abstract class TypeMobil {
    private String merk;
    private String warna;

    public TypeMobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    // Metode abstrak untuk mendapatkan fitur premium (hanya didefinisikan di kelas turunannya).
    public abstract String getFiturPremium();
}
