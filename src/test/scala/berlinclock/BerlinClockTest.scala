package berlinclock

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 13/06/2015.
 */
class BerlinClockTest extends FlatSpec with ShouldMatchers {

  val berlinClock = new BerlinClock

  "Every yellow lamp" should "blink every two seconds" in {
    berlinClock.seconds(0) should be ("Y")
    berlinClock.seconds(10) should be ("Y")
    berlinClock.seconds(13) should be ("O")
  }

  "Every red lamp of the top row" should "light every five hours from left to right" in {
    berlinClock.topRowHourLamps(3) should be ("OOOO")
    berlinClock.topRowHourLamps(8) should be ("ROOO")
    berlinClock.topRowHourLamps(14) should be ("RROO")
    berlinClock.topRowHourLamps(18) should be ("RRRO")
    berlinClock.topRowHourLamps(22) should be ("RRRR")
  }

  "Every red lamp of the bottom row" should "light every hour from left to right" in {
    berlinClock.bottomRowHourLamps(8) should be ("RRRO")
    berlinClock.bottomRowHourLamps(14) should be ("RRRR")
    berlinClock.bottomRowHourLamps(18) should be ("RRRO")
    berlinClock.bottomRowHourLamps(22) should be ("RROO")
  }

  "Every lamp of the top row for minutes" should "light every 5 minutes from left to right" in {
    berlinClock.topRowMinuteLamps(8) should be ("YOOOOOOOOOO")
    berlinClock.topRowMinuteLamps(14) should be ("YYOOOOOOOOO")
    berlinClock.topRowMinuteLamps(18) should be ("YYROOOOOOOO")
    berlinClock.topRowMinuteLamps(36) should be ("YYRYYRYOOOO")
    berlinClock.topRowMinuteLamps(46) should be ("YYRYYRYYROO")
    berlinClock.topRowMinuteLamps(57) should be ("YYRYYRYYRYY")
  }

  "Every lamp of the bottom row for minutes" should "light every minute but the fifth minute" in {
    berlinClock.bottomRowMinuteLamps(8) should be ("YYYO")
    berlinClock.bottomRowMinuteLamps(14) should be ("YYYY")
    berlinClock.bottomRowMinuteLamps(12) should be ("YYOO")
    berlinClock.bottomRowMinuteLamps(45) should be ("OOOO")
    berlinClock.bottomRowMinuteLamps(46) should be ("YOOO")
    berlinClock.bottomRowMinuteLamps(37) should be ("YYOO")
  }

  "Berlin clock" should "light the hours, minutes, seconds" in {
    berlinClock.clock(16, 37, 16) should be ("Y|RRRO|ROOO|YYRYYRYOOOO|YYOO")
  }
}
