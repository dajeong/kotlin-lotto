package lotto.domain

class LottoResultService(
    private val luckyNumbers: LuckyNumbers,
) {
    fun inquireStatistics(payment: Int, lottoList: List<Lotto>): LottoStatisticsTotal {
        val lottoWinner = LottoWinner(luckyNumbers)
        val winLottoList = lottoWinner.findWinLottoList(lottoList)
        val lottoStatisticsService = LottoStatisticsService(payment, winLottoList)
        return lottoStatisticsService.statistics()
    }
}
