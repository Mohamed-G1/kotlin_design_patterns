package proxy_pattern

fun main() {
    val iOrder = OrderFulfill(Warehouse())
    val result = iOrder.fulfillOrder("Hello")
    println(result)
}