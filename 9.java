// PacmanShape.java
import java.awt.*;

public class PacmanShape implements MoveableShape {
    private int x, y;   // Pacman's coordinates
    private int dx, dy;  // Pacman's direction
    private Image[][] images; // Pacman images for animation
    private int spriteImgIdx;  // Current animation frame index
    private boolean dying;  // Flag for dying animation

    public PacmanShape(int startX, int startY, Image[][] images) {
        this.x = startX;
        this.y = startY;
        this.images = images;
        this.dx = 0;
        this.dy = 0;
        this.spriteImgIdx = 0;
        this.dying = false;
    }

    // Implement MoveableShape methods (draw, move, contains)
    public void move() {
        x += dx;
        y += dy;
    }

    public void draw(Graphics2D g2d) {
        if (dying) {
            // Dying animation (not implemented in detail here)
        } else {
            int direction = 0;
            if (dx == 1) direction = 3;
            if (dx == -1) direction = 2;
            if (dy == 1) direction = 1;
            if (dy == -1) direction = 0;
            g2d.drawImage(images[direction][spriteImgIdx], x + 1, y + 1, null);
        }
    }

    public boolean contains(int other_x, int other_y) {
        // Collision detection (simplified)
        return other_x > (x - 12) && other_x < (x + 12) && other_y > (y - 12) && other_y < (y + 12);
    }

    public void updateAnimation() {
        // Pacman animation logic (similar to Board.java)
    }

    public void setDirection(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public void setDying(boolean dying) {
        this.dying = dying;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getDx() { return dx; }
    public int getDy() { return dy; }
}


// Board.java (Modified)
private PacmanShape pacman;
private Image[][] pacmanImages;

// In initGame() or similar:
pacman = new PacmanShape(start_x, start_y, pacmanImages);


// In paintComponent():
pacman.draw(g2d);

// In movePacman():
pacman.move();
