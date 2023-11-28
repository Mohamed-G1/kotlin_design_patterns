package proxy_pattern

class Warehouse : IOrder {
    override fun fulfillOrder(order: String) {
        println("Your $order fulfilled")
    }
}