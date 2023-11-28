package facade_pattern

interface IAccountService {
    fun investment(numberAmount: Double)
    fun saving(saveAmount: Double)
    fun chequing(chequingAmount: Double)
}