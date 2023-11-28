package factory_pattern

class BankB : IBank {
    override fun withdraw() {
        println("Withdraw: from bank b")
    }

    override fun deposit() {
        println("Deposit: from bank b")
    }
}