package state_pattern

class IdleState : State {
    override fun insertDollar(vendingMachine: VendingMachine) {
        println("Dollar inserted")
        vendingMachine.currentState = HasOneDollarState()
    }
    override fun ejectMoney(vendingMachine: VendingMachine) {
        println("no money to return")
    }

    override fun dispense(vendingMachine: VendingMachine) {
        println("payment required" )
    }
}