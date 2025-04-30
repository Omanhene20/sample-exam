// Board.java
private static final int DOT = 16;  // Constant representing a dot in the maze data
private static final int ALL_DOTS = 0; // Initialize to the total number of dots

// In movePacman()
if ((screenData[y1][x1] & DOT) != 0) {
    screenData[y1][x1] = 0;
    score++;
    all_dots--;
}

// In playGame() or similar
if (all_dots == 0) {
    levelUp();  // Or similar method to start next level
}
