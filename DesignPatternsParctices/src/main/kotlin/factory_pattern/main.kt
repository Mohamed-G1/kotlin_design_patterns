package factory_pattern

fun main() {
//    val bankFactory = BankFactory()
//    val bankType = bankFactory.withdraw("111111")

    val iFactory: IFactory = BankFactory()
    val bankType = iFactory.withdraw("111111")
    println(bankType.withdraw())
}
