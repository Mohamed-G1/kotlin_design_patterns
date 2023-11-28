package chain_of_responsibility_pattern

fun main() {
    val sentFolder = SentFolder()
    val spamFolder = SpamFolder()
    val archiveFolder = ArchieveFolder()

    sentFolder.setNext(spamFolder)
    spamFolder.setNext(archiveFolder)
    sentFolder.handleEmailRequest("spam@example.com")


}