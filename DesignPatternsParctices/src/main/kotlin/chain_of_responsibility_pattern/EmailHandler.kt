package chain_of_responsibility_pattern

interface EmailHandler {
    fun setNext(emailHandler: EmailHandler)
    fun handleEmailRequest(email : String)
}