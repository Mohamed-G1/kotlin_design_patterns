package command_design_pattern.redo_undo_example

class RedoableCommand(
    private val reciver: Reciver,
    private val action: String
) : ICommand {
    override fun execute() {
        reciver.performAction(action)
    }

    override fun undo() {
        reciver.undoAction(action)
    }
}