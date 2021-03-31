package poc.feign.presentation.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import poc.feign.api.services.CepService
import poc.feign.presentation.representations.CepRepresentation

@RestController
@RequestMapping("/cep")
class CepController(val cepService: CepService) {

    @GetMapping("/{code}")
    fun getAddress(@PathVariable code: String): ResponseEntity<CepRepresentation?> {
        return ResponseEntity.ok()
            .body(cepService.getCep(code))
    }
}