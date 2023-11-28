package chain_of_responsibility_pattern

class SpamFolder: EmailHandler {
    var handler: EmailHandler? = null

    override fun setNext(emailHandler: EmailHandler) {
        handler = emailHandler
    }

    override fun handleEmailRequest(email: String) {
        if (email.isNotBlank()) {
            if (email.startsWith("spam")) {
                println("This $email is Spam")
            } else {
                handler?.handleEmailRequest(email)
            }
        }
    }

}