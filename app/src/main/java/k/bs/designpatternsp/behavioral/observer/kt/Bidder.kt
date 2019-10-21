package k.bs.designpatternsp.behavioral.observer.kt

open class Bidder(val number: Int = 0) : BidObserver {
    override fun updateBid(oldBid: Int, newBid: Int) {
        println("Bidder${number} : oldBid is $oldBid, newBid is $newBid")
    }
}