package k.bs.designpatternsp.behavioral.observer.kt

interface AuctioneerSubject {
    fun register(vararg bidObservers: BidObserver)
    fun notifyNewBid(newBid: Int)
}