package co.imp.tech.controller;

import co.imp.tech.dto.request.AddPertangungganRequestDto;
import co.imp.tech.model.Pertanggungan;
import co.imp.tech.service.PertanggunganService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pertanggungan")
@RequiredArgsConstructor
public class PertanggunganController {

    private PertanggunganService pertanggunganService;

    @PostMapping("/create")
    public ResponseEntity<Pertanggungan> createPertanggungan(@RequestBody AddPertangungganRequestDto pertanggunganDTO) {
        Pertanggungan savedPertanggungan = pertanggunganService.createPertanggungan(pertanggunganDTO);
        return ResponseEntity.ok(savedPertanggungan);
    }
}
