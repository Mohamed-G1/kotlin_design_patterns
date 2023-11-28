package decorator_pattern

abstract class CoffeeDecorator(
    private val coffee: Coffee
) : Coffee {
    override fun coffeeCoast(coast: Int): Double {
        return coffee.coffeeCoast(coast = coast)
    }

    override fun ingredients(): String {
        return coffee.ingredients()
    }
}