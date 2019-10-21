package k.bs.designpatternsp.structural.composite.kt.playlist

interface IMedia {
    fun play()
    fun displaySubtitle()
    fun setPlaySpeed(speed:Float)
    fun getName() :String
}