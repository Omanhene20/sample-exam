// Board.java (Modified loadImages() and drawPacman())
private Image[][] pacmanImages;  // 2D array to hold Pacman images

private void loadImages() {
    pacmanImages = new Image[4][4];  // 4 directions, 4 images each

    pacman1 = new ImageIcon("pacpix/pacman1.gif").getImage();  // Closed mouth - index 0 for all directions

    pacmanImages[0][0] = pacman1;  // UP
    pacmanImages[0][1] = new ImageIcon("pacpix/pacman2up.gif").getImage();
    pacmanImages[0][2] = new ImageIcon("pacpix/pacman3up.gif").getImage();
    pacmanImages[0][3] = new ImageIcon("pacpix/pacman4up.gif").getImage();

    pacmanImages[1][0] = pacman1;  // DOWN
    pacmanImages[1][1] = new ImageIcon("pacpix/pacman2down.gif").getImage();
    pacmanImages[1][2] = new ImageIcon("pacpix/pacman3down.gif").getImage();
    pacmanImages[1][3] = new ImageIcon("pacpix/pacman4down.gif").getImage();

    pacmanImages[2][0] = pacman1;  // LEFT
    pacmanImages[2][1] = new ImageIcon("pacpix/pacman2left.gif").getImage();
    pacmanImages[2][2] = new ImageIcon("pacpix/pacman3left.gif").getImage();
    pacmanImages[2][3] = new ImageIcon("pacpix/pacman4left.gif").getImage();

    pacmanImages[3][0] = pacman1;  // RIGHT
    pacmanImages[3][1] = new ImageIcon("pacpix/pacman2right.gif").getImage();
    pacmanImages[3][2] = new ImageIcon("pacpix/pacman3right.gif").getImage();
    pacmanImages[3][3] = new ImageIcon("pacman4right.gif").getImage();
}


private void drawPacman(Graphics2D g2d) {
    if (dying) {
        // ... (dying animation code - unchanged)
    } else {
        int direction = 0;

        if (dx == 1) direction = 3;   // RIGHT
        if (dx == -1) direction = 2;  // LEFT
        if (dy == 1) direction = 1;   // DOWN
        if (dy == -1) direction = 0;  // UP

        g2d.drawImage(pacmanImages[direction][spriteImgIdx], pacman_x + 1, pacman_y + 1, this);
    }
}
