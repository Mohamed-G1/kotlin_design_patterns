package command_design_pattern.redo_undo_example

class Invoker(
    private val iCommand: ICommand
) {

    fun execute() = iCommand.execute()
    fun undo() = iCommand.undo()
}