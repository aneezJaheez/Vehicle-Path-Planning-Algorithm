package environment;

import java.awt.*;

import environment.MapConstants.IMAGE_DIRECTION;

/**
 * This class represents the obstacles with picture in the arena
 */
public class Obstacle {
    private int imageId;
    private IMAGE_DIRECTION imageDirection;
    private Point centerCoordinate;

    public Obstacle(int x, int y, int imageId, IMAGE_DIRECTION imageDirection) {
        this.imageDirection = imageDirection;
        this.centerCoordinate = new Point(x, y);
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public IMAGE_DIRECTION getImageDirection() {
        return imageDirection;
    }

    public int getImadeDirectionAngle() {
        int degree;
        switch (imageDirection) {
            case EAST:
                degree = 0;
                break;
            case NORTH:
                degree = 90;
                break;
            case WEST:
                degree = 180;
                break;
            case SOUTH:
                degree = 270;
                break;
            default:
                degree = 0;
                break;
        }
        return degree;
    }

    public Point getCenterCoordinate() {
        return centerCoordinate;
    }

    public Point getBottomLeftCoordinate() {
        return new Point(centerCoordinate.x - MapConstants.OBSTACLE_WIDTH / 2, centerCoordinate.y - MapConstants.OBSTACLE_WIDTH / 2);
    }

    public int getX() {
        return centerCoordinate.x;
    }

    public int getY() {
        return centerCoordinate.y;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setImageDirection(IMAGE_DIRECTION imageDirection) {
        this.imageDirection = imageDirection;
    }

    public void setCenterCoordinate(Point centerCoordinate) {
        this.centerCoordinate = centerCoordinate;
    }
}
