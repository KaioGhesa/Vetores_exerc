package vetores_exerc;
import java.util.*;

public class Exem_Array2 {
    //Exemplos de Array aula do Professor Duduchi 11/04/2024
    public static void main(String[] args) {
        System.out.println("Ordenando Numeros...");
        List<Integer> list2 = new ArrayList<Integer>();
        //colocando lista ordenada os umeros
        
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(31);
        list2.add(4);
        list2.add(44);
        
        Collections.sort(list2);
        /*fazer a lista em ordem crescente, 
        se caso quiser em decrescente seria: Collections.reverse(list2);**/
        for (Integer number : list2) {
            //corpo do loop ou seja ele vai mostrar até acabar os numeros
            System.out.println(number);
        }
    }
}
