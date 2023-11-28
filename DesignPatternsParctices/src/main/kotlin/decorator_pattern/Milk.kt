package decorator_pattern

class Milk(
    private val coffee: Coffee
) : CoffeeDecorator(coffee) {

    override fun coffeeCoast(coast : Int): Double {
        return coffee.coffeeCoast(coast = coast) + 2.0
    }

    override fun ingredients(): String {
        return coffee.ingredients() + "Milk"
    }
}
