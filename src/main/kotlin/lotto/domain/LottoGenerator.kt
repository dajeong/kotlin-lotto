package lotto.domain

import lotto.common.IntegerNumber
import lotto.util.NumberGenerator

class LottoGenerator(
    private val numberGenerator: NumberGenerator
) {
    fun generate(size: IntegerNumber): List<Lotto> {
        return List(size.number) { Lotto(randomNumber()) }
    }

    private fun randomNumber(): List<LottoNumber> {
        return numberGenerator.generate(Lotto.LOTTO_START_NUMBER, Lotto.LOTTO_END_NUMBER, Lotto.LOTTO_NUMBERS_SIZE)
            .map { LottoNumber(it) }
    }
}
