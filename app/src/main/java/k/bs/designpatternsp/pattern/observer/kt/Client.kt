package k.bs.designpatternsp.pattern.observer.kt

fun main() {
    val auctioneer = Auctioneer()
        .apply {
            register(Bidder(1))
            register(Bidder(2))
        }

    auctioneer.notifyNewBid(1)
    auctioneer.notifyNewBid(2)
    auctioneer.notifyNewBid(3)
}