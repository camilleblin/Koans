import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)
data class TimeIntervalRepetition(val timeInterval: TimeInterval, val repetition : Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = this.addTimeIntervals(timeInterval, 1)
operator fun TimeInterval.times(numberOfRepetition : Int) : TimeIntervalRepetition = TimeIntervalRepetition(this, numberOfRepetition)
operator fun MyDate.plus(repetition: TimeIntervalRepetition) : MyDate = this.addTimeIntervals(repetition.timeInterval, repetition.repetition)


fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}