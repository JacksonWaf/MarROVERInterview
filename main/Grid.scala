/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

case class Grid (x: Int, y: Int) {
  defPositionOfNextPoint(position: Position) : Position = position match
  {
    case Position(px, py, North) => position(px, moveNorth(py), North)
      case Position(px, py, East) => position(px, moveEast(py), East)
        case Position(px, py, South) => position(px, moveSouth(py), South)
          case Position(px, py, West) => position(px, moveWest(py), West)
    
  }
  
  private def moveSouth(currentY: Int): Int = 
    if(currentY == 0) y -1 else currentY -1;
  
}

}
