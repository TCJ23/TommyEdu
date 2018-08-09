package advanced.java.collections.issue24;

import java.util.*;

class Demo_Map_v2 {
    public static void main(String[] args) {
        Map<Integer, String> mapHttpErrors = new HashMap<>();

        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");
        mapHttpErrors.put(400, "Bad Request");
        mapHttpErrors.put(304, "Not Modified");
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(301, "Moved Permanently");
        mapHttpErrors.put(500, "Internal Server Error"); // NO DUPES

        System.out.println(mapHttpErrors);
        System.out.println(mapHttpErrors.get(301));
        if (mapHttpErrors.containsKey("200")) {
            System.out.println("Http status 200");
        }
        if (mapHttpErrors.containsValue("OK")) {
            System.out.println("Found status OK");
        }
        String removedValue = mapHttpErrors.remove(500);

        if (removedValue != null) {
            System.out.println("Removed value: " + removedValue);
        }
        System.out.println();
        System.out.println("Map before: " + mapHttpErrors);

        mapHttpErrors.replace(304, "No Changes");

        System.out.println("Map after: " + mapHttpErrors);

        System.out.println("Map before: " + mapHttpErrors);

        mapHttpErrors.replace(304, "No Changes");

        System.out.println("Map after: " + mapHttpErrors);

        if (mapHttpErrors.isEmpty()) {
            System.out.println("No Error");
        } else {
            System.out.println("Have HTTP Errors");
        }

        Map<String, String> mapContacts = new LinkedHashMap<>();

        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0981127421", "John");

        System.out.println(mapContacts); //ISNERTION ORDER

        Map<String, String> mapLang = new TreeMap<>();

        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");

        System.out.println(mapLang); //NATURAL ORDER

        Map<String, String> mapCountryCodes = new HashMap<>();

        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("44", "United Kingdom");
        mapCountryCodes.put("33", "France");
        mapCountryCodes.put("81", "Japan");

        Set<String> setCodes = mapCountryCodes.keySet();
        Iterator<String> iterator = setCodes.iterator();

        while (iterator.hasNext()) {
            String code = iterator.next();
            String country = mapCountryCodes.get(code);

            System.out.println("KEYSET " + code + " => " + country);

            Collection<String> countries = mapCountryCodes.values();

            for (String countrys : countries) {
                System.out.println("VALUES " + countrys);
            }
        }
        Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();

       /* for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("ENTRY SET " + key + " => " + value);
        }*/
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equalsIgnoreCase("1")) {
                entry.setValue("POLAND");
                System.out.println("ENTRY SET " + key + " => " + value);
            }
            System.out.println("ENTRY SET " + key + " => " + value);
        }
      /*  System.out.println(mapCountryCodes.values());
        Set<Map.Entry<String, String>> entries2 = mapCountryCodes.entrySet();
        for (Map.Entry<String, String> entry : entries2) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("ENTRY SET " + key + " => " + value);
        }*/

        mapCountryCodes.forEach(
                (code, country) -> System.out.println(code + " => " + country));
        mapHttpErrors.clear();
        System.out.println("Is map empty? " + mapHttpErrors.isEmpty());
        Map<Integer, String> countryCodesEU = new HashMap<>();

        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");

        Map<Integer, String> countryCodesWorld = new HashMap<>();

        countryCodesWorld.put(1, "United States");
        countryCodesWorld.put(86, "China");
        countryCodesWorld.put(82, "South Korea");


        System.out.println("Before: " + countryCodesWorld);

        countryCodesWorld.putAll(countryCodesEU);

        System.out.println("After: " + countryCodesWorld);
    }
}
