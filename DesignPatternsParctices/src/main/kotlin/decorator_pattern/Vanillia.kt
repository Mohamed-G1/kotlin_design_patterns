package decorator_pattern

class Vanillia(
    private val coffee: Coffee
) : CoffeeDecorator(coffee) {
    override fun coffeeCoast(coast: Int): Double {
       return coffee.coffeeCoast(coast = coast) + 3.5
    }

    override fun ingredients(): String {
        return coffee.ingredients() + "With Vanillia"
    }
}