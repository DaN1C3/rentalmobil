class MobilPremium extends Mobil {
    private String premiumFeature;

    public MobilPremium(String merk, String warna, String premiumFeature) {
        // Konstruktor dari kelas induk (Mobil) dipanggil menggunakan kata kunci super() 
        // untuk menginisialisasi atribut-atribut merk dan warna dari kelas Mobil.
        super(merk, warna);
        this.premiumFeature = premiumFeature;
    }
    public String getPremiumFeature() {
        return premiumFeature;
    }
    public void setPremiumFeature(String premiumFeature) {
        this.premiumFeature = premiumFeature;
    }
    
    @Override
    public String toString() {
        // menggunakan super.toString() untuk mendapatkan representasi String dari atribut-atribut kelas induk (Mobil).
        return super.toString() + " - FITUR PREMIUM " + premiumFeature;
    }
}
