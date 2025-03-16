extension (
    s: String
) // An extension allows to add functionalities to the type of the var inside parenthesis
  def makeInt(radix: Int = 10): Int = Integer.parseInt(s, radix)

  def multiply(times: Int): String = s * times
