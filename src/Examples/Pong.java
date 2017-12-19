/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.Graphics;

import javax.swing.JComponent;

import javax.swing.JFrame;

import java.awt.Rectangle;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.MouseWheelEvent;

/**
 *
 *
 *
 * @author modia9548
 *
 */
public class Pong extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //paddles for players to use
    int paddleHeight = 100;
    int paddleWidth = 25;
    Rectangle player1 = new Rectangle(50, HEIGHT / 2 - paddleHeight / 2, paddleWidth, paddleHeight);
    Rectangle player2 = new Rectangle(WIDTH - 50 - paddleWidth, HEIGHT / 2 - paddleHeight / 2, paddleWidth, paddleHeight);
    int paddleSpeed = 7;
    boolean player1Up = false;
    boolean player1Down = false;
    boolean player2Up = false;
    boolean player2Down = false;
    //ball for game
    int ballSize = 30;
    Rectangle ball = new Rectangle(WIDTH / 2 - ballSize / 2, HEIGHT / 2 - ballSize / 2, ballSize, ballSize);
    int ballXDirection = 1;
    int ballYDirection = -1;
    int ballSpeed = 3; //60 fps x 2 = 120 pixels/sec
    
    int player1Score = 0;
    int player2Score = 0;
    
    Font biggerFont = new Font("arial", Font.BOLD, 42);

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Pong() {

        // creates a windows to show my game

        JFrame frame = new JFrame(title);


        // sets the size of my game

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // adds the game to the window

        frame.add(this);


        // sets some options and size of the window automatically

        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        // shows the window to the user

        frame.setVisible(true);



        // add listeners for keyboard and mouse

        frame.addKeyListener(new Keyboard());

        Mouse m = new Mouse();



        this.addMouseMotionListener(m);

        this.addMouseWheelListener(m);

        this.addMouseListener(m);

    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {

        // always clear the screen first!

        g.clearRect(0, 0, WIDTH, HEIGHT);


        // GAME DRAWING GOES HERE
        g.setColor(Color.BLACK);

        //draw black play surface
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.WHITE);

        //set font
        g.setFont(biggerFont);
        //draw scores
        g.drawString("" + player1Score, WIDTH/2 - 100, 50);

        g.drawString("" + player2Score, WIDTH/2 + 100, 50);
        
        //draw the players
        g.fillRect(player1.x, player1.y, player1.width, player1.height);

        g.fillRect(player2.x, player2.y, player2.width, player2.height);

        g.fillRect(ball.x, ball.y, ball.width, ball.height);



        // GAME DRAWING ENDS HERE

    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {

        // Used to keep track of time used to draw and update the game

        // This is used to limit the framerate later on

        long startTime;

        long deltaTime;


        preSetup();


        // the main game loop section

        // game will end if you set done = false;

        boolean done = false;

        while (!done) {

            // determines when we started so we can keep a framerate

            startTime = System.currentTimeMillis();


            // all your game rules and move is done in here

            // GAME LOGIC STARTS HERE 

            //move the ball
            ball.x = ball.x + ballXDirection * ballSpeed;
            ball.y = ball.y + ballYDirection * ballSpeed;

            //get ball to bounce off floor
            //bottom of ball hit height of screen
            if (ball.y + ball.height >= HEIGHT) {
                //change y direction
                ballYDirection = ballYDirection * -1;
            }
            //top of ball hit top of screen
            if (ball.y <= 0) {
                ballYDirection = ballYDirection * -1;
            }

            //move player 1
            if (player1Up && player1.y > 0) {
                player1.y = player1.y - paddleSpeed;
            } else if (player1Down && player1.y + player1.height < HEIGHT) {
                player1.y = player1.y + paddleSpeed;
                //move player 2
            } else if (player2Up && player2.y>0) {
                player2.y = player2.y - paddleSpeed;
            } else if (player2Down && player2.y + player2.height < HEIGHT) {
                player2.y = player2.y + paddleSpeed;
            }
            //did the ball hit paddle 1
            if (ball.intersects(player1)){
                ballXDirection= ballXDirection* -1;
            }
        
            //did the ball hit player 2
            if (ball.intersects(player2)){
                 ballXDirection= ballXDirection* -1;
            }
            
            //ball hit left side of screen
            if(ball.x< 0){
            player2Score++;    
            
                ball.x = WIDTH/2 - ball.width/2;
                ball.y = HEIGHT/2 - ball.height/2;
            }

            //ball hit right side of screen
            if(ball.x + ball.width > WIDTH){
                player1Score++;
            
                ball.x = WIDTH/2 - ball.width/2;
                ball.y = HEIGHT/2 - ball.height/2;
                ballXDirection = ballXDirection* -1;
            }
            if(player1Score ==10){
                done = true;
            }
            if(player2Score ==10){
                done = true;
            }
            // GAME LOGIC ENDS HERE 

            // update the drawing (calls paintComponent)

            repaint();


            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE

            // USING SOME SIMPLE MATH

            deltaTime = System.currentTimeMillis() - startTime;

            try {

                if (deltaTime > desiredTime) {

                    //took too much time, don't wait

                    Thread.sleep(1);

                } else {

                    // sleep to make up the extra time

                    Thread.sleep(desiredTime - deltaTime);

                }

            } catch (Exception e) {
            }

        }

    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();
            //determine which key it is
            if (key == KeyEvent.VK_W) {
                player1Up = true;
            } else if (key == KeyEvent.VK_S) {
                player1Down = true;
            } else if (key == KeyEvent.VK_UP) {
                player2Up = true;
            } else if (key == KeyEvent.VK_DOWN) {
                player2Down = true;
            }

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

            int key = e.getKeyCode();
            //determine which key it is
            if (key == KeyEvent.VK_W) {
                player1Up = false;
            } else if (key == KeyEvent.VK_S) {
                player1Down = false;
            } else if (key == KeyEvent.VK_UP) {
                player2Up = false;
            } else if (key == KeyEvent.VK_DOWN) {
                player2Down = false;

            }
        }
    }

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        // creates an instance of my game

        Pong game = new Pong();



        // starts the game loop

        game.run();

    }
}
