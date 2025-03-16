enum Size:
  case Alto, Grande, Venti

enum Type:
  case Kenya, Sumatra, Chiapas

def typeToString(t: Type): String =
  t match
    case Type.Chiapas => "Chiapas"
    case Type.Kenya   => "Kenya"
    case Type.Sumatra => "Sumatra"

def sizeToString(s: Size): String =
  s match
    case Size.Alto   => "Alto"
    case Size.Grande => "Grande"
    case Size.Venti  => "Venti"

def order(size: Size, t: Type): String =
  val variety = typeToString(t)
  val cupSize = sizeToString(size)
  s"Un americano con $variety tamaño $cupSize, por favor!"

@main
def entrypoint(): Unit =
  println(order(Size.Venti, Type.Sumatra))
