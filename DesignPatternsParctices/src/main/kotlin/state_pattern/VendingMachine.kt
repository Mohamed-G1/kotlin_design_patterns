package state_pattern

class VendingMachine(
    val isAvailableProduct: Boolean
) {
     var currentState: State = IdleState()

    fun insertDollar() = currentState.insertDollar(this)
    fun ejectMoney() = currentState.ejectMoney(this)
    fun dispence() = currentState.dispense(this)
}