package alura.com.forum.alura.topico;

import alura.com.forum.alura.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "perguntas")
@Entity(name= "Pergunta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String autor;
    private String titulo;
    private String curso;
    private String mensagem;
    private LocalDateTime data;
    private String situacao;

    public Topico(DadosCadastroTopico dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        } if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        } if(dados.autor() != null){
            this.autor = dados.autor();
        } if(dados.curso() != null) {
            this.curso = dados.curso();
        }
        this.data = LocalDateTime.now();
        this.situacao = "Não Respondido";
    }



    public Long getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getDataCriacao() {
        return data;
    }

    public String getNomeCurso() {
        return curso;
    }

    public void excluir() {
        this.situacao = "Respondido";
    }

    public void atualizarTopico(DadosAtualizacaoTopico dados) {
        if(dados.titulo() != null){
            this.titulo = dados.titulo();
        } if(dados.mensagem() != null){
            this.mensagem = dados.mensagem();
        } if(dados.autor() != null){
            this.autor = dados.autor();
        } if(dados.curso() != null) {
            this.curso = dados.curso();
        }
        this.data = LocalDateTime.now();
    }
}
