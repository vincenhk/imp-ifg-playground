package co.imp.tech.model;
import co.imp.tech.model.Lookup;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "pertanggungan")
public class Pertanggungan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "nama_tertanggung", length = 100)
    private String namaTertanggung;

    @NotNull
    @Column(name = "nomor_ktp", length = 16, unique = true)
    private String nomorKtp;

    @Column(name = "email", length = 150)
    private String email;

    @NotNull
    @Column(name = "nomor_telepon", length = 30)
    private String nomorTelepon;

    @NotNull
    @Column(name = "jangka_waktu_awal")
    private LocalDate jangkaWaktuAwal;

    @NotNull
    @Column(name = "jangka_waktu_akhir")
    private LocalDate jangkaWaktuAkhir;

    @NotNull
    @Column(name = "no_id_kapal", length = 30)
    private String noIdKapal;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "jenis_kapal", referencedColumnName = "lookup_key")
    private Lookup jenisKapal;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "konstruksi_kapal", referencedColumnName = "lookup_key")
    private Lookup konstruksiKapal;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "penggunaan_kapal", referencedColumnName = "lookup_key")
    private Lookup penggunaanKapal;

    @NotNull
    @Column(name = "harga_kapal", precision = 18, scale = 2)
    private BigDecimal hargaKapal;

    @NotNull
    @Column(name = "jenis_paket", length = 150)
    private String jenisPaket;
}