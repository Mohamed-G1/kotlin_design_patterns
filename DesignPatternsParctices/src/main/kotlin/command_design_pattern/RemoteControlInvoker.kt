package command_design_pattern

class RemoteControlInvoker(
    private val iCommand: ICommand
) {
    fun execute() = iCommand.execute()
}