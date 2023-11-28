package decorator_pattern

class Chocolate(
    private val coffee: Coffee
) : CoffeeDecorator(coffee) {

    override fun coffeeCoast(coast: Int): Double {
        return coffee.coffeeCoast(coast = coast) + 8.5
    }

    override fun ingredients(): String {
        return coffee.ingredients() + "With Chocolate"

    }
}