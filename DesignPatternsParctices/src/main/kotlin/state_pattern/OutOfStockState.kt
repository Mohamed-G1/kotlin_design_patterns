package state_pattern

class OutOfStockState : State {
    override fun insertDollar(vendingMachine: VendingMachine) {
        println("Machine out of stock")
        vendingMachine.ejectMoney()
    }

    override fun ejectMoney(vendingMachine: VendingMachine) {
        println("Returning dollar")
        vendingMachine.currentState = IdleState()
    }

    override fun dispense(vendingMachine: VendingMachine) {
        println("Machine out of stock")
    }
}