package k.bs.designpatternsp.behavioral.observer.kt

interface BidObserver {
    fun updateBid(oldBid: Int, newBid: Int)
}