extension (s: String)
  def makeInt(radix: Int = 10): Int = Integer.parseInt(s, radix)

  def multiply(times: Int): String = s * times
