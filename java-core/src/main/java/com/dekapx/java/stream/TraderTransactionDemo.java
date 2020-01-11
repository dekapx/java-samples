package com.dekapx.java.stream;

import com.dekapx.java.model.Trader;
import com.dekapx.java.model.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TraderTransactionDemo {
    private static Predicate<Transaction> filterByYearPredicate(final int year) {
        return t -> t.getYear() == year;
    }

    public static void main(String[] args) {
        final List<Transaction> allTransactions = getTraderTransactions();
        // Finds all transactions in 2011 and sort by value (small to high)
        final List<Transaction> year2011Transactions = allTransactions.stream()
                .filter(filterByYearPredicate(2011))
                .sorted(comparing(Transaction::getValue))
                .collect(Collectors.toList());
        printTransactions(year2011Transactions);
        
        // What are all the unique cities where the traders work?

        // Finds all traders from Cambridge and sort them by name

        // Returns a string of all traders’ names sorted alphabetically

        // Are any traders based in Milan?

        // Prints all transactions’ values from the traders living in Cambridge

        // What’s the highest value of all the transactions?

        // Finds the transaction with the smallest value
    }

    private static void printTransactions(final List<Transaction> transactions) {
        transactions.forEach(t -> System.out.println(t));
    }

    private static List<Transaction> getTraderTransactions() {
        final Trader raoul = new Trader("Raoul", "Cambridge");
        final Trader mario = new Trader("Mario","Milan");
        final Trader alan = new Trader("Alan","Cambridge");
        final Trader brian = new Trader("Brian","Cambridge");
        final List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }
}
