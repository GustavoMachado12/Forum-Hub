package alura.com.forum.alura.topico;

import alura.com.forum.alura.usuario.Usuario;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;


public record DadosCadastroTopico(@NotBlank String autor,
                                  @NotBlank String mensagem,
                                  @NotBlank String curso,
                                  @NotBlank String titulo
) {


}
