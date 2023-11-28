package state_pattern

fun main() {
    val vendingMachine = VendingMachine(false)
    vendingMachine.ejectMoney()
    println(vendingMachine.currentState.toString())
}