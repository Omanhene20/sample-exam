// Board.java and GhostShape.java
private static final int WALL_LEFT   = 1;  // 0001
private static final int WALL_UP     = 2;  // 0010
private static final int WALL_RIGHT  = 4;  // 0100
private static final int WALL_DOWN   = 8;  // 1000


// In relevant code:
if ((screenData[py][px] & WALL_RIGHT) == 0 && dx != -1)   // Example from GhostShape.java
if ((ch & WALL_RIGHT) == 0)  // Example from Board.java
