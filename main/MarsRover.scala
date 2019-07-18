/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class MarsRover(grid: Grid, initialPosition: Position) {
  var currentPosition = initialPosition;
  commands.split("").foreach(cmd =>
			cmd match {
				case "M" => currentPosition = grid.positionOfNextPoint(currentPosition)
				case "R" => currentPosition = currentPosition.right()
				case "L" => currentPosition = currentPosition.left()
			})

	def position() = currentPosition;
}

}
