import androidx.lifecycle.ViewModel

class AlamatViewModel : ViewModel() {
    var nama: String? = null
    var jalan: String? = null
    var rt: String? = null
    var rw: String? = null
    var informasiTambahan: String? = null

    // Metode untuk menyimpan data alamat
    fun setAlamatData(nama: String, jalan: String, rt: String, rw: String, informasiTambahan: String) {
        this.nama = nama
        this.jalan = jalan
        this.rt = rt
        this.rw = rw
        this.informasiTambahan = informasiTambahan
    }
}
