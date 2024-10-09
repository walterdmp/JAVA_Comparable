
import java.util.Comparator;


public class InsertionSort<T extends Comparable<T>> {
    
    private long contaComparacoes;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
    
    private void insert(T[] v, int i, Comparator<T> comparator){
        T eleito = v[i];
        int comp = i - 1;
        
        while(comp >= 0 && comparator.compare(eleito, v[comp])< 0){
            this.contaComparacoes++;
            v[comp + 1] = v[comp];
            comp--;
        }
        v[comp + 1] = eleito;
    }
    
    private void insert(T[] v, int i){
        T eleito = v[i];
        int comp = i - 1;
        
        while(comp >= 0 && eleito.compareTo(v[comp])< 0){
            this.contaComparacoes++;
            v[comp + 1] = v[comp];
            comp--;
        }
        v[comp + 1] = eleito;
    }
    
    public void sort(T[] v, Comparator<T> comparator){
        for (int i = 1; i < v.length; i++) {
            insert(v, i, comparator);
        }
    }
    
    public void sort(T[] v){
        this.contaComparacoes = 0;
        for (int i = 1; i < v.length; i++) {
            insert(v, i);
        }
    }
}
