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
    * Exercise 1 - Pascal's Triangle
    *
    * Returns the number at the given coordinates in Pascal's triangle.
    * @param c Column number, 0 to c, left to right.
    * @param r Row number, 0 to r, top to bottom.
    * @return The number in the given position.
    */
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1
    else pascal(c - 1, r) * (r - c + 1) / c

  /**
    * Exercise 2 - Parentheses Balancing
    *
    * Returns whether a given list of characters has balanced parentheses.
    * @param chars The list of characters to test for balance.
    * @return Whether the given list of characters has balanced parentheses.
    */
  def balance(chars: List[Char]): Boolean = false
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 0
}