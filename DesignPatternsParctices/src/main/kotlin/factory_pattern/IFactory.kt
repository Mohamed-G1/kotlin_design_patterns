package factory_pattern

interface IFactory {
    fun withdraw(bankType: String): IBank
    fun deposit(bankType: String): IBank
}