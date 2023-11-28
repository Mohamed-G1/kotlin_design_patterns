package decorator_pattern

fun main() {
    var coffee: Coffee = BasicCoffee()
    coffee = Sugar(coffee)
    println("Cost: ${coffee.coffeeCoast(coast = 2)}; Ingredients: ${coffee.ingredients()}")

    coffee = Milk(coffee)
    println("Cost: ${coffee.coffeeCoast(coast = 2)}; Ingredients: ${coffee.ingredients()}")

    coffee = Vanillia(coffee)
    println("Cost: ${coffee.coffeeCoast(coast = 2)}; Ingredients: ${coffee.ingredients()}")


    coffee = Chocolate(coffee)
    println("Cost: ${coffee.coffeeCoast(coast = 2)}; Ingredients: ${coffee.ingredients()}")

}