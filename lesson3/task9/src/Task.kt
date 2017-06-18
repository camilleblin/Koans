import com.sun.org.apache.xpath.internal.operations.Bool

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.partition { hasMoreOrderDelivered(it.orders) }.second.toSet()

fun hasMoreOrderDelivered(orders : List<Order>) : Boolean {
    val (delivered, undelivered) = orders.partition { it.isDelivered }
    return delivered.size >= undelivered.size
}