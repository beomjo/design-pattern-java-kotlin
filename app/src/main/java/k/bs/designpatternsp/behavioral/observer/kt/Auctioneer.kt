package k.bs.designpatternsp.behavioral.observer.kt

class Auctioneer : AuctioneerSubject {
    private var bid: Int = 0
    private val bidders: MutableList<BidObserver> = mutableListOf()

    override fun register(vararg bidObservers: BidObserver) {
        bidders.addAll(bidObservers)
    }

    override fun notifyNewBid(newBid: Int) {
        val oldBid = bid
        bid = newBid
        bidders.forEach { it.updateBid(oldBid, newBid) }
    }
}