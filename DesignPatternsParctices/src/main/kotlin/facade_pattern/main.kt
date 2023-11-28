package facade_pattern

fun main() {
    val facadeWrapper = BankService(
        investment = Investment(),
        saving = Saving(),
        chequing = Chequing()
    )

    facadeWrapper.apply {
        investment(investmentAmount = 10.0)
        saving(saveAmount = 12.45)
        chequing(chequingAmount = 8.5)
    }


}