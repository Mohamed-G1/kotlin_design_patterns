package adapter_pattern

fun main() {
    val webClient = WebClient(WebAdapter(webService = WebService()))
    println(webClient.sendMessageToAdapter())
}