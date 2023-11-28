package composite_pattern.composite_assignment

class Song(
    val songName: String,
//    val artist: String,
) : IComponent {
    var speed = 1f

    override fun play() {
        println("This Song $songName is played")
    }

    override fun setPlaybackSpeed(speed: Float) {
        println("This Song $songName is played")

    }

    override fun getName(): String {
        return songName
    }

    fun getArtist(): String {
        return "artist"
    }
}