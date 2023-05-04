package leetCode;
import java.util.*;
import java.util.stream.Collectors;
public class SortByIncreasingFrecuency {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
             long startTime = System.nanoTime(); // Obtener tiempo inicial en nanosegundos
            int size = rand.nextInt(100);  // Generar un tamaño aleatorio entre 0 y 99
            int[] nums = new int[size];
            for (int j = 0; j < size; j++) {
                nums[j] = rand.nextInt(100) + 1;
            }
             int [] arr = new int [nums.length];
            Map<Integer,Integer> map = new TreeMap<>();
            for(int j = 0; j < nums.length;j++){
               if(map.containsKey(nums[j])){
                   map.put(nums[j], map.get(nums[j]) + 1);
                   continue;
               }
               map.put(nums[j], 1);
            }
            Map<Integer,Integer> mapOrdenadoValor = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b) -> a, LinkedHashMap::new));
           Map<Integer, List<Map.Entry<Integer, Integer>>> agrupadoPorValor = mapOrdenadoValor.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, LinkedHashMap::new, Collectors.toList()));
           agrupadoPorValor.values().forEach((List<Map.Entry<Integer, Integer>> lista) -> lista.sort(Comparator.comparing(Map.Entry<Integer, Integer>::getKey).reversed()));
            LinkedHashMap<Integer, Integer> resultado = agrupadoPorValor.values().stream().flatMap(List::stream).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
            int cont = 0;
            for (Map.Entry<Integer, Integer> entry : resultado.entrySet()) {
                for(int j = 0; j < entry.getValue(); j++){
                    System.out.print(entry.getKey() + " ");
                    arr[cont] = entry.getKey();
                    cont++;
                }
            }
            
            System.out.println();
            long endTime = System.nanoTime(); // Obtener tiempo final en nanosegundos
            long duration = endTime - startTime; // Calcular la duración en nanosegundos
            // Convertir a diferentes unidades de tiempo y mostrar por consola
            System.out.println("Tiempo: " + duration + " del caso: " + i);
        }
    }
}
