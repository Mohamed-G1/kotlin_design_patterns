package chain_of_responsibility_pattern

class ArchieveFolder : EmailHandler {
    var handler: EmailHandler? = null

    override fun setNext(emailHandler: EmailHandler) {
        handler = emailHandler
    }

    override fun handleEmailRequest(email: String) {
        if (email.isNotBlank()) {
            if (email.startsWith("Archieve")) {
                println("This $email is archieved")
            } else {
                handler?.handleEmailRequest(email)
                    ?: println("This is the last stack, and you request dosen't satsified")
            }
        }
    }
}