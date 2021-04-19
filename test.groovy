class GroovyTut {

// main is where execution starts
static void main(String[] args){

  def king = new Animal('King', 'Growl');
  println("${king.name} says ${king.sound}");

  def peki1 = new Perica('perica', ' trcucka');
  println("${peki1.name} says ${peki1.sound}");

def testObjekat = new TestKlasa ( name: 'test1', sound: 'zvuk')
println("Test objekat ime: $testObjekat.name")

}

}

