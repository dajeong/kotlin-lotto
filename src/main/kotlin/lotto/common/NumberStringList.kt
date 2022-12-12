package lotto.common

class NumberStringList(
    string: String
) {
    val list = string.split(",").map { NumberString(it.trim()) }

    fun toNumberList(): List<IntegerNumber> {
        return list.map { it.toNumber() }
    }
}
