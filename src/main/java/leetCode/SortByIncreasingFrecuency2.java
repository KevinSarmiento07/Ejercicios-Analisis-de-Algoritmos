package leetCode;

import java.util.*;
import java.util.stream.Collectors;

public class SortByIncreasingFrecuency2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String linea = s.nextLine();
        while (!linea.equals("")) {
            long startTime = System.nanoTime(); // Obtener tiempo inicial en nanosegundos
            String[] numsString = linea.split(" ");

            int[] nums = new int[numsString.length];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(numsString[i]);
            }

            int[] arr = new int[nums.length];
            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0;
                    i < nums.length;
                    i++) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i], map.get(nums[i]) + 1);
                    continue;
                }
                map.put(nums[i], 1);
            }
            Map<Integer, Integer> mapOrdenadoValor = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
            Map<Integer, List<Map.Entry<Integer, Integer>>> agrupadoPorValor = mapOrdenadoValor.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, LinkedHashMap::new, Collectors.toList()));

            agrupadoPorValor.values()
                    .forEach((List<Map.Entry<Integer, Integer>> lista) -> lista.sort(Comparator.comparing(Map.Entry<Integer, Integer>::getKey).reversed()));
            LinkedHashMap<Integer, Integer> resultado = agrupadoPorValor.values().stream().flatMap(List::stream).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
            int cont = 0;
            for (Map.Entry<Integer, Integer> entry
                    : resultado.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print(entry.getKey() + " ");
                    arr[cont] = entry.getKey();
                    cont++;
                }
            }
            long endTime = System.nanoTime(); // Obtener tiempo final en nanosegundos
               long duration = endTime - startTime; // Calcular la duración en nanosegundos
            // Convertir a diferentes unidades de tiempo y mostrar por consola
            System.out.println("Tiempo: " + duration );
            System.out.println();
            linea = s.nextLine();
            
             
        }

        System.out.println("terminó");

    }
}
