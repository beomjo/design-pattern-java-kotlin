package k.bs.designpatternsp.pattern.observer.kt

interface AuctioneerSubject {
    fun register(vararg bidObservers: BidObserver)
    fun notifyNewBid(newBid: Int)
}