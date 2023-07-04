public class Mobil {
    private String merk;
    private String warna;
    private boolean tersedia;

    public Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
        this.tersedia = true;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    @Override
    public String toString() {
        return "|MOBIL |" +
                "MERK = '" + merk + '\'' +
                "| WARNA = '" + warna + '\'' +
                "| TERSEDIA = " + tersedia +
                '|';
    }
}