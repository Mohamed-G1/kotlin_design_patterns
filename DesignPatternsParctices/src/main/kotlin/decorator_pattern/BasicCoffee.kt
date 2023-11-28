package decorator_pattern

class BasicCoffee : Coffee {
    override fun coffeeCoast(coast : Int): Double = coast.toDouble()
    override fun ingredients(): String = "Coffee"
}