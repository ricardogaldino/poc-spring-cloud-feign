package poc.feign.api.services

import org.springframework.stereotype.Service
import poc.feign.api.interfaces.CepApiClient
import poc.feign.presentation.representations.CepRepresentation

@Service
class CepService(val cepApiClient: CepApiClient) {
    fun getCep(cep: String): CepRepresentation? {
        return cepApiClient.getCep(cep)
    }
}