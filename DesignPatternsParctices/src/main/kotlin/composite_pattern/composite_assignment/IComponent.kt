package composite_pattern.composite_assignment

interface IComponent {
    fun play()
    fun setPlaybackSpeed(speed: Float)
    fun getName(): String
}