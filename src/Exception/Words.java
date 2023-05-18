package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Words {
           public static void main(String[] args) throws IOException {
            TreeMap<String, LinkedList<Integer>> orderMap = new TreeMap<String, LinkedList<Integer>>();
            Set<Integer> tableSet = new TreeSet<Integer>();

            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line = null;

            while ((line = in.readLine()) != null) {
                String[] orders = line.split(",");

                for (int i = 0; i < orders.length; i++) {

                    tableSet.add(Integer.parseInt(orders[1]));
                }

                if (!(orderMap.containsKey(orders[2]))) {
                    LinkedList<Integer> numbersTables = new LinkedList<>();
                    numbersTables.add(Integer.parseInt(orders[1]));

                    orderMap.put(orders[2], numbersTables);
                } else {
                    orderMap.get(orders[2]).addLast(Integer.parseInt(orders[1]));
                }

                StringBuilder sBuilder = new StringBuilder("Table");

                Set<String>keysOrderMapSet=orderMap.keySet();
                for (String keyString : keysOrderMapSet) {
                    sBuilder.append(',').append(keyString);
                }

                for(Integer key : tableSet){
                    sBuilder.append("\n").append(key);

                    for(Map.Entry<String, LinkedList<Integer>> entry : orderMap.entrySet())
                    {
                        LinkedList<Integer> numbersOrder = entry.getValue();
                        int counterOrder = 0;

                        for (int i = 0; i < numbersOrder.size(); i++) {
                            if(numbersOrder.get(i)==key) {
                                counterOrder++;
                            }
                        }
                        sBuilder.append(',').append(counterOrder);
                    }
                }
                System.out.println(sBuilder.toString());
            }
        }
    }