
import java.util.Comparator;


public class SelectionSort<T extends Comparable<T>> {
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
    
    private int indiceMenorValor(T[] v, int posicao, Comparator<T> comparador){
        int indiceMenor = posicao;
        for(int i = posicao + 1; i < v.length; i++){
            this.contaComparacoes++;
            if(comparador.compare(v[i], v[indiceMenor]) < 0){
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }
    
    private int indiceMenorValor(T[] v, int posicao){
        int indiceMenor = posicao;
        for(int i = posicao + 1; i < v.length; i++){
            this.contaComparacoes++;
            if(v[i].compareTo(v[indiceMenor]) < 0){
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }
    
    void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    
    public void sort(T[] v, Comparator<T> comparador){
        this.contaComparacoes = 0;
        for(int i = 0; i < v.length - 1; i++){
            int indiceMenor = indiceMenorValor(v, i, comparador);
            troca(v, i, indiceMenor);
        }
    }
    
    public void sort(T[] v){
        this.contaComparacoes = 0;
        for(int i = 0; i < v.length - 1; i++){
            int indiceMenor = indiceMenorValor(v, i);
            troca(v, i, indiceMenor);
        }
    }
    
}

