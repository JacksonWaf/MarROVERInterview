/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

sealed abstract class Directions (currentDirection: String,
                                rightDirection: String,
                                leftDirection: String) {
def current() = currentDirection
	def right() = rightDirection
	def left() = leftDirection
                                }
                                case object North extends Direction("N", "E", "W")
case object South extends Direction("S", "W", "E")
case object East extends Direction("E", "S", "N")
case object West extends Direction("W", "N", "S")


}
