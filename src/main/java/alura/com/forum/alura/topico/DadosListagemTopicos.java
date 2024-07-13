package alura.com.forum.alura.topico;

import java.time.LocalDateTime;

public record DadosListagemTopicos(Long id,
                                 String titulo,
                                 String mensagem,
                                 String autor,
                                 String curso
) {

    public DadosListagemTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getAutor(), topico.getNomeCurso());
    }
}
