package proxy_pattern

class OrderFulfill(
    private val iOrder: IOrder
) : IOrder {
    //    val warehouse : List<Warehouse> = listOf()
    override fun fulfillOrder(order: String) {
        if (order.contains("Hello")) {
            iOrder.fulfillOrder(order)
        } else {
            println("Your order can not fulfilled")
        }
    }
}