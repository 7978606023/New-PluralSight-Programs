package com.ip.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PRATAP
 *
 */
public class Invoice {

    /**
     *Declairing sender.
     */
    private String sender;
    /**
     *Declaring recipient.
     */
    private String recipient;
    /**
     *Declaring items.
     */
    private List<InvoiceItem> items;

    /**
     * @return sender.
     */
    public String getSender() {
        return sender;
    }

    /**
     * @return recipient
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * @return items
     */
    public List<InvoiceItem> getItems() {
        return items;
    }

    /**
     * @return value
     */
    public BigDecimal getTotal() {
        return getItems().stream()
            .<BigDecimal>map(invoice -> invoice
                    .getPricePerUnit()
                    .multiply(BigDecimal.valueOf(invoice.getQuantity())))
            .collect(Collectors.reducing(
                    BigDecimal.ZERO,
                    (sum, elem) -> sum.add(elem)));
    }

    /**
     * @param sender sender
     * @param recipient receiptent
     * @param items items
     */
public Invoice(final String sender, final String recipient,
final List<InvoiceItem> items) {
        this.sender = sender;
        this.recipient = recipient;
        this.items = items;
    }

 @Override
 public boolean equals(final Object o) {
 if (this == o) {
 return true;
 }
if (o == null || getClass() != o.getClass()) {
return false;
}

        Invoice invoice = (Invoice) o;

if (items != null ? !items.equals(invoice.items) : invoice.items != null) {
return false;
}
if (recipient != null ? !recipient.equals(invoice.recipient)
: invoice.recipient != null) {
return false;
}
if (sender != null ? !sender.equals(invoice.sender) : invoice.sender != null) {
return false;
}
return true;
}

    @Override
    public int hashCode() {
        int result = sender != null ? sender.hashCode() : 0;
        result = 31 * result + (recipient != null ? recipient.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Invoice{"
     + "sender='" + sender + '\''
     + ", recipient='" + recipient + '\''
     + ", items=" + items + '}';
    }
}
