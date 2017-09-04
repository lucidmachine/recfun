package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */

  /**
    * Exercise 1 - Pascal's Triangle
    *
    * Returns the number at the given coordinates in Pascal's triangle.
    * @param c Column number, left to right.
    * @param r Row number, top to bottom.
    * @return The number in the given position.
    */
    def pascal(c: Int, r: Int): Int = ???
  
  /**
   * Exercise 2
   */
//    def balance(chars: List[Char]): Boolean = ???
  
  /**
   * Exercise 3
   */
//    def countChange(money: Int, coins: List[Int]): Int = ???
  }
