package adapter_pattern.adapter_assignment

class CoffeeTouchscreenAdapter(
    private val oldCoffeeMachine: OldCoffeeMachine
) : CoffeeMachineInterface {
    override fun chooseFirstSection() {
        oldCoffeeMachine.selectA()
    }

    override fun chooseSecondSection() {
        oldCoffeeMachine.selectB()
    }
}