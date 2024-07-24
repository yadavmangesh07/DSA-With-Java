package HashMap;

import java.util.*;

public class chefOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of chefs and emails
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Map<String, String> chefCountryMap = new HashMap<>();
        Map<String, Integer> chefVotes = new HashMap<>();
        Map<String, Integer> countryVotes = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String chef = scanner.next();
            String country = scanner.next();
            scanner.nextLine(); 

            chefCountryMap.put(chef, country);
            chefVotes.put(chef, 0);
            countryVotes.put(country, 0);
        }

        // Read email subjects and count votes
        for (int i = 0; i < M; i++) {
            String chef = scanner.nextLine();
            // Increment chef's votes
            chefVotes.put(chef, chefVotes.get(chef) + 1);
            // Increment corresponding country's votes
            String country = chefCountryMap.get(chef);
            countryVotes.put(country, countryVotes.get(country) + 1);
        }

        // Determine the Chef of the Year
        String topChef = null;
        int maxChefVotes = -1;

        for (Map.Entry<String, Integer> entry : chefVotes.entrySet()) {
            String chef = entry.getKey();
            int votes = entry.getValue();
            if (votes > maxChefVotes || (votes == maxChefVotes && chef.compareTo(topChef) < 0)) {
                maxChefVotes = votes;
                topChef = chef;
            }
        }

       
        String topCountry = null;
        int maxCountryVotes = -1;

        for (Map.Entry<String, Integer> entry : countryVotes.entrySet()) {
            String country = entry.getKey();
            int votes = entry.getValue();
            if (votes > maxCountryVotes || (votes == maxCountryVotes && country.compareTo(topCountry) < 0)) {
                maxCountryVotes = votes;
                topCountry = country;
            }
        }


        System.out.println(topCountry);
        System.out.println(topChef);
        scanner.close();
    }
}

