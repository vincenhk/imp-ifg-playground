package co.imp.tech.service;

import co.imp.tech.dto.request.AddPertangungganRequestDto;
import co.imp.tech.model.Pertanggungan;
import co.imp.tech.repository.PertanggunganRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PertanggunganService {

    private PertanggunganRepository pertanggunganRepository;

    public Pertanggungan createPertanggungan(AddPertangungganRequestDto pertanggunganDTO) {

        Pertanggungan pertanggungan = new Pertanggungan();
        pertanggungan.setNamaTertanggung(pertanggunganDTO.getNamaTertanggung());
        pertanggungan.setNomorKtp(pertanggunganDTO.getNomorKtp());
        pertanggungan.setEmail(pertanggunganDTO.getEmail());
        pertanggungan.setNomorTelepon(pertanggunganDTO.getNomorTelepon());
        pertanggungan.setJangkaWaktuAwal(pertanggunganDTO.getJangkaWaktuAwal());
        pertanggungan.setJangkaWaktuAkhir(pertanggunganDTO.getJangkaWaktuAkhir());
        pertanggungan.setNoIdKapal(pertanggunganDTO.getNoIdKapal());
        pertanggungan.setJenisKapal(pertanggunganDTO.getJenisKapal());
        pertanggungan.setKonstruksiKapal(pertanggunganDTO.getKonstruksiKapal());
        pertanggungan.setPenggunaanKapal(pertanggunganDTO.getPenggunaanKapal());
        pertanggungan.setHargaKapal(pertanggunganDTO.getHargaKapal());
        pertanggungan.setJenisPaket(pertanggunganDTO.getJenisPaket());

        return pertanggunganRepository.save(pertanggungan);
    }


}