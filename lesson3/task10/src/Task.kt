// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(Set<Product>(), {
        acc, customer -> acc.addAll(customer.orders.flatMap { it.products })
        acc
    }).toSet()
}