package adapter_pattern.adapter_assignment

class CoffeeClient(
    private val coffeeMachineInterface: CoffeeMachineInterface
) {
    fun sendToFirstSelection() = coffeeMachineInterface.chooseFirstSection()
    fun sendToSecondSelection() = coffeeMachineInterface.chooseSecondSection()
}