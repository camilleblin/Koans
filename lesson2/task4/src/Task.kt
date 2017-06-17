class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return DateRangeIterator(this)
    }

    class DateRangeIterator(var dateRange: DateRange) : Iterator<MyDate>{
        var currentDate = dateRange.start
        override fun hasNext(): Boolean {
            return dateRange.contains(currentDate.nextDay())
        }

        override fun next(): MyDate {
            val result = currentDate
            currentDate = currentDate.nextDay()
            return result
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}