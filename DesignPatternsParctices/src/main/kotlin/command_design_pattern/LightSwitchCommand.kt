package command_design_pattern

class LightSwitchCommand(
    private val light: Light
) : ICommand {
    override fun execute() {
       light.turnOn()
    }

}