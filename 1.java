// Board.java
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * This class represents the game board for the PacMan game.
 * It handles the game logic, drawing of the maze and entities,
 * and user input.
 */
@SuppressWarnings("serial")
public class Board extends JPanel {

    private final static int N_BLOCKS = 15;   // Number of blocks in the maze
    private final static int BLOCK_SIZE = 24;  // Size of each block in pixels
    private final static int SCREEN_SIZE = N_BLOCKS * BLOCK_SIZE; // Total screen size
    private final static int BORDER_SIZE = 25;   // Border width

    private final static int PACMAN_SPRITE_DELAY = 2;  // Delay between Pacman animation frames
    private final static int PACMAN_SPRITE_NUM_POS = 4;  // Number of Pacman images per direction

    protected final static int MAX_LEVEL = 6;   // Maximum game level
    private final static int MAX_GHOSTS = 12;  // Maximum number of ghosts
    private final static int PACMAN_SPEED = 6;  // Pacman's movement speed

    private int spriteDelayCount = PACMAN_SPRITE_DELAY;  // Counter for Pacman animation delay
    private int spriteIncr = 1;   // Increment for Pacman animation frame
    private int spriteImgIdx = 0;  // Index of the current Pacman image

    private boolean inGame = false;  // Flag indicating if the game is active
    private boolean dying = false;  // Flag indicating if Pacman is dying

    private int currLevel = 1;   // Current game level
    private int numGhosts = 5;   // Number of ghosts in the current level
    private int pacsLeft, score;  // Number of Pacmans left and the player's score

    private ArrayList<MoveableShape> ghost;  // List of ghosts

    private Image pacman1;   // Pacman image with mouth closed
    private Image pacman2up, pacman2left, pacman2right, pacman2down;  // Pacman images with mouth partially open
    private Image pacman3up, pacman3down, pacman3left, pacman3right;  // Pacman images with mouth more open
    private Image pacman4up, pacman4down, pacman4left, pacman4right;  // Pacman images with mouth fully open

    private int pacman_x, pacman_y, pacman_dx, pacman_dy;  // Pacman's coordinates and direction
    private int req_dx, req_dy;  // Requested direction for Pacman

    private short[] screenData;  // Data for the maze
    private Timer timer;   // Game timer
    private int all_dots;   // Total number of dots in the level
    private int ghostAnimCount = PACMAN_SPRITE_DELAY;  // Counter for ghost animation

    private Font smallFont = new Font("Helvetica", Font.BOLD, 14);  // Font for displaying text
    private Image ghostImage;   // Image for ghosts
    private Image scaredGhost1, scaredGhost2; // Images for scared ghosts

    private Color dotColor = new Color(192, 192, 0);  // Color of the dots
    private Color mazeColor;   // Color of the maze

    private boolean inited = false;  // Flag indicating if initialization is complete
    private int maze_width, maze_height;
