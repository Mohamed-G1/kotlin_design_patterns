package state_pattern

fun main() {
    val vendingMachine = VendingMachine(true)
    vendingMachine.dispence()
    println(vendingMachine.currentState.toString())
}