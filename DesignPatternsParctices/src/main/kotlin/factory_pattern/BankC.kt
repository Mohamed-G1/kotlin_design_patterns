package factory_pattern

class BankC : IBank {
    override fun withdraw() {
        println("Withdraw: from bank c")
    }

    override fun deposit() {
        println("Deposit: from bank c")
    }
}