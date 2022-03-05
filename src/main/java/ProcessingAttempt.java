import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingAttempt extends PApplet {

    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    public List<Ball> balls = new ArrayList<>();
    public int ballsCount = 4;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        initializingBalls();
    }

    private void initializingBalls() {
        int diameter = 10;
        int posX = 0;
        for(int ballsIdx = 0; ballsIdx < ballsCount ; ballsIdx++){
            Ball newBall = new Ball(diameter, posX, getPosY(ballsIdx), getSpeed(ballsIdx));
            balls.add(newBall);
        }
    }

    private int getSpeed(int ballsIdx) {
        return ballsIdx + 1;
    }

    private int getPosY(int ballsIdx) {
        return HEIGHT * (ballsIdx + 1) / 5;
    }


    @Override
    public void draw() {
        for(int ballsIdx = 0 ; ballsIdx < ballsCount ; ballsIdx++){
            Ball ball = balls.get(ballsIdx);
            drawBall(ball);
            moveBall(ball);
        }
    }

    private void moveBall(Ball ball) {
        ball.moveHorizontallyBy(1);
    }

    private void drawBall(Ball ball) {
        ellipse(ball.getPosX(), ball.getPosY(), ball.getDiameter(), ball.getDiameter());
    }


}
