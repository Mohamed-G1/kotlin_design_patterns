package adapter_pattern

class WebAdapter(
    private val webService: WebService
) : WebRequester {
    override fun request(message: String) {
        val convertStringToInt = message.length
        webService.printClientMessage(clientMessage = convertStringToInt)
    }
}