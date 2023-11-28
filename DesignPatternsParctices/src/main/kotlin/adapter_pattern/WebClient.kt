package adapter_pattern

class WebClient(
    private val webRequester: WebRequester
) {
    private val message = "Hello,world123"
    fun sendMessageToAdapter() {
        webRequester.request(message = message)
    }
}


