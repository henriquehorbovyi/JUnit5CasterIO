package henrique.course.casterio.junit

class Deck(cards: List<Card>) {

    private var cards = cards.toMutableList()

    val size get() = cards.count()

    fun isEmpty() = cards.isEmpty()

    fun shuffle() = cards.shuffle()

    fun draw() = if (isEmpty()) {
        throw EmptyDeckException()
    } else {
        cards.removeAt(0)
    }

    override fun toString() = if(isEmpty())
        "Empty deck"
    else
        "Deck of $size"

    operator fun contains(card: Card) = card in cards
}

typealias Player = String

