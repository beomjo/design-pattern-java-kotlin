package k.bs.designpatternsp.pattern.composite.kt.playlist

interface IMedia {
    fun play()
    fun displaySubtitle()
    fun setPlaySpeed(speed:Float)
    fun getName() :String
}