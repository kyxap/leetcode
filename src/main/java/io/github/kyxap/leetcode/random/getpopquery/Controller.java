package io.github.kyxap.leetcode.random.getpopquery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Controller {
    private Map<Integer, ArrayList<String>> accountToQueries = new HashMap<>();
    private Map<String, ArrayList<Integer>> queryToAccounts = new HashMap<>();

    public List<String> get(final int accountId, final String query) {
        accountToQueries.computeIfAbsent(accountId, k -> new ArrayList<>()).add(query);
        queryToAccounts.computeIfAbsent(query, k -> new ArrayList<>()).add(accountId);

        return prepareTop3Results(accountId, query);

    }

    private List<String> prepareTop3Results(final int accountId, final String query) {
        final List<Integer> accountsWithSameQuery = queryToAccounts.get(query);
        final List<String> allQ = new ArrayList<>();

        for (final int account : accountsWithSameQuery) {
            if (account != accountId) { // avoid adding prev q for current account
                final ArrayList<String> tmpQ = accountToQueries.get(account);
                for (final String q : tmpQ) {
                    allQ.add(q);
                }
            }
        }

        final Map<String, Long> occurrences = allQ.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        final List<String> topList = new LinkedList<>();

        occurrences.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> topList.add(e.getKey()));

        // remove and put user query to 0 index
        topList.remove(query);

        if (topList.size() >= 3) {
            final List<String> tmp = topList.subList(0, 3);
            tmp.add(0, query);
            return tmp;
        } else {
            topList.add(0, query);
            return topList;
        }
    }
}
