package poc.feign.presentation.representations

import lombok.Data

@Data
data class CepRepresentation(
    val logradouro: String,
    val bairro: String,
    val cidade: String,
    val estado: String
)