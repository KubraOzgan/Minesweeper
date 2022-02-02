# Minesweeper
### Game rules :
- The game is text based.
- It should be played on two-dimensional arrays and designed within the MineSweeper class.
- The number of rows and columns, should be determined by the user.
- A quarter of the number of elements in the array (number of elements / 4) should be randomly placed. 
- The user must select a point on the matrix. For point selection, row and column values must be entered.
- It should be checked whether the selected point is within the boundaries of the array and if the condition is not met, the point should be requested again.
- If there is a mine at the point where the user enters, will lose the game.
- If there are no mines, all positions that touch the relevant point should be looked at 
(right, left, up, down, upper left diagonal, upper right diagonal, lower right diagonal, lower left diagonal) 
and the sum of the number of mines around should be written on the relevant point. If there is no mine touching the point, the value "0" should be assigned.
- If the user can select all the points without pressing any mines, will win the game.
