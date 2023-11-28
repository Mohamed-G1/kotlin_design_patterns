package factory_pattern

class BankA : IBank{
    override fun withdraw() {
        println("Withdraw: from bank a")
    }

    override fun deposit() {
        println("Deposit: from bank a")
    }
}