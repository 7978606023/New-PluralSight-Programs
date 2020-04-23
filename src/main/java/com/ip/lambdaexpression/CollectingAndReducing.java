package com.ip.lambdaexpression;

import java.math.BigDecimal;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.ip.model.Invoice;
import com.ip.model.InvoiceItem;
import com.ip.model.Persons;

/**
 * @author PRATAP
 *Your task: Implement the following methods and make the tests passs.
 */
public class CollectingAndReducing {
    /**
     * @param persons person
     * @return value
     */
    public static Double averageAge(final List<Persons> persons) {
        return persons.stream()
                .mapToInt(Persons::getAge)
                .average().getAsDouble();

    }

    /**
     * How old is the oldest person in the given list.
     * @param persons person
     * @return value
     */
    public static Integer maxAge(final List<Persons> persons) {
        return persons.stream()
                .mapToInt(Persons::getAge)
                .max().getAsInt();
    }

    /**
     * Compute Age-Statistics (max, min, average, ...)
     * for the given list of Persons.
     * @param persons person
     * @return value
     */
 public static IntSummaryStatistics ageStatistics(final List<Persons> persons) {
        return persons.stream()
                .mapToInt(Persons::getAge)
                .summaryStatistics();
    }

/**
 *Build a comma-separated list of the firstnames of a list of Persons.
 * Example-Result: "Maggie, Marge, Mary"
 * @param persons person
 * @return value
 */
public static String buildCommaSeparatedListOfFirstNames(
final List<Persons> persons) {
        return persons.stream()
                .map(Persons::getFirstName)
                .collect(Collectors.joining(", "));
    }

    /**
     * Identify the cheapest product (by pricePerUnit) in all invoices.
     * @param invoices invoice
     * @return value
     */
    public static String cheapestProduct(final List<Invoice> invoices) {
        return invoices.stream()
                .flatMap(invoice -> invoice.getItems().stream())
                .min(Comparator.comparing(InvoiceItem::getPricePerUnit))
                .get().getProduct();
    }

    /**
     * Identify the invoice with the highest total amount.
     * @param invoices invoice
     * @return value
     */
    public static Invoice mostExpensiveInvoice(final List<Invoice> invoices) {
        return invoices.stream()
                .collect(Collectors.<Invoice>maxBy(
                        Comparator.comparing(Invoice::getTotal))).get();
    }

    /**
     * Just what the method name says.
     * @param invoices invoice
     * @return value
     */
public static Map<String, List<Invoice>> groupInvoicesByRecipient(
final List<Invoice> invoices) {
        return invoices.stream()
                .collect(Collectors.groupingBy(Invoice::getRecipient));
    }

    /**
     *Compute the total amount, that each receiver spent.
     *Hint: Use the two-argument version of Collectors.groupingBy
     *together with Collectors.mapping.
     * @param invoices invoice
     * @return value
     */
public static Map<String, BigDecimal> expensesByRecipient(
final List<Invoice> invoices) {
        return invoices.stream()
                .collect(Collectors.groupingBy(
                        Invoice::getRecipient,
                        Collectors.mapping(
                                Invoice::getTotal,
                                Collectors.reducing(
                                        BigDecimal.ZERO,
                                        (sum, elem) -> sum.add(elem)))));
    }

    /**
     * How many items of each product have been purchased?
     * @param invoices invoice
     * @return value
     */
public static Map<String, Integer> countByProduct(
final List<Invoice> invoices) {
        return invoices.stream()
                .flatMap(invoice -> invoice.getItems().stream())
                .collect(Collectors.groupingBy(
                        InvoiceItem::getProduct,
                        Collectors.summingInt(InvoiceItem::getQuantity)));
    }

    /**
     *For every product, compute the cheapest dealer.
     *Return as a Map where the key is the product name and the value
     *is the dealer (=sender of the invoice).
     * @param invoices invoice
     * @return value
     */
public static Map<String, String> cheapestDealersByProduct(
final List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     *From a given list of invoices,
     *compute for every dealer the available products together with its price.
     * @param invoices invoice
     * @return value
     */
public static Map<String, List<ProductWithPrice>> computeDealerInventory(
final List<Invoice> invoices) {
        Function<SimpleEntry<String, ProductWithPrice>, String> classifier =
    (SimpleEntry<String, ProductWithPrice> entry) -> (String) entry.getKey();
    Function<SimpleEntry<String, ProductWithPrice>, ProductWithPrice> mapper =
 (SimpleEntry<String, ProductWithPrice> entry)
 -> (ProductWithPrice) entry.getValue();

        Map<String, List<Invoice>> invoicesBySender = invoices.stream()
                .collect(Collectors.groupingBy(Invoice::getSender));
        return invoicesBySender.entrySet().stream()
          .<SimpleEntry<String, ProductWithPrice>>flatMap(entry
           -> entry.getValue().stream()
           .flatMap((Invoice invoice) -> invoice.getItems().stream())
           .map((InvoiceItem item) -> new SimpleEntry<String, ProductWithPrice>(
                                entry.getKey(),
           new ProductWithPrice(item.getProduct(), item.getPricePerUnit()))))
                .distinct()
                .collect(Collectors.groupingBy(
                        classifier,
                        Collectors.mapping(
                                mapper,
                                Collectors.toList())));
    }

    /**
     * For every buyer, compute a list of his favorite products
     * (that is: a list of products ordered by the total count
     * of items bought).
     * For example: Homer bought 5 beers at Moes,
     * 2 beers and a burger at Crustys. Then the result should look like this:
     * {"Homer" -> ["Beer", "Burger"]}
     * @param invoices invoice
     * @return value
     */
    public static Map<String, List<String>> favoriteArticlesByBuyer(
     final List<Invoice> invoices) {
        return Collections.emptyMap();
    }

    /**
     * @author PRATAP
     *
     */
    public static class ProductWithPrice {
        /**
         *Declaring product name.
         */
        private String productName;
        /**
         *Declaring price.
         */
        private BigDecimal price;

        /**
         * @param productName productname
         * @param price
         */
     public ProductWithPrice(final String productName, final BigDecimal price) {
            this.productName = productName;
            this.price = price;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return productName;
        }

        /**
         * @return price
         */
        public BigDecimal getPrice() {
            return price;
        }

 @Override
public boolean equals(final Object o) {
if (this == o) {
return true;
}
if (o == null || getClass() != o.getClass()) {
return false;
}

ProductWithPrice that = (ProductWithPrice) o;
if (price != null ? !price.equals(that.price) : that.price != null) {
return false;
} if (productName != null ? !productName.equals(that.productName)
 : that.productName != null) {
return false;
}

            return true;
        }

        @Override
        public int hashCode() {
            int result = productName != null ? productName.hashCode() : 0;
            result = 31 * result + (price != null ? price.hashCode() : 0);
            return result;
        }

        @Override
        public final String toString() {
            return "ProductWithPrice{"
        + "productName='" + productName + '\''
        + ", price=" + price + '}';
        }
    }

}
