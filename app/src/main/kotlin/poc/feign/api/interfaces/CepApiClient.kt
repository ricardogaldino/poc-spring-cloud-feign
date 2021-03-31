package poc.feign.api.interfaces

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import poc.feign.presentation.representations.CepRepresentation

@FeignClient(name = "CepApiClient", url = "https://api.postmon.com.br")
interface CepApiClient {
    @GetMapping("/v1/cep/{cep}")
    fun getCep(@PathVariable("cep") cep: String?): CepRepresentation?
}