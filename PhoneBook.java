/*
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.*;

public class PhoneBook {
  
    private Map<String, List<String>> map = new HashMap<>();
  
    public void add(String name, String number) {
      List<String> numbers;
      if (map.containsKey(name)) {
        numbers = map.get(name);
      } else {
        numbers = new ArrayList<>();
      }
      numbers.add(number);
      map.put(name, numbers);
    }
  
    public List<String> get(String name) {
      return map.get(name);
    }
  
  }