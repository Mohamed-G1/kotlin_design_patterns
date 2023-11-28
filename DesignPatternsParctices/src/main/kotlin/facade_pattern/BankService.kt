package facade_pattern


/**
 * this class acts as facade pattern
 * */
class BankService(
    private val investment: Investment,
    private val saving: Saving,
    private val chequing: Chequing
) : IAccountService {
    override fun investment(investmentAmount: Double) {
        investment.investment(investmentAmount = investmentAmount)
    }

    override fun saving(saveAmount: Double) {
        saving.saving(saveAmount = saveAmount)
    }

    override fun chequing(chequingAmount: Double) {
        chequing.chequing(chequingAmount = chequingAmount)
    }

}