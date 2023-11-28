package adapter_pattern.adapter_assignment

fun main() {
    val coffeeMachine = CoffeeClient(CoffeeTouchscreenAdapter(oldCoffeeMachine = OldCoffeeMachine()))
    println(coffeeMachine.sendToSecondSelection())
}