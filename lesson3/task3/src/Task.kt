fun Customer.isFromCity(city : City) :  Boolean = this.city == city

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.isFromCity(city) }

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.isFromCity(city) }

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int = customers.filter { it.city == city }.count()

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city == city }