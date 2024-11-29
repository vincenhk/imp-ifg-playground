package co.imp.tech.dto.request;

import co.imp.tech.model.Lookup;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AddPertangungganRequestDto {

    @NotNull
    private String namaTertanggung;

    @NotNull
    private String nomorKtp;

    private String email;

    @NotNull
    private String nomorTelepon;

    @NotNull
    private LocalDate jangkaWaktuAwal;

    @NotNull
    private LocalDate jangkaWaktuAkhir;

    @NotNull
    private String noIdKapal;

    @NotNull
    private Lookup jenisKapal;

    @NotNull
    private Lookup konstruksiKapal;

    @NotNull
    private Lookup penggunaanKapal;

    @NotNull
    private BigDecimal hargaKapal;

    @NotNull
    private String jenisPaket;
}
