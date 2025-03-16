object StringUtils: // object allows to create singleton objects, something like a class with static methods
  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.isEmpty()
  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")
  def rightTrim(s: String): String = s.replaceAll("\\s+$", "")
