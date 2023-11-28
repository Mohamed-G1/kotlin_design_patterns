package adapter_pattern


/**
 * this class acts as an external system or third party
 * */
class WebService {
    fun printClientMessage(clientMessage: Int) {
        println(clientMessage.toString())
    }
}