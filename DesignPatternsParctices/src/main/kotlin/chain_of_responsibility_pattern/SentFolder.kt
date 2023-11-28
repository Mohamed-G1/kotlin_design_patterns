package chain_of_responsibility_pattern

class SentFolder: EmailHandler {
    var handler: EmailHandler? = null

    override fun setNext(emailHandler: EmailHandler) {
        handler = emailHandler
    }
    override fun handleEmailRequest( email: String) {
        if (email.isNotBlank()) {
            if (email.startsWith("sent")) {
                println("This $email is sent")
            } else {
                handler?.handleEmailRequest(email)
            }
        }
    }
}