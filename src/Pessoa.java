
import java.time.LocalDate;


public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private LocalDate dataNasc;

    public Pessoa(String nome, LocalDate dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data Nascimento: " + dataNasc + '.';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        int comparaNome = this.nome.compareTo(pessoa.getNome());
        if(comparaNome == 0 ){
            return this.dataNasc.compareTo(pessoa.getDataNasc());
        }
        return comparaNome;
    }
    
    
}
