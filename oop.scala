trait Speaker:
  def speak(): String // Abstract method since there is ni body

trait TailWagger:
  def startTail(): Unit = println("Movig the tail")
  def stopTail(): Unit = println("Stopping tain")

trait Runner:
  def startRunning(): Unit = println("You can't stop me!")
  def stopRunning(): Unit = println("Now stopping!")

class Dachshund(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Barf!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Meow"

  override def startRunning(): Unit = println("I do not run")

  override def stopRunning(): Unit = println("What did i say?")

val molly = Dachshund("Molly")
val figaro = Cat(name = "Figaro")
