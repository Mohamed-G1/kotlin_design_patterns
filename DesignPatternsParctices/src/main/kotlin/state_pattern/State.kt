package state_pattern

interface State {
    fun insertDollar(vendingMachine: VendingMachine)
    fun ejectMoney(vendingMachine: VendingMachine)
    fun dispense(vendingMachine: VendingMachine)
}