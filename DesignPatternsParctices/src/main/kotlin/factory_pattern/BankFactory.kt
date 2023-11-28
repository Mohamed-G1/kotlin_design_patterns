package factory_pattern

class BankFactory : IFactory {
    override fun withdraw(bankType: String): IBank {
        if (bankType.startsWith("111111")) {
            return BankA()
        } else if (bankType.startsWith("222222")) {
            return BankB()
        } else if (bankType.startsWith("333333")) {
            return BankC()
        }
        return BankA()
    }

    override fun deposit(bankType: String): IBank {
        when (bankType) {
            "111111" -> return BankA()
            "222222" -> return BankB()
            "333333" -> return BankC()
        }
        return BankA()
    }
}