package week1.racingcar.domain

class RacingGame(
    private val cars: List<Car>,
    val timesToRace: Int,
) {
    fun drive(): List<Car> {
        cars.forEach {
            it.moveOrNot()
        }
        return cars
    }

    fun getWinners(): List<String> {
        val farthestMileage = cars.map { it.mileage }
            .maxOf { it }
        return cars.filter { it.isSameMileage(farthestMileage) }
            .map { it.name }
    }
}
