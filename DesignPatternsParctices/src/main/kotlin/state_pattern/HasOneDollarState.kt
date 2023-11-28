package state_pattern

class HasOneDollarState : State {
    override fun insertDollar(vendingMachine: VendingMachine) {
        println("already have one dollar")
    }

    override fun ejectMoney(vendingMachine: VendingMachine) {
        println("returning money")
        vendingMachine.currentState = IdleState()
    }

    override fun dispense(vendingMachine: VendingMachine) {
        if (vendingMachine.isAvailableProduct) {
            println("releasing product")
            vendingMachine.currentState = IdleState()
        } else {
            println("the product out of stock")
            vendingMachine.currentState = OutOfStockState()
        }
    }

}