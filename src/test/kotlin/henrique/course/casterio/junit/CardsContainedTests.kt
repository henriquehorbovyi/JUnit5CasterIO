package henrique.course.casterio.junit

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("DESCRIPTION FOR THIS SUIT OF TESTS")
class CardsContainedTests {


    @DisplayName("DESCRIPTION FOR THIS TEST \uD83D\uDC96")
    @Test
    fun `card is correctly contained inside a deck`() {
        val card = Card("8","heart", "black")
        val deck = Deck(listOf(card))
        assertTrue(card in deck)
    }


    @Test
    fun `when deck contains a card then this card is correctly reported as being contained in that deck`() {
        val card = Card("8","heart", "black")
        val deck = Deck(listOf(card))
        assertTrue(deck.contains(card))
    }


}