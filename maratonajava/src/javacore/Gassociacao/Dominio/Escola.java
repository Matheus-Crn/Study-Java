package javacore.Gassociacao.Dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {  // sobrecarga de construtor
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Escola" + nome);
        if(professores == null) return;
        for(Professor professor : professores){ // caso o getNome do professor não fosse criado,
                                                // ele iria apresentar erro
            System.out.println(professor.getNome());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professores;
    }

    public void setProfessor(Professor[] professor) {
        this.professores = professor;
    }
}
