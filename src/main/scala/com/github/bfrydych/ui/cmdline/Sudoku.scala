package com.github.bfrydych.ui.cmdline

import com.github.bfrydych.core.Board
import com.github.bfrydych.core.Address

object Sudoku {
	def main(args: Array[String]) {
		val board:Board = new Board(3)
		board.generateEmptyBoard
		
		val boardDisplay:BoardDisplay = new BoardDisplay(board)
		board.set(new Address(1, 1), 1)
		board.set(new Address(1, 2), 2)
		board.set(new Address(1, 3), 3)
		
		board.set(new Address(2, 1), 2)
		board.set(new Address(3, 1), 3)
		
		boardDisplay.display
		
		println(board.validateField(new Address(1, 1)));
		println(board.validate);
		
	}
}