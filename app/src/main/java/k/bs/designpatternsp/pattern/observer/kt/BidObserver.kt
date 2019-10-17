package k.bs.designpatternsp.pattern.observer.kt

interface BidObserver {
    fun updateBid(oldBid: Int, newBid: Int)
}