package lotto.domain

import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LottoTest : StringSpec({

    "로또 번호가 6개를 넘으면 에러 발생 테스트" {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
        val exception = shouldThrowExactly<IllegalArgumentException> {
            Lotto(numbers)
        }
        exception.message shouldBe "로또 번호는 6개가 필요합니다."
    }
})
