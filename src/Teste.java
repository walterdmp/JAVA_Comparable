
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Random;

public class Teste {

    public static Pessoa[] geraArrayPessoas() {
        return new Pessoa[]{
            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))

        };
    }

    public static Integer[] geraArrayAleatorio(int size, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Gera um número aleatório entre min e max
        }
        return array;
    }

    public static void main(String[] args) {
//        Pessoa[] vetorPessoas = geraArrayPessoas();
//        System.out.println("Pessoas vetor: ");
//        for(Pessoa p : vetorPessoas){
//            System.out.println(p);
//        }
//        System.out.println("");
//        
//        Comparator<Pessoa> comparaNome = (p1, p2) ->
//                p1.getNome().compareTo(p2.getNome());
//        
//        Comparator<Pessoa> comparaData = (p1, p2) ->
//                p1.getDataNasc().compareTo(p2.getDataNasc());
//        
////        BubbleSort<Pessoa> bSort = new BubbleSort<>();
////        bSort.sort(vetorPessoas, comparaNome);
////        
////        System.out.println("Pessoas Ordenadas pelo nome");
////        for(Pessoa p : vetorPessoas)
////            System.out.println(p);
////        
////        System.out.println("");
////        bSort.sort(vetorPessoas, comparaData);
////        System.out.println("");
////        System.out.println("Pessoas Ordenadas pela Data de Nascimento");
////        for(Pessoa p : vetorPessoas)
////            System.out.println(p);
//
//
//        SelectionSort<Pessoa> sSort = new SelectionSort<>();
//        InsertionSort<Pessoa> iSort = new InsertionSort<>();
//        iSort.sort(vetorPessoas, comparaNome);
//        
//        System.out.println("Pessoas Ordenadas pelo nome");
//        for(Pessoa p : vetorPessoas)
//            System.out.println(p);
//        
//        System.out.println("");
//        sSort.sort(vetorPessoas, comparaData);
//        System.out.println("");
//        System.out.println("Pessoas Ordenadas pela Data de Nascimento");
//        for(Pessoa p : vetorPessoas)
//            System.out.println(p);

        int tamanho = 10, min = 1, max = 100;

        Integer[] vetor1 = geraArrayAleatorio(tamanho, min, max);
        Integer[] vetor2 = new Integer[tamanho];
        Integer[] vetor3 = new Integer[tamanho];
        Integer[] vetor4 = new Integer[tamanho];
        Integer[] vetor5 = new Integer[tamanho];
        Integer[] vetor6 = new Integer[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = vetor1[i];
            vetor3[i] = vetor1[i];
            vetor4[i] = vetor1[i];
            vetor5[i] = vetor1[i];
            vetor6[i] = vetor1[i];
        }

        Comparator<Integer> comparatorInteiro = (a, b) -> a.compareTo(b);

        BubbleSort<Integer> bSort = new BubbleSort<>();
        SelectionSort<Integer> sSort = new SelectionSort<>();
        InsertionSort<Integer> iSort = new InsertionSort<>();

        long inicio = System.currentTimeMillis();
        bSort.sort(vetor1, comparatorInteiro);
        long tFinal = System.currentTimeMillis();
        long tempo = tFinal - inicio;
        System.out.println("Tempo do Bubble Sort: " + tempo + ", Comparacoes: " + bSort.getContaComparacoes());

        inicio = System.currentTimeMillis();
        bSort.sort(vetor2);
        tFinal = System.currentTimeMillis();
        tempo = tFinal - inicio;
        System.out.println("Tempo do Bubble Sort: " + tempo + ", Comparacoes: " + bSort.getContaComparacoes());

        inicio = System.currentTimeMillis();
        sSort.sort(vetor3, comparatorInteiro);
        tFinal = System.currentTimeMillis();
        tempo = tFinal - inicio;
        System.out.println("Tempo do Selection Sort: " + tempo + ", Comparacoes: " + sSort.getContaComparacoes());

        inicio = System.currentTimeMillis();
        sSort.sort(vetor4);
        tFinal = System.currentTimeMillis();
        tempo = tFinal - inicio;
        System.out.println("Tempo do Selection Sort: " + tempo + ", Comparacoes: " + sSort.getContaComparacoes());

        inicio = System.currentTimeMillis();
        iSort.sort(vetor5, comparatorInteiro);
        tFinal = System.currentTimeMillis();
        tempo = tFinal - inicio;
        System.out.println("Tempo do Insertion Sort: " + tempo + ", Comparacoes: " + iSort.getContaComparacoes());

        inicio = System.currentTimeMillis();
        iSort.sort(vetor6);
        tFinal = System.currentTimeMillis();
        tempo = tFinal - inicio;
        System.out.println("Tempo do Insertion Sort: " + tempo + ", Comparacoes: " + iSort.getContaComparacoes());
    }
}
