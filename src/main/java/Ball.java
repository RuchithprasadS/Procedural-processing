public class Ball {
    private int diameter;
    private int posX;
    private int posY;
    private int speed;

    public Ball(int diameter, int posX,int posY,int speed){
        this.diameter = diameter;
        this.posX = posX;
        this.posY = posY;
        this.speed = speed;
    }

    public int getDiameter(){
        return  diameter;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int moveHorizontallyBy(int units){
        this.posX += (units * speed);
        return this.posX;
    }

    public int moveVerticallyBy(int units){
        this.posY += (units * speed);
        return this.posY;
    }

}

