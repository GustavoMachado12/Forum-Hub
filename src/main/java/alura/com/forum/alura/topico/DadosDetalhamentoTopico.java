package alura.com.forum.alura.topico;

import alura.com.forum.alura.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id,
                                      String autor,
                                      String mensagem,
                                      String nomeCurso,
                                      String titulo,
                                      LocalDateTime data,
                                      String situacao) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getAutor(), topico.getTitulo(), topico.getNomeCurso(), topico.getMensagem(), topico.getDataCriacao(), topico.getSituacao());
    }

}
