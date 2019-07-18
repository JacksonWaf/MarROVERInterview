/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

case class Position(x: Int, y: Int, direction: Direction) {
  def right(): Position(x, y, directionFor(direction.right).get)
  
  def left(): Position(x,y, directionFor(direction.left).get)
}

}
