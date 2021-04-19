/*import groovy.transform.ToString;

// Creates the toString method
@ToString(includeNames=true, includeFields=true)
*/
class Perica {
  // Fields (Attributes)
  def name;
  def sound;

  // Methods (Capabilites)

  def run(){
    println("${name} runs");
  }
  
  // Constructor Method
  def Perica(name, sound){
    this.name = name;
    this.sound = sound;
  }
}