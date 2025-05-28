import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        //19 coloums, 21 rows, each tile 32x32 pixels
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardwidth = columnCount*tileSize;
        int boardHeight = rowCount*tileSize;

         JFrame frame = new JFrame("Pac Man");
        frame.setVisible(true);
        frame.setSize(boardwidth, boardHeight);
        //for window to appear at center of the screen
        frame.setLocationRelativeTo(null);
        //to prevent user from resizing the window 
        frame.setResizable(false);
        //game to terminate if clicked on X button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}