package leetCode;

import java.util.*;
import java.util.stream.Collectors;

public class SortByIncreasingFrecuencyOriginal {

    public static void main(String[] args) {
        int nums[] = {1};

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
                System.out.println(entry.getKey());
                arr[cont] = entry.getKey();
                cont++;
            }
        }
    }
}
