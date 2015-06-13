package berlinclock

/**
 * Created by sai on 13/06/2015.
 */
class BerlinClock {

  def bottomRowMinuteLamps(minute: Int) = 1 to 4 map(index => if(minute % 5 >= index) "Y" else "O") mkString

  def topRowMinuteLamps(minutes: Int) = 1 to 11 map(index => {
    val on = minutes / (index * 5) > 0
    if(on && index % 3 == 0) "R"
    else if(on) "Y"
    else "O"
  }) mkString


  private[this] def hoursCalculator(hours: Int, hoursDeterminatorFunction: Int => Int) = 1 to 4 map(index => if(hoursDeterminatorFunction(hours) >= index) "R" else "O") mkString

  def bottomRowHourLamps(hours: Int) = hoursCalculator(hours, hours => hours % 5)

  def topRowHourLamps(hours: Int) = hoursCalculator(hours, hours => hours / 5)


  def seconds(seconds: Int) = if(seconds % 2 == 0) "Y" else "O"

  def clock(hrs: Int, mins: Int, secs: Int) = s"${seconds(secs)}|${topRowHourLamps(hrs)}|${bottomRowHourLamps(hrs)}|${topRowMinuteLamps(mins)}|${bottomRowMinuteLamps(mins)}"

}
