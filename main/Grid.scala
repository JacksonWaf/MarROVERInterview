/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

case class Grid (x: Int, y: Int) {
  defPositionOfNextPoint(position: Position) : Position = position match
  {
    case Position(px, py, North) => position(px, moveNorth(py), North)
    
  }
}

}
